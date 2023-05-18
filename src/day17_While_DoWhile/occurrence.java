package day17_While_DoWhile;

public class occurrence {
    public static void main(String[] args) {
//Find the number of occurrence of "" in ""
        String str = "java";
        String sentence = "I learn java, but java is not javascript, java is fun";
        int index = 0;
        int occurrence = 0;
        while ( sentence.indexOf(str, index) > -1 ) {
            occurrence++;
            index = sentence.indexOf(str, index) + 1;
        }
        System.out.println( occurrence );
//--------------------------------------------------------
          int occurrence2 = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if ( sentence.indexOf(str, i) > -1) {
                occurrence2++;
                i = sentence.indexOf(str, i);
            }
        }
        System.out.println( occurrence2 );
    }
}


