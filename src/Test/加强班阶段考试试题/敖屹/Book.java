package Test.加强班阶段考试试题.敖屹;

public class Book {

    private String bookName;
    private Double price;
    private Integer count;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Book() {

    }

    public Book(String bookName, Double price, Integer count) {

        this.bookName = bookName;
        this.price = price;
        this.count = count;
    }

    @Override
    public String toString() {
        return bookName + ",共计" + price * count + "元";
    }
}
