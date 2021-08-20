public class FindMaxGenerics{

    public static <T extends Comparable<T>> T findmax(T[] array)
    {
        T max = array[0];

        if (array[1].compareTo(max) > 0)
            max = array[1];

        if (array[2].compareTo(max) > 0)
            max = array[2];

        return max;


    }

    public static void main(String[] args) {

        Integer[] intArray={4,7,1};
        Float[] floatArray={4.5f,5.0f,6.2f};
        String[] stringArray={"Ruchi","Ravindra","Mandve"};

        System.out.println(findmax(intArray));
        System.out.println(findmax(floatArray));
        System.out.println(findmax(stringArray));


    }
}
