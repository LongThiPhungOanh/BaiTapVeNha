package Week3;

public class FullTimeEmployee extends Employee implements Comparable<FullTimeEmployee>{
    private double bonus;
    private double fine;
    private double salary;
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
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public FullTimeEmployee() {
    }
    public FullTimeEmployee(int employeeID, String fullName, int age, int phoneNumber, String email
            , Address address, double bonus, double fine, double salary) {
        super(employeeID, fullName, age, phoneNumber, email, address);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }
    @Override
    public int compareTo(FullTimeEmployee o) {
        if (this.getSalary() == o.getSalary()) {
            return (int)(this.getBonus() - o.getBonus());
        }
        return (int) (this.getSalary() - o.getSalary());
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
}
