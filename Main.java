import java.util.*;

public class Main {

    public static void add(int... arr) {
        for(int item : arr){
            System.out.println(item);
        }

    }

    public static void main(String[] args) {
       add(2,3,4);
    }

}

class Book {
    private long id;
    private String author;
    private String bookName;
    private int noOfPages;

    Book(long id, String author, String bookName, int noOfPages) {
        this.id = id;
        this.author = author;
        this.bookName = bookName;
        this.noOfPages = noOfPages;
    }

    @Override
    public String toString() {
        return "id, " + id + " author, " + author + " bookName, " + bookName + " noOfPages, " + noOfPages;
    }

}
