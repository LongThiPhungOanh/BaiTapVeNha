package Week3;

import java.util.Scanner;

public class MainManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Management management = new Management();
        int choice;
        do {
            System.out.println("Nhấn 1 để thêm");
            System.out.println("Nhấn 2 để sửa");
            System.out.println("Nhấn 3 để xóa");
            System.out.println("Nhấn 4 để xem tiền lương của 1 nhân viên full time");
            System.out.println("Nhấn 5 để xem lương của 1 nhân viên part time");
            System.out.println("Nhấn 6 xem tiền lương trung bình của nhân viên full time và nhân viên tiền lương dưới trung bình");
            System.out.println("Nhấn 7 để xem tổng tiền lương phải trả cho tất cả nv part time");
            System.out.println("Nhân 8 để xem bảng lương của tất cả mọi người tăng dần");
            System.out.println("Nhấn 0 để thoát");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    management.addEmployee();
                    break;
                case 2:
                    management.editEmployee();
                    break;
                case 3:
                    management.deleteEmployee();
                    break;
                case 4:
                    management.totalSalaryFullTime((FullTimeEmployee) management.checkObj());
                    break;
                case 5:
                    management.totalSalaryPartTime( (PartTimeEmployee) management.checkObj());
                    break;
                case 6:
                    management.totalAvgSalaryAllEmployee();
                    management.totalLowWages(management.totalAvgSalaryAllEmployee());
                    break;
                case 7:
                    management.totalAllSalaryPay();
                    break;
                case 8:
                    management.minMax();
                    break;
                case 0:
                    System.exit(0);
            }
        } while(true);
    }
}
