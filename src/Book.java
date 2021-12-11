import java.time.LocalDate;

public class Book {
    private String name;
    private double price;
    private int quantity;
    private LocalDate dateManufacture;

    public Book() {
    }

    public Book(String name, double price, int quantity, LocalDate dateoManufacture) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.dateManufacture = dateManufacture;
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

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDateManufacture() {
        return dateManufacture;
    }

    public void setDateManufacture(LocalDate dateManufacture) {
        this.dateManufacture = dateManufacture;
    }

    @Override
    public String toString() {
        return "Tên sản phẩm " + getName()
                + ", Giá sản phẩm " + getPrice()
                + ", Số lượng sản phẩm " + getQuantity()
                + ", Ngày sản xuất bản " + dateManufacture
                +".";
    }
}
