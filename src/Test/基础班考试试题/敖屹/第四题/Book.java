package Test.基础班考试试题.敖屹.第四题;

public class Book {
    private String name;
    private String auther;
    private String publisher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Book(String name, String auther, String publisher) {

        this.name = name;
        this.auther = auther;
        this.publisher = publisher;
    }

    public Book() {

    }
}
