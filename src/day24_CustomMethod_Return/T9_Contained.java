package day24_CustomMethod_Return;

public class T9_Contained {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7};
       int  num = 3;

        isContained(arr,num);

    }
public static boolean isContained(int []arr, int a){
String str="";

    for (int each : arr) {
        str+=each;
    }
    boolean isContained =str.contains(""+a);
    System.out.println(isContained);
    return isContained;

}
}
/**
9. Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
 */