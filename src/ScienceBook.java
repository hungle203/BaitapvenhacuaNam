import java.time.LocalDate;


public class ScienceBook extends Book {
    private String type;

    public ScienceBook() {
    }

    public ScienceBook(String name, double price, int quantity, LocalDate dateManufacture, String type) {
        super(name, price, quantity, dateManufacture);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ScienceBook { name=" + getName() +
                ", Giá là=" + getPrice() +
                ", Số lượng=" + getQuantity() +
                ", Ngày sản xuất=" + getDateManufacture() +
                 ", Thể loại=" + type + "}";
    }
}