from LidlStoreManagement import LidlStoreManagement
from datetime import date


if __name__ == '__main__':
    lidl_store_management = LidlStoreManagement()

    # add a store to the deposit
    store1 = lidl_store_management.add_store_to_deposit("Ploiesti, Prahova")

    # print the information on the store
    lidl_store_management.print_store_information(store1.uuid)

    # add an employee to the store
    employee1 = lidl_store_management.add_employee_to_store("Adi", "Alexiu", "888-888-999", store1)

    # print the information on the employee
    lidl_store_management.print_employee_information(employee1.SSN)

    # add an item to the store
    item1 = lidl_store_management.add_food_item_to_store("Cheese", 34.5, date.fromisoformat('2023-12-04'), 300.00,
                                                         store1)

    # print the information on the food item
    lidl_store_management.print_item_information(item1.uuid)

    # add another item to the store
    item2 = lidl_store_management.add_drink_item_to_store("Water", 2.99, date.fromisoformat('2030-12-04'), 500.00,
                                                          False, store1)

    # print the information on the drink item
    lidl_store_management.print_item_information(item2.uuid)
