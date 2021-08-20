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
    public static void main(String[] args) {
        Integer[] intArray={4,7,1};
        int maxnumint=Findmax(intArray);
        System.out.println("Max Integer is: "+maxnumint);


    }
}
