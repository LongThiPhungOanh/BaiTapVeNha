package Week2.Bai2;

import java.time.LocalDate;

public class CrispyFlour extends Material {
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour() {}
    public CrispyFlour(int id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }
    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
//        setManufacturingDate(LocalDate.parse("2023/7/14"));
        return manufacturingDate.plusYears(1);

    }
}
