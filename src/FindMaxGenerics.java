public class FindMaxGenerics<T extends Comparable<T>>{

    T x,y,z;

    public FindMaxGenerics(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum(){
        return FindMaxGenerics.maximum(x,y,z);
    }

    public static <T extends Comparable<T>> T maximum(T x,T y,T z)
    {

        T max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        printMax(x,y,z,max);

        return max;


    }


    public static <T> void printMax(T x,T y,T z,T max){
        System.out.println("Max is: "+max);
    }

    public static void main(String args[]){
        Integer xInt=3,yInt=8,zInt=7;
        Float xF1=4.4f,yF1=5.1F,zF1=2.1F;
        String xStr="ruchi",yStr="ravindra",zStr="mandve";

        new FindMaxGenerics(xInt,yInt,zInt).maximum();
        new FindMaxGenerics(xF1,yF1,zF1).maximum();
        new FindMaxGenerics(xStr,yStr,zStr).maximum();

    }

}
