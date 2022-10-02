import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public interface StoreManagement {
    public void printDepositInformation(); // prints information about the deposit

    public void printStoreInformation(UUID uuid); // prints store inside the deposit information

    public void printEmployeeInformation(String SSN); // prints information on an employee

    public void printItemInformation(UUID uuid); // prints information on a product

    public Store addStoreToDeposit(String address);

    public Employee addEmployeeToStore(String firstName, String lastName, String SSN, Store store);

    public Item addFoodItemToStore(String name, Double price, LocalDate expirationDate, Double weight, Store store);

    public Item addDrinkItemToStore(String name, Double price, LocalDate expirationDate, Double volume, boolean isAlcohol, Store store);
}
