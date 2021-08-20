public class FindMaxGenerics<T extends Comparable<T>>{

    T x,y,z,a;

    public FindMaxGenerics(T x, T y, T z,T a) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.a=  a;
    }

    public T maximum(){
        return FindMaxGenerics.maximum(x,y,z,a);
    }

    public static <T extends Comparable<T>> T maximum(T x,T y,T z,T a)
    {

        T max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        if (a.compareTo(max)>0)
            max=a;

        printMax(x,y,z,max);

        return max;


    }


    public static <T> void printMax(T x,T y,T z,T max){
        System.out.println("Max is: "+max);
    }

    public static void main(String args[]){
        Integer xInt=3,yInt=8,zInt=7,aInt=12;
        Float xF1=4.4f,yF1=5.1F,zF1=2.1F,aF1=1.1f;
        String xStr="ruchi",yStr="ravindra",zStr="mandve",aStr="pratibha";

        new FindMaxGenerics(xInt,yInt,zInt,aInt).maximum();
        new FindMaxGenerics(xF1,yF1,zF1,aF1).maximum();
        new FindMaxGenerics(xStr,yStr,zStr,aStr).maximum();

    }

}
