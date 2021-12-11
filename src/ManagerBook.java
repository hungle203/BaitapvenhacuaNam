
import java.time.LocalDate;
import java.util.Scanner;


public class ManagerBook {

    public static void displayListBook(Book[] booksList) {
        for (Book b : booksList) {
            System.out.println(b);

        }
    }

    public static ScienceBook createScienceBook(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nhập tên sách: ");
        String name = scanner.nextLine();
        System.out.println("Nhập thể loại");
        String type = scanner.nextLine();
        System.out.println("Nhập giá tiền: ");
        double price = scanner.nextDouble();
        System.out.println("Nhập số lượng");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập ngày xuất bản YY/MM/DD: ");
        LocalDate date = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();
        return new ScienceBook(name, price, quantity, date, type);
    }

    public static Novel createNovel(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nhập tên sách : ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá tiền : ");
        double price = scanner.nextDouble();
        System.out.println("Nhập số lượng : ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập ngày xuất bản YY/MM/DD: ");
        LocalDate date = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhập tác giả : ");
        String author = scanner.nextLine();
        return new Novel(name, price, quantity, date, author);
    }

    public static double totalPriceBook(Book[] lists) {
        double totalPrice = 0;
        for (Book book : lists) {
            totalPrice += book.getPrice() * book.getQuantity();
        }
        return totalPrice;
    }

    public static void findMaxPrice(Book[] lists) {
        double findMax = lists[0].getPrice();
        int index = 0;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i].getPrice() > findMax) {
                findMax = lists[i].getPrice();
                index = i;
            }
        }
        System.out.println(lists[index]);
    }


    public static void findLowestPrice(Book[] lists) {
        double minPrice = lists[0].getPrice();
        int index = 0;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i].getPrice() < minPrice) {
                minPrice = lists[i].getPrice();
                index = i;
            }
        }
        System.out.println(lists[index]);
    }

    public static void createListBook(Scanner scanner, Book[] lists) {
        for (int i = 0; i < lists.length; i++) {
            System.out.println("Nhập vào thể loại thứ " + (i + 1));
            System.out.println("1. Sách khoa học");
            System.out.println("2. Sách tiểu thuyết");

            int type = scanner.nextInt();
            if (type == 1) {
                lists[i] = createScienceBook(scanner);
            }else if (type == 2){
                lists[i] = createNovel(scanner);
            }else {
                System.out.println("Không có thể loại này!!");
            }
        }
    }
    public static void findBook(Scanner scanner,Book[] lists) {
        System.out.println("Nhập thể loại muốn tìm: ");
        String type = scanner.nextLine();
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] instanceof ScienceBook ) {
                if((((ScienceBook) lists[i]).getType().equals(type))) {
                    System.out.println(lists[i]);
                }
            }
        }

    }

    public static void findAuthorBook(Scanner scanner, Book[] lists) {
        System.out.println("Nhập tác giả muốn tìm: ");
        String author = scanner.nextLine();
        for (int i = 0; i < lists.length ; i++) {
            if (lists[i] instanceof Novel) {
                if ((((Novel) lists[i]).getAuthor().equals(author))) {
                    System.out.println(lists[i]);
                }
             }
        }
    }

    public static double averageUnitPrice (Book[] lists) {
        double sumScience = 0;
        double count = 0;

        for (int i = 0; i < lists.length ; i++) {
            if (lists[i] instanceof ScienceBook) {
                sumScience += lists[i].getPrice();
                count++;
            }
        }
        return (sumScience/count);
    }

}