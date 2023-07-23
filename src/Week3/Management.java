package Week3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Management{
    private final Scanner input = new Scanner(System.in);
    List<Employee> listEmployee = new ArrayList<>();
    List<Address> listAddress = new ArrayList<>();
    public Management() {
        listAddress.add(new Address("HaNoi","My Dinh" ,"Nam Tu Liem",13));
        listAddress.add(new Address("HaNoi","Cau Giay" ,"Dich Vong Hau",17));
        listEmployee.add(new FullTimeEmployee(1,"Nguyen Thi Ha", 24, 235244324
                , "NguyenThiHa@.com",listAddress.get(0),20000,10000, 150000));
        listEmployee.add(new PartTimeEmployee(2,"Dang Van Nam", 26,
                244567624, "DangVanNam@.com", listAddress.get(1),72));
    }
    public void minMax() {
        List<FullTimeEmployee> newFullTime = new ArrayList<>();
        for (Employee employee : listEmployee) {
            if (employee instanceof FullTimeEmployee) {
                newFullTime.add((FullTimeEmployee) employee);
            }
        }
        Collections.sort(newFullTime);
        System.out.println(newFullTime + "\n");
    }
    public void addEmployee() {
        showList();
        int employeeID = listEmployee.size() + 1;
        System.out.println("Bạn muốn thêm mấy nhân viên");
        int length = Integer.parseInt(input.nextLine());
        for (int i = 0; i < length; i++) {
            System.out.println("Bạn muốn thêm nhân viên nào");
            System.out.println("Thêm nhân viên fulltime nhấp 1, thêm nhân viên parttime nhấp 2");
            int choice = Integer.parseInt(input.nextLine());
            if (choice == 1) {
                System.out.println("Nhập tên");
                String nameEmployeeFullTime = input.nextLine();
                System.out.println("Nhập tuổi");
                int ageFullTime = Integer.parseInt(input.nextLine());
                System.out.println("Nhập số điện thoại");
                int phoneNumberFullTime = Integer.parseInt(input.nextLine());
                System.out.println("Nhập gmail");
                String emailFullTime = input.nextLine();
                System.out.println("Nhập Thành phố");
                String province =  input.nextLine();
                System.out.println("Nhập Huyện");
                String district =  input.nextLine();
                System.out.println("Nhập Xã");
                String commune =  input.nextLine();
                System.out.println("Nhập số nhà");
                int houseNumber = Integer.parseInt(input.nextLine());
                Address addressFullTime = new Address(province,district,commune,houseNumber);
                System.out.println("Nhập số tiền thưởng");
                int bonusFullTime = Integer.parseInt(input.nextLine());
                System.out.println("Nhập số tiền phạt");
                int fineFullTime = Integer.parseInt(input.nextLine());
                System.out.println("Nhập tiền lương cứng");
                int SalaryFullTime = Integer.parseInt(input.nextLine());
                Employee employeeFullTime = new FullTimeEmployee(employeeID++, nameEmployeeFullTime, ageFullTime,
                        phoneNumberFullTime, emailFullTime, addressFullTime,bonusFullTime,fineFullTime,SalaryFullTime);
                listEmployee.add(employeeFullTime);
            } else if (choice == 2){
                System.out.println("Nhập tên");
                String nameEmployeePartTime = input.nextLine();
                System.out.println("Nhập tuổi");
                int agePartTime = Integer.parseInt(input.nextLine());
                System.out.println("Nhập số điện thoại");
                int phoneNumberPartTime = Integer.parseInt(input.nextLine());
                System.out.println("Nhập gmail");
                String emailPartTime = input.nextLine();
                System.out.println("Nhập Thành phố");
                String province =  input.nextLine();
                System.out.println("Nhập Huyện");
                String district =  input.nextLine();
                System.out.println("Nhập Xã");
                String commune =  input.nextLine();
                System.out.println("Nhập số nhà");
                int houseNumber = Integer.parseInt(input.nextLine());
                Address addressPartTime = new Address(province,district,commune,houseNumber);
                System.out.println("Nhập số giờ làm");
                int workingHoursPartTime = Integer.parseInt(input.nextLine());
                Employee employeePartTime = new PartTimeEmployee(employeeID++, nameEmployeePartTime, agePartTime,
                        phoneNumberPartTime, emailPartTime, addressPartTime, workingHoursPartTime);
                listEmployee.add(employeePartTime);
            }
        }
        System.out.println("---------------------------------");
        showList();
    }
    public void editEmployee() {
        showList();
        if (checkEmployee()){
            System.out.println("Nhập mã nhân viên bạn muốn sửa");
            int id = Integer.parseInt(input.nextLine());
            for (int i = 0; i < listEmployee.size(); i++) {
                if (id == listEmployee.get(i).getEmployeeID()) {
                    if(listEmployee.get(i) instanceof FullTimeEmployee ){
                        System.out.println("Nhập tên");
                        String nameEmployeeFullTime = input.nextLine();
                        System.out.println("Nhập tuổi");
                        int ageFullTime = Integer.parseInt(input.nextLine());
                        System.out.println("Nhập số điện thoại");
                        int phoneNumberFullTime = Integer.parseInt(input.nextLine());
                        System.out.println("Nhập gmail");
                        String emailFullTime = input.nextLine();
                        System.out.println("Nhập Thành phố");
                        String province =  input.nextLine();
                        System.out.println("Nhập Huyện");
                        String district =  input.nextLine();
                        System.out.println("Nhập Xã");
                        String commune =  input.nextLine();
                        System.out.println("Nhập số nhà");
                        int houseNumber = Integer.parseInt(input.nextLine());
                        listAddress.get(i).setProvince(province);
                        listAddress.get(i).setDistrict(district);
                        listAddress.get(i).setCommune(commune);
                        listAddress.get(i).setHouseNumber(houseNumber);
                        System.out.println("Nhập số tiền thưởng");
                        int bonusFullTime = Integer.parseInt(input.nextLine());
                        System.out.println("Nhập số tiền phạt");
                        int fineFullTime = Integer.parseInt(input.nextLine());
                        System.out.println("Nhập tiền lương cứng");
                        int SalaryFullTime = Integer.parseInt(input.nextLine());
                        listEmployee.get(i).setFullName(nameEmployeeFullTime);
                        listEmployee.get(i).setAge(ageFullTime);
                        listEmployee.get(i).setPhoneNumber(phoneNumberFullTime);
                        listEmployee.get(i).setEmail(emailFullTime);
                        ((FullTimeEmployee) listEmployee.get(i)).setBonus(bonusFullTime);
                        ((FullTimeEmployee) listEmployee.get(i)).setFine(fineFullTime);
                        ((FullTimeEmployee) listEmployee.get(i)).setSalary(SalaryFullTime);
                    }else {
                        System.out.println("Nhập tên");
                        String nameEmployee = input.nextLine();
                        System.out.println("Nhập tuổi");
                        int age = Integer.parseInt(input.nextLine());
                        System.out.println("Nhập số điện thoại");
                        int phoneNumber = Integer.parseInt(input.nextLine());
                        System.out.println("Nhập gmail");
                        String email = input.nextLine();
                        System.out.println("Nhập Thành phố");
                        String province =  input.nextLine();
                        System.out.println("Nhập Huyện");
                        String district =  input.nextLine();
                        System.out.println("Nhập Xã");
                        String commune =  input.nextLine();
                        System.out.println("Nhập số nhà");
                        int houseNumber = Integer.parseInt(input.nextLine());
                        listAddress.get(i).setProvince(province);
                        listAddress.get(i).setDistrict(district);
                        listAddress.get(i).setCommune(commune);
                        listAddress.get(i).setHouseNumber(houseNumber);
                        System.out.println("Nhập số giờ làm");
                        int workingHours = Integer.parseInt(input.nextLine());
                        listEmployee.get(i).setFullName(nameEmployee);
                        listEmployee.get(i).setAge(age);
                        listEmployee.get(i).setPhoneNumber(phoneNumber);
                        listEmployee.get(i).setEmail(email);
                        ((PartTimeEmployee) listEmployee.get(i)).setWorkingHours(workingHours);
                    }
                }
            }
        }
    }
    public void deleteEmployee(){
        showList();
        if (checkEmployee()){
            System.out.println("Nhập id sản phẩm bạn muốn xóa");
            int id = Integer.parseInt(input.nextLine());
            for (int i = 0; i < listEmployee.size(); i++) {
                if(id == listEmployee.get(i).getEmployeeID()){
                    listEmployee.remove(listEmployee.get(i));
                    System.out.println("Xoa thanh cong");
                }
            }
        } else {
            System.out.println("Không có nhân viên nào để xóa");
        }
    }
    public void showList() {
        for (Employee display : listEmployee) {
            System.out.println(display.toString());
        }
    }
    public void totalSalaryFullTime(FullTimeEmployee obj){
        if(obj == null){
            System.out.println("không có nv này");
        }else {
            float total = (float) (obj.getSalary() + (obj.getBonus() - obj.getFine()));
            System.out.println("Tổng tiền là lương nhân viên fulltime: " + total);
        }
    }
    public void totalSalaryPartTime(PartTimeEmployee obj){
        if(obj == null){
            System.out.println("không có nv này");
        }else {
            float total = (float) (obj.getWorkingHours() * 1000000);
            System.out.println("Tổng tiền là lương nhân viên parttime: " + total);
        }
    }
    public Employee checkObj(){
        System.out.println("Nhập vào id bạn muốn xem lương");
        int id = input.nextInt();
        for (Employee employee : listEmployee) {
            if (id == employee.getEmployeeID()) {
                return employee;
            }
        }
        return null;
    }
    public float totalAvgSalaryAllEmployee(){
        float total = 0;
        for (Employee employee : listEmployee) {
            if (employee instanceof FullTimeEmployee) {
                total += ((FullTimeEmployee) employee).getSalary();
            }
        }
        float avg = total / listEmployee.size();
        System.out.println("Lương trung bình của nhân viên full time: " + avg);
        return avg;
    }
    public void totalLowWages(float totalAvgSalaryAllEmployee){
        for (Employee employee : listEmployee) {
            if (employee instanceof FullTimeEmployee) {
                if (((FullTimeEmployee) employee).getSalary() < totalAvgSalaryAllEmployee) {
                    System.out.println("Nhân viên có mức lương dưới trung bình" + employee);
                }
            }
        }
    }
    public void totalAllSalaryPay(){
        float total = 0;
        for (Employee employee : listEmployee) {
            if (employee instanceof PartTimeEmployee) {
                total += (float) (((PartTimeEmployee) employee).getWorkingHours() * 1000000);
            }
        }
        System.out.println("Tổng tiền phải trả cho nhân viên part time: " + total);
    }
    public boolean checkEmployee(){
        return listEmployee.size() > 0;
    }
}
