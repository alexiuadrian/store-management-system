import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Store {
    private UUID uuid;
    private String address;
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Item> items = new ArrayList<>();

    public ArrayList<Item> getItems() {
        return items;
    }

    public Item addItem(Item item) {
        // check if the item exists (by uuid)
        for (Item itemIterator : items) {
            if (itemIterator.getUuid() == item.getUuid()) {
                return null;
            }
        }

        // otherwise, we add the new employee
        items.add(item);

        return item;
    }

    public Store() {
        this.uuid = UUID.randomUUID();
    }

    public Store(String address) {
        this.uuid = UUID.randomUUID();
        this.address = address;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployee(String SSN) {
        // gets an employee from the employees list by SSN
        for (Employee employeeIterator : employees) {
            if (employeeIterator.getSSN() == SSN) {
                return employeeIterator;
            }
        }

        // if it doesn't exist, return null
        return null;
    }

    // adding an employee to the employees list
    public Employee addEmployee(Employee employee) {
        // check if the employee exists (by SSN)
        for (Employee employeeIterator : employees) {
            if (employeeIterator.getSSN() == employee.getSSN()) {
                return null;
            }
        }

        // otherwise, we add the new employee
        employees.add(employee);

        return employee;
    }

    public void printInformation() {
        String message = String.format("Information on the store with id %s\nAddress: %s\nNumber of employees ",
                uuid, address, employees.size() > 0 ? employees.size() : 0);
        System.out.println(message);
    }
}
