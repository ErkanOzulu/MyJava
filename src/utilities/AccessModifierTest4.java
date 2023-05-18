package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifierTest4 extends ProtectedAccessModifier {
    public static void main(String[] args) {


       // System.out.println(AccessModifierTest4.name1);

        System.out.println(AccessModifierTest4.name2); // protected access modifier is not always visible outside package but only subclass


        AccessModifierTest4.method2();


    }
}
