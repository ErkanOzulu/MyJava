package day24_CustomMethod_Return;

public class T5_Frequency {
    public static void main(String[] args) {
        int[] array ={1,1,1,1,1,2,2};
        int num=1;
        frequency(array,num);
    }
    public static int frequency(int[]a, int b){


        int count=0;

        for (int each : a) {
            if (each==b){
                count++;
            }
        }
        System.out.println("Frequency of "+b+" is "+count);
        return count;
    }

}
/**    5. create method that accepts one integer array and one integer number and returns the frequency of the number

 Ex:
 int[] array ={1,1,1,1,1,2,2};

 frequency(array, 1) ==> 5
*/