import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

// Deposit is a singleton class
public class Deposit {
    // singleton logic
    static Deposit deposit = new Deposit();

    private Deposit() {}

    public static Deposit getInstance() {
        return deposit;
    }

    // properties and methods
    private static String companyName;
    private static Double profit;
    private static ArrayList<Store> stores = new ArrayList<>();

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Deposit.companyName = companyName;
    }

    public static Double getProfit() {
        return profit;
    }

    public static void setProfit(Double profit) {
        Deposit.profit = profit;
    }

    public static ArrayList<Store> getStores() {
        return stores;
    }

    public static Store getStore(UUID uuid) {
        // gets a store from the stores list by UUID
        for (Store storeIterator : stores) {
            if (storeIterator.getUuid() == uuid) {
                return storeIterator;
            }
        }

        // if it doesn't exist, it returns null
        return null;
    }

    public static Store addStore(Store store) {
        // check if the stores list already contains this store
        for (Store storeIterator : stores) {
            if (storeIterator.getUuid() == store.getUuid()) {
                return null;
            }
        }

        // if it's not present, add it to the stores list
        stores.add(store);

        return store;
    }

    public static boolean deleteStore(UUID uuid) {
        // check if the store is in the stores list
        for (Store storeIterator : stores) {
            if (storeIterator.getUuid() == uuid) {
                stores.remove(storeIterator);
                return true;
            }
        }

        // if it doesn't exist, return false
        return false;
    }

    // print information method
    public static void printInformation() {
        String message = String.format("Information on %s\nProfit: $%s", companyName, profit);
        System.out.println(message);
    }
}