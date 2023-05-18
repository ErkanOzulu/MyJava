package day09_IfStatements;

public class LearnToOS {
    public static void main(String[] args) {
        String brand = "Mac",
                os;

        if (brand == "Mac") {
            os = "MacOS";
        } else if (brand == "Lenova") {
            os = "Windows";
        } else if (brand == "Iphone") {
            os = "IOS";
        } else {
            os = "Android";
        }
        System.out.println("Your operating system is  " + os);

    }
}
