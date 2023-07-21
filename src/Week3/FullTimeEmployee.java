package Week3;

public class FullTimeEmployee extends Employee{
    private double bonus;
    private double fine;
    private long salary;
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getFine() {
        return fine;
    }
    public void setFine(double fine) {
        this.fine = fine;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public FullTimeEmployee() {
    }
    public FullTimeEmployee(int employeeID, String fullName, int age, int phoneNumber, String email
            , Address address, double bonus, double fine, long salary) {
        super(employeeID, fullName, age, phoneNumber, email, address);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "FullTimeEmployee " +
                "bonus = " + bonus +
                ", fine = " + fine +
                ", salary = " + salary +
                ", employeeID = " + employeeID +
                ", fullName = '" + fullName + '\'' +
                ", age = " + age +
                ", phoneNumber = " + phoneNumber +
                ", email = '" + email + '\'' +
                ", address = " + address ;
    }
    @Override
    public int compareTo(Employee o) {
      FullTimeEmployee o1 = (FullTimeEmployee) o;
        if (this.getSalary() == o1.getSalary()) {
            return (int)(this.getBonus() - o1.getBonus());
        }
        return (int) (this.getSalary() - o1.getSalary());
    }
}
