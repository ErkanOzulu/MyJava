package day37_Inheritance.bookTask;

public class BookShop {
    public static void main(String[] args) {
        AudioBook audioBook=new AudioBook("Alice","Adventure","Tomdd",10.5,10,"Asdfj");
        EBook eBook=new EBook("Dream World","Action","W.S",12,"Medium",130);

        eBook.readBook();
        audioBook.listen();

        System.out.println(eBook);
        System.out.println(audioBook);


    }
}
