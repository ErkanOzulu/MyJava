package day22MultiDimensionalArray;


import java.util.*;

class Zombimy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.


        int[] temp = {0, 0, 0, 0, 0, 0, 0, 0};

        int d = 0;

        System.out.println("Day " + d + Arrays.toString(inhabitants));

        int[] noLive = new int[10];
        noLive[0] = 1;
        noLive[1] = 1;
        noLive[9] = 1;

        for (int i = 2, j = 0; i < noLive.length - 1; i++, j++) {
            noLive[i] = inhabitants[j];
        }



            int i = 1;
            int j = 2;
            while (!(Arrays.equals(noLive, temp))) {
                i++;
                j++;
                if (inhabitants[0] == 0) {
                    inhabitants[1] = inhabitants[1] / 2;
                }
                if ((inhabitants[inhabitants.length - 1] == 0) && (inhabitants[inhabitants.length - 3] != 0)) {
                    inhabitants[inhabitants.length - 2] = inhabitants[inhabitants.length - 2] / 2;
                }

                if ((inhabitants[i] == 0 && noLive[j - 2] != 0)) {
                    inhabitants[i + 1] = inhabitants[i + 1] / 2;
                    inhabitants[i - 1] = inhabitants[i - 1] / 2;

                } else if ((inhabitants[i] == 0 && noLive[j - 2] == 0)) {
                    inhabitants[i + 1] = inhabitants[i + 1] / 2;
                }

                System.out.println("Day " + d++ + Arrays.toString(inhabitants));
                }
            for (int m= 2, k = 0; m < noLive.length - 1; m++, k++) {
                noLive[m] = inhabitants[k];
            }
        if ((Arrays.equals(inhabitants, temp))) {
            System.out.println("---- EXTINCT ----");
        }
            }


        }







/*
Day 5[0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----
 */

