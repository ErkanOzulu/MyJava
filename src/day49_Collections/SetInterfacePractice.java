package day49_Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {


        List<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(null,null,null));

        //it accepts null value but when we sorted it gives us nullPointerException
       // Collections.sort(list);
        System.out.println("list = " + list);
        System.out.println("list.get(4) = " + list.get(4));



        Set<Integer>hashSet=new HashSet<>();

        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(null,null,null));
        System.out.println("hashSet = " + hashSet);
        //insertion order not preserved, random order
        // duplicates are not allowed, Accepts null values
        //System.out.println(hashSet.get(4)); set doesn't have index, so it doesn't have get method



        Set<Integer>linkedHashSet=new LinkedHashSet<>();
        //it keeps the insertion order, child class of HashSet class
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(null,null,null));
        System.out.println("linkedHashSet = " + linkedHashSet);


        Set<Integer>treeSet=new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
     //treeSet.addAll(Arrays.asList(null,null,null));
        System.out.println("treeSet = " + treeSet);

        //it doesn't accept null values.it gives nullPointer exception.And very slow.
        //it allows sorted(Ascending) order.It implements SortedSet

        //String str=null;
       // System.out.println("str.charAt(0) = " + str.charAt(0));

    }
}
