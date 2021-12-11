import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng sách muốn in");
        int size = scanner.nextInt();
        Book[] bookLists = new Book[size];

        int choice = -1;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter");
        while (choice!=0) {
            System.out.println("1. Tạo danh sách");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tổng giá là");
            System.out.println("4. Tìm cuốn sách có giá tiền cao nhất");
            System.out.println("5. Tìm cuốn sách có giá tiền thấp nhất");
            System.out.println("6. tìm sách theo thể loại");
            System.out.println("7. Tìm sách theo tên tác giả");
            System.out.println("8. Tính đơn giá trung bình của sách khoa học");
            System.out.println("0. Exit");
            System.out.println("Chọn");
            choice = scanner1.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("______________________ ");
                    ManagerBook.createListBook(scanner,bookLists);
                break;
                case 2:
                    System.out.println("______________________ ");
                    ManagerBook.displayListBook(bookLists);
                    break;
                case 3:
                    System.out.println("______________________ ");
                    System.out.println("Tổng giá tất cả sách là = "  + ManagerBook.totalPriceBook(bookLists));
                    break;
                case 4:
                    System.out.println("______________________ ");
                    System.out.println("Giá sách cao nhất là:");
                    ManagerBook.findMaxPrice(bookLists);
                    break;
                case 5:
                    System.out.println("______________________ ");
                    System.out.println("Giá sách thấp nhất là:");
                    ManagerBook.findLowestPrice(bookLists);
                    break;
                case 6:
                    System.out.println("______________________ ");
                    System.out.println("Cuốn sách bạn tìm là ");
                    ManagerBook.findBook(scanner,bookLists);
                    break;
                case 7:
                    System.out.println("______________________ ");
                    System.out.println("Cuốn sách bạn muốn tìm là ");
                    ManagerBook.findAuthorBook(scanner,bookLists);
                    break;
                case 8:
                    System.out.println("______________________ ");
                    System.out.println("Đơn giá trung bình của sách khoa học là " + ManagerBook.averageUnitPrice(bookLists));
                    break;
                case 0:
                    System.exit(0);

            }
        }

    }
}
