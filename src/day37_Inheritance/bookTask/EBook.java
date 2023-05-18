package day37_Inheritance.bookTask;

public class EBook extends Book {

    private String size;
    private int pages;

    public EBook(String title, String type, String author, double price, String size,int pages) {
        super(title, type, author, price);
        setPages(pages);
        setSize(size);

    }


    public String getSize() {
        return size;
    }

    public int getPages() {
        return pages;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void readBook(){
        System.out.println("reading "+getTitle());
    }

    public String toString() {
        return "EBook{" +
                "title='" + getTitle() + '\'' +
                ", type='" + getType() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price=" + getPrice() +
                ",size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }
}
/*
3.2 Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()
 */