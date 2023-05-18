package day37_Inheritance.bookTask;

public class AudioBook extends Book {

    private int length;
    private String narratov;

    public AudioBook(String title, String type, String author, double price, int length, String narratov) {
        super(title, type, author, price);
        setLength(length);
        setNarratov(narratov);
    }

    public int getLength() {
        return length;
    }

    public String getNarratov() {
        return narratov;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setNarratov(String narratov) {
        this.narratov = narratov;
    }

    public void listen(){
        System.out.println("listening "+getTitle());
    }


    public String toString() {
        return "AudioBook{" +
                "title='" + getTitle() + '\'' +
                ", type='" + getType() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price=" + getPrice() +
                "length=" + length+
                ", narratov='" + narratov + '\'' +
                '}';
    }
}


