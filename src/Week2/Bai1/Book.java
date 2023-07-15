package Week2.Bai1;

public class Book {
   private Integer bookCode;
   private String name;
   private double price;
   private String author;
    public Integer getBookCode() {
        return bookCode;
    }
    public void setBookCode(Integer bookCode) {
        this.bookCode = bookCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Book() {
    }
    public Book(Integer bookCode, String name, double price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }
}
