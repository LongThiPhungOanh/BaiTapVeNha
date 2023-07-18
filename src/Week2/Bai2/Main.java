package Week2.Bai2;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int choice;
       MaterialsManagement materialsManagement = new MaterialsManagement();
       do {
           System.out.println("Nhấn 1 để thêm");
           System.out.println("Nhấn 2 để thêm");
           System.out.println("Nhấn 3 để xóa");
           System.out.println("Nhấn 4 để xem tổng tiền sau chiết khấu");
           System.out.println("Nhấn 0 để thoát");
           choice = scanner.nextInt();
           switch (choice){
               case 1:
                   materialsManagement.addProduct();
                   break;
               case 2:
                   materialsManagement.editProduct();
                   break;
               case 3:
                   materialsManagement.deleteProduct();
                   break;
               case 4:
                   materialsManagement.Money();
                   break;
           }
       } while (choice != 0);{

       }
    }
}
