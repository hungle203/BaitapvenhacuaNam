import java.time.LocalDate;

public class Novel extends Book {

    private String author;

    public Novel() {
    }

    public Novel(String name, double price, int quantity, LocalDate dateManufacture, String author) {
        super(name, price, quantity, dateManufacture);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "NovelBook { name=" + getName() +
                ", Giá= " + getPrice() +
                ", Số lượng= " + getQuantity() +
                ", Ngày sản xuất= " + getDateManufacture() +
                ", Tác giả =" + author + "}";
    }
}
