package day38_Inheritance.replitBookShelf;

public class Object {
    public static void main(String[] args) {
        Shelf.addBook(5,"ironMAN xSv mArufJon temirov","the Chronicles OF TrumP",234);

        Shelf.addBook(2,"Erkan","Harry Porter",500);

        System.out.println(Shelf.isIDUnique(2));
        System.out.println(Shelf.findBookByPartialTitle("Harry"));


        System.out.println(Book.getUnknownAuthors());


        System.out.println(Shelf.getTheBooks());
        System.out.println(Shelf.isShelfEmpty());
        System.out.println(Shelf.getTitleByID(2));

        System.out.println(Book.isTitleWord("Christopher Paolini"));

     Book book = new Book();
     book.setId(7);

        Shelf.clearBookShelf();
        System.out.println(Shelf.isShelfEmpty());



    }
}
