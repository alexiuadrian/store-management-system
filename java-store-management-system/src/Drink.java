import java.time.LocalDate;
import java.util.Date;

public class Drink extends Item {
    private Double volume;
    private boolean isAlcohol;

    public Drink() {
        super();
    }

    public Drink(Double volume, boolean isAlcohol) {
        super();
        this.volume = volume;
        this.isAlcohol = isAlcohol;
    }

    public Drink(String name, Double price, LocalDate expirationDate, Double volume, boolean isAlcohol) {
        super(name, price, expirationDate);
        this.volume = volume;
        this.isAlcohol = isAlcohol;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public boolean isAlcohol() {
        return isAlcohol;
    }

    public void setAlcohol(boolean alcohol) {
        isAlcohol = alcohol;
    }

    @Override
    public String toStr() {
        String message = super.toStr();
        message += String.format("\nVolume: %smL\nIs Alcohol: %s", volume, isAlcohol == true ? "Yes" : "No");
        return message;
    }
}
