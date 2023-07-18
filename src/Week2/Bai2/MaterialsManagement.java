package Week2.Bai2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaterialsManagement implements Discount {
    List<Material> listDiscount = new ArrayList<>();

    public MaterialsManagement() {
        Material crispyFlour1 = new CrispyFlour(0, "CrispyFlour1",
                LocalDate.of(2023, 07, 15), 20000, 100);
        listDiscount.add(crispyFlour1);
        Material crispyFlour2 = new CrispyFlour(1, "CrispyFlour2",
                LocalDate.of(2023, 07, 15), 25000, 100);
        listDiscount.add(crispyFlour2);
        Material crispyFlour3 = new CrispyFlour(2, "CrispyFlou3",
                LocalDate.of(2023, 07, 15), 17000, 100);
        listDiscount.add(crispyFlour3);
        Material crispyFlour4 = new CrispyFlour(3, "CrispyFlour4",
                LocalDate.of(2023, 07, 15), 23000, 100);
        listDiscount.add(crispyFlour4);
        Material crispyFlour5 = new CrispyFlour(4, "CrispyFlour5",
                LocalDate.of(2023, 07, 15), 19000, 100);
        listDiscount.add(crispyFlour5);
        Material meat1 = new Meat(5, "meat1",
                LocalDate.of(2023, 07, 15), 50000, 25.000);
        listDiscount.add(meat1);
        Material meat2 = new Meat(6, "meat2",
                LocalDate.of(2023, 07, 15), 55000, 30.000);
        listDiscount.add(meat2);
        Material meat3 = new Meat(7, "meat3",
                LocalDate.of(2023, 07, 15), 60000, 35.000);
        listDiscount.add(meat3);
        Material meat4 = new Meat(8, "meat4",
                LocalDate.of(2023, 07, 15), 65000, 28.000);
        listDiscount.add(meat4);
        Material meat5 = new Meat(9, "meat5",
                LocalDate.of(2023, 07, 15), 80000, 45.000);
        listDiscount.add(meat5);
    }

    private Scanner input = new Scanner(System.in);

    public void addProduct() {
        int check = 9;
        System.out.println("Bạn muốn thêm mấy sản phẩm");
        int length = Integer.parseInt(input.nextLine());
        for (int i = 0; i < length; i++) {
            System.out.println("Bạn muốn thêm sản phẩm nào");
            System.out.println("Thêm bột nhấp 1, thêm thịt nhấp 2");
            int choice = Integer.parseInt(input.nextLine());
            if (choice == 1) {
                System.out.println("Nhập tên");
                String nameCrispyFlour = input.nextLine();
                System.out.println("Nhập ngày sản xuất");
                String date = input.nextLine();
                String[] arr = date.split("/");
                int year = Integer.parseInt(arr[2]);
                int month = Integer.parseInt(arr[1]);
                int day = Integer.parseInt(arr[0]);
                System.out.println("Nhập giá");
                int costCrispyFlour = Integer.parseInt(input.nextLine());
                System.out.println("Nhập số lượng");
                int quantityCrispyFlour = Integer.parseInt(input.nextLine());
                Material crispyFlour = new CrispyFlour(check++, nameCrispyFlour, LocalDate.of(year, month, day), costCrispyFlour, quantityCrispyFlour);
                listDiscount.add(crispyFlour);
            } else if (choice == 2) {
                System.out.println("Nhập tên");
                String nameMeat = input.nextLine();
                System.out.println("Nhập ngày sản xuất");
                String date = input.nextLine();
                String[] arr = date.split("/");
                int year = Integer.parseInt(arr[2]);
                int month = Integer.parseInt(arr[1]);
                int day = Integer.parseInt(arr[0]);
                System.out.println("Nhập giá");
                int costMeat = Integer.parseInt(input.nextLine());
                System.out.println("Nhập cân nặng");
                int weightMeat = Integer.parseInt(input.nextLine());
                Material meat = new Meat(check++,nameMeat,LocalDate.of(year, month, day),costMeat,weightMeat);
                listDiscount.add(meat);
            }
        }
        System.out.println("---------------------------------");
        showProduct();
    }

    public void showProduct() {
        for (Material check : listDiscount) {
            System.out.println("Tất cả sản phẩm " + check);
        }
    }

    public void editProduct() {
        showProduct();
        System.out.println("Nhập id sản phẩm bạn muốn sửa");
        int id = Integer.parseInt(input.nextLine());
        for (int i = 0; i < listDiscount.size(); i++) {
            if (id == listDiscount.get(i).getId()) {
                if(listDiscount.get(i) instanceof Meat ){
                    System.out.println("Nhập tên");
                    String nameMeat = input.nextLine();
                    System.out.println("Nhập ngày sản xuất");
                    String date = input.nextLine();
                    String[] arr = date.split("/");
                    int year = Integer.parseInt(arr[2]);
                    int month = Integer.parseInt(arr[1]);
                    int day = Integer.parseInt(arr[0]);
                    System.out.println("Nhập giá");
                    int costMeat = Integer.parseInt(input.nextLine());
                    System.out.println("Nhập cân nặng");
                    int weightMeat = Integer.parseInt(input.nextLine());
                    listDiscount.get(i).setName(nameMeat);
                    listDiscount.get(i).setCost(costMeat);
                    listDiscount.get(i).setManufacturingDate(LocalDate.of(year,month,day));
                    ((Meat) listDiscount.get(i)).setWeight(weightMeat);
                }else {
                    System.out.println("Nhập tên");
                    String nameCrispyFlour = input.nextLine();
                    System.out.println("Nhập ngày sản xuất");
                    String date = input.nextLine();
                    String[] arr = date.split("/");
                    int year = Integer.parseInt(arr[2]);
                    int month = Integer.parseInt(arr[1]);
                    int day = Integer.parseInt(arr[0]);
                    System.out.println("Nhập giá");
                    int costCrispyFlour = Integer.parseInt(input.nextLine());
                    System.out.println("Nhập số lượng");
                    int quantityCrispyFlour = Integer.parseInt(input.nextLine());
                    listDiscount.get(i).setName(nameCrispyFlour);
                    listDiscount.get(i).setCost(costCrispyFlour);
                    listDiscount.get(i).setManufacturingDate(LocalDate.of(year, month, day));
                    ((CrispyFlour)listDiscount.get(i)).setQuantity(quantityCrispyFlour);
                }

            }
        }

    }
    public void deleteProduct(){
        showProduct();
        System.out.println("Nhập id sản phẩm bạn muốn sửa");
        int id = Integer.parseInt(input.nextLine());
        for (int i = 0; i < listDiscount.size(); i++) {
            if(id == listDiscount.get(i).getId()){
                listDiscount.remove(listDiscount.get(i));
                System.out.println("Xoa thanh cong");
            }
        }
    }
    @Override
    public double getRealMoney(){
        double total = 0;
        for (Material obj: listDiscount){
            if(obj instanceof Meat){
                if(obj.getExpiryDate().getDayOfMonth() - LocalDate.now().getDayOfMonth() <= 5){
                    total += obj.getCost() * 30/100;
                }else {
                    total += obj.getCost() * 10/100 ;
                }
            }else {
                Period period = Period.between(LocalDate.now(), obj.getManufacturingDate());
                if(period.getMonths() <= 4 && period.getMonths() > 2){
                    total += obj.getCost() * 20/100;
                }else if(period.getMonths() <= 2){
                    total += obj.getCost() * 40/100;
                }else {
                    total += obj.getCost() * 5/100;
                }
            }
        }
        return total;
    }
}
