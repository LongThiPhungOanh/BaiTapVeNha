package Week3;

import java.util.Scanner;

public class MainManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Management management = new Management();
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        int choice;
        do {
            System.out.println("Nhấn 1 để thêm");
            System.out.println("Nhấn 2 để sửa");
            System.out.println("Nhấn 3 để xóa");
            System.out.println("Nhấn 4 để xem tổng tiền lương của nhân viên full time");
            System.out.println("Nhấn 5 để xem lương nv part time");
            System.out.println("Nhấn 6 xem tiền lương trung bình của nv full time và nv tiền lương dưới trung bình");
            System.out.println("Nhấn 7 để xem tổng tiền lương phải trả cho tất cả nv part time");
            System.out.println("Nhân 8 để xem bảng lương của tất cả mọi người tăng dần");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    management.addEmployee();
                case 2:
                    management.editEmployee();
                case 3:
                    management.deleteEmployee();
//                case 4:
//                    management.totalSalaryFullTime();
//                case 5:
//                    management.totalSalaryPartTime();
                case 6:
                    management.totalAvgSalaryAllEmployee();
//                    management.totalLowWages(totalAvgSalaryAllEmployee());
                case 7:
                    management.totalAllSalaryPay();
                case 8:

            }
        } while(true);
    }
}
