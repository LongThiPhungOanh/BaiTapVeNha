package Week3;
public class PartTimeEmployee extends Employee{
    private double workingHours;
    public PartTimeEmployee(){};
    public PartTimeEmployee(int employeeID, String dangVanNam, int age, int phoneNumber, String email, int i) {
    }
    public double getWorkingHours() {
        return workingHours;
    }
    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
    public PartTimeEmployee(int employeeID, String fullName, int age, long phoneNumber, String email, Address address, double workingHours) {
        super(employeeID, fullName, age, phoneNumber, email, address);
        this.workingHours = workingHours;
    }
    @Override
    public String toString() {
        return "PartTimeEmployee  " +
                "workingHours = " + workingHours +
                ", employeeID = " + employeeID +
                ", fullName = '" + fullName + '\'' +
                ", age =" + age +
                ", phoneNumber =" + phoneNumber +
                ", email ='" + email + '\'' +
                ", address =" + address ;
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
