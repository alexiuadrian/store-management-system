import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

class Item {
    protected UUID uuid;
    protected String name;
    protected Double price;
    protected LocalDate expirationDate;

    public Item() {
        this.uuid = UUID.randomUUID();
    }

    public Item(String name, Double price, LocalDate expirationDate) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String toStr() {
        String message = String.format("Information on %s\nName: %s\nPrice: $%s\nExpiration Date: %s",
                uuid, name, price, expirationDate);
        return message;
    }

    public void printInformation() {
        System.out.println(this.toStr());
    }
}
