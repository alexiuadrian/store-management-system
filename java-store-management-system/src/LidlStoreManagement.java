import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class LidlStoreManagement implements StoreManagement {
    private Deposit deposit = Deposit.getInstance();

    public LidlStoreManagement() {
        deposit.setCompanyName("Lidl");
        deposit.setProfit(667763.63);
    }

    public void printDepositInformation() {
        deposit.printInformation();
    }

    public void printStoreInformation(UUID uuid) {
        ArrayList<Store> stores = deposit.getStores(); // array with the stores of the deposit

        // find the store with the given uuid
        for (Store storeIterator : stores) {
            if (storeIterator.getUuid() == uuid) {
                storeIterator.printInformation();
                return;
            }
        }

        // print an error message if the store is not found
        System.out.printf("Store not found!");
    }

    public void printEmployeeInformation(String SSN) {
        ArrayList<Store> stores = deposit.getStores(); // array with the stores of the deposit

        // iterate through the stores array and for each store, iterate through its employees
        for (Store storeIterator : stores) {
            if (storeIterator.getEmployee(SSN) != null) {
                storeIterator.getEmployee(SSN).printInformation();
                return;
            }
        }

        // if the employee was not found, print an error message
        System.out.println("Employee not found!");
    }

    public void printItemInformation(UUID uuid) {
        ArrayList<Store> stores = deposit.getStores(); // array with the stores of the deposit

        for (Store storeIterator : stores) {
            for (Item itemIterator : storeIterator.getItems()) {
                if (itemIterator.getUuid() == uuid) {
                    itemIterator.printInformation();
                    return;
                }
            }
        }

        // if the item was not found, print an error message
        System.out.println("Item not found");
    }

    public Store addStoreToDeposit(String address) {
        return deposit.addStore(new Store(address));
    }

    public Employee addEmployeeToStore(String firstName, String lastName, String SSN, Store store) {
        return store.addEmployee(new Employee(firstName, lastName, SSN));
    }

    public Item addFoodItemToStore(String name, Double price, LocalDate expirationDate, Double weight, Store store) {
        return store.addItem(new Food(name, price, expirationDate, weight));
    }

    public Item addDrinkItemToStore(String name, Double price, LocalDate expirationDate, Double volume, boolean isAlcohol, Store store) {
        return store.addItem(new Drink(name, price, expirationDate, volume, isAlcohol));
    }
}
