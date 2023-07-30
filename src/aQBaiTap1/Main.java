package aQBaiTap1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            ManagerProduct productManager = new ManagerProduct();
            boolean check = true;
            while (check) {
                System.out.println("===== Product Management System =====");
                System.out.println("1. Add category");
                System.out.println("2. Edit category");
                System.out.println("3. Add product");
                System.out.println("4. Edit product");
                System.out.println("5. Display category");
                System.out.println("6. Display Product");
                System.out.println("7. Lowest Price Products and Most expensive price");
                System.out.println("8. Search for product by name");
                System.out.println("9. Search for product by price");
                System.out.println("0. Exit");
                System.out.print("You choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        productManager.addCategory();
                        break;
                    case 2:
                        productManager.editCategory();
                        break;
                    case 3:
                        productManager.addProduct(productManager.returnId());
                        break;
                    case 4:
                        productManager.editProduct(productManager.returnId());
                    case 5:
                        productManager.showCategory();
                        break;
                    case 6:
                        productManager.showProduct(productManager.returnName());
                        break;
                    case 7:
                        productManager.displayMaxMin(productManager.maxPrice(),productManager.minPrice());
                        break;
                    case 8:
                        productManager.searchName();
                        break;
                    case 9:
                        productManager.searchPrice();
                        break;
                    case 0:
                        check = false;
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("error, please re-enter");
        }
    }
}
