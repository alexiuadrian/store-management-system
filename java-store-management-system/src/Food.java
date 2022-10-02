import java.time.LocalDate;
import java.util.Date;

public class Food extends Item {
    private Double weight;

    public Food() {
        super();
    }

    public Food(Double weight) {
        super();
        this.weight = weight;
    }

    public Food(String name, Double price, LocalDate expirationDate, Double weight) {
        super(name, price, expirationDate);
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toStr() {
        String message = super.toStr();
        message += String.format("\nWeight: %sg", weight);
        return message;
    }
}
