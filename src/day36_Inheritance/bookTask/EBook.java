package day36_Inheritance.bookTask;

public class EBook extends Book {

    private int pages;
    private String size;

    public void setInfo(String title, String type, String author, double price,String size, int pages) {
        setInfo(title,type,author,price);
        setSize(size);
        setPages(pages);
    }


    public String getSize() {
        return size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void readBook(){
        System.out.println("reading "+getTitle());
    }

    public String toString() {
        return "EBook{" +
                "title='" + getTitle() + '\'' +
                ", type='" + getType() + '\'' +
                ", author='" +getAuthor() + '\'' +
                ", price=" + getPrice() +
                ",pages=" + pages +
                ", size='" + size + '\'' +
                '}';
    }
}
