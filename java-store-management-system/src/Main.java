import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LidlStoreManagement lidlStoreManagement = new LidlStoreManagement();

        // add a store to the deposit
        Store store1 = lidlStoreManagement.addStoreToDeposit("Ploiesti, Prahova");

        // add an employee to the store
        Employee employee = lidlStoreManagement.addEmployeeToStore("Adi", "Alexiu", "888-888-999", store1);

        // print the information on the employee
        lidlStoreManagement.printEmployeeInformation(employee.getSSN());

        // print the information on the store
        lidlStoreManagement.printStoreInformation(store1.getUuid());

        // add an item to a store
        Item food1 = lidlStoreManagement.addFoodItemToStore("Cheese", 34.5, LocalDate.parse("2022-12-03"), 300.00, store1);

        // print the information on the item
        lidlStoreManagement.printItemInformation(food1.getUuid());

        // add an item to a store
        Item drink1 = lidlStoreManagement.addDrinkItemToStore("Water", 2.99, LocalDate.parse("2030-12-09"), 500.00, false, store1);

        // print the information on the item
        lidlStoreManagement.printItemInformation(drink1.getUuid());
    }
}