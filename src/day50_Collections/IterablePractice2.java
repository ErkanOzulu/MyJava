package day50_Collections;

import java.util.*;

public class IterablePractice2 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        //remove all the names "ahmed"


//        names.removeAll(Arrays.asList("ahmed")); it removes only "ahmed"s but doesn't remove "Ahmed","aHmed" like this
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {

            if (it.next().equalsIgnoreCase("ahmed")) {
                it.remove();
            }
        }

        System.out.println(names);

        System.out.println("---------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        for (Iterator<String> it2=names2.iterator();it2.hasNext();) {
            if(it2.next().equalsIgnoreCase("Ahmed")){
                it2.remove();
        }
        }

        System.out.println(names2);
        System.out.println("---------------------------------------");

        List<String> names3 = new ArrayList<>();
        names3.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        names3.removeIf(p-> p.equalsIgnoreCase("ahmed"));
        System.out.println(names3);

        System.out.println("-------------------------------------------");

        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,100, 90, 89, 79, 50));

        Iterator<Integer> q = set.iterator();

        while(q.hasNext()){
            if(q.next() %2 ==0){
                q.remove();
            }
        }

        System.out.println(set);



    }

}

