package day36_Inheritance.bookTask;

public class BookShop {
    public static void main(String[] args) {
        AudioBook audioBook=new AudioBook();
        Book d=new Book();

        audioBook.setInfo("Alice","Adventure","Tomdd",10.5,10,"Asdfj");
        audioBook.listen();
        EBook eBook=new EBook();
        eBook.setInfo("Dream World","Action","W.S",12,"Medium",130);

        System.out.println(eBook);

        System.out.println(audioBook);

        System.out.println(d);
    }

}
