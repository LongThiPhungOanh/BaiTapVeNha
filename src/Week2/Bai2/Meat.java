package Week2.Bai2;

import java.time.LocalDate;

public class Meat extends Material{
    private double weight;
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public Meat() {}
    public Meat(int id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }
    @Override
    public double getAmount() {
       return weight * getCost();
    }
    @Override
    public LocalDate getExpiryDate() {
      return manufacturingDate.plusDays(7);
    }

    @Override
    public String toString() {
        return "Meat{" +
                "weight=" + weight +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                '}';
    }
}
