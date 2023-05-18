package day22MultiDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class zombi2 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
            input.close();
            int []boo={0,0,0,0,0,0,0,0};
            int j=0;
            boolean population=true; //TODO. Write you code below this line.
            System.out.println("Day "+j+" "+ Arrays.toString(inhabitants));
            while(inhabitants[0]!=0||inhabitants[7]!=0){
                for(int i=0;i<7;i++){
                    if(inhabitants[i]==0){
                        if(i-1>0&&inhabitants[i-1]!=0)
                            inhabitants[i-1]-=
                                    (inhabitants[i-1]/2.0);
                        if(i-1==0)
                            inhabitants[i-1]-=
                                    (inhabitants[i-1]/2.0);
                        if(i+1<7&&inhabitants[i+1]!=0){
                            inhabitants[i+1]-=(inhabitants[i+1]/2.0);
                            if(inhabitants[i+1]==0)
                                break;}
                        if(i+1==7)
                            inhabitants[i+1]-=(inhabitants[i+1]/2.0);
                    }
                }j++;
                System.out.println("Day "+j+" "+Arrays.toString(inhabitants));


            }
            System.out.println("---- EXTINCT ----");



        }
}
