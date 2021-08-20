import com.sun.xml.internal.fastinfoset.util.StringArray;

public class FindMaxOfThree {

    public static int Findmax(Integer[] intArray){
        int max=intArray[0];
        if(intArray[1].compareTo(max)>0)
        {
            max=intArray[1];
        }
        if (intArray[2].compareTo(max)>0)
        {
            max=intArray[2];
        }
        return max;

    }

    public static float Findmax1(Float[] floatArray){
        float max=floatArray[0];
        if(floatArray[1].compareTo(max)>0)
        {
            max=floatArray[1];
        }
        if (floatArray[2].compareTo(max)>0)
        {
            max=floatArray[2];
        }
        return max;

    }

    public static String Findmax2(String[] stringArray){
        String max=stringArray[0];
        if(stringArray[1].compareTo(max)>0)
        {
            max=stringArray[1];
        }
        if (stringArray[2].compareTo(max)>0)
        {
            max=stringArray[2];
        }
        return max;

    }

    public static void main(String[] args) {
        Integer[] intArray={4,7,1};
        Float[] floatArray={4.5f,5.0f,6.2f};
        String[] stringArray={"Ruchi","Ravindra","Mandve"};


        int maxnumint=Findmax(intArray);
        System.out.println("Max Integer is: "+maxnumint);

        float maxnumfloat=Findmax1(floatArray);
        System.out.println("Max Float is: "+maxnumfloat);

        String maxString=Findmax2(stringArray);
        System.out.println("Max String is: "+maxString);


    }
}
