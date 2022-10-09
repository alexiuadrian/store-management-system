from StoreManagementInterface import StoreManagementInterface
from SingletonMeta import SingletonMeta
from Deposit import Deposit
from Store import Store
from Employee import Employee
from Food import Food
from Drink import Drink


class LidlStoreManagement(StoreManagementInterface, metaclass=SingletonMeta):

    def __init__(self, name="Lidl", profit=6664.32):
        # super().__init__(name, address, uuid)
        self.deposit = Deposit(name, profit)

    def print_deposit_information(self):
        print(self.deposit)

    def print_store_information(self, uuid):
        # stores variable for all the stores of the deposit
        stores = self.deposit.stores

        for store in stores:
            if store.uuid == uuid:
                print(store)
                return

        print("Store not found")

    def print_employee_information(self, SSN):
        # stores variable for all the stores of the deposit
        stores = self.deposit.stores

        for store in stores:
            if store.get_employee(SSN):
                print(store.get_employee(SSN))
                return

        print("Employee not found")

    def print_item_information(self, uuid):
        # stores variable for all the stores of the deposit
        stores = self.deposit.stores

        for store in stores:
            if store.get_item(uuid):
                print(store.get_item(uuid))
                return

        print("Item not found")

    def add_store_to_deposit(self, address):
        store = self.deposit.add_store(Store(address))

        if store:
            print("Store added successfully")
            return store
        else:
            print("Store already exists")
            return None

    def add_employee_to_store(self, first_name, last_name, SSN, store):
        new_employee = Employee(first_name, last_name, SSN)

        if store.add_employee(new_employee):
            print("Employee added successfully")
            return new_employee
        else:
            print("Employee already exists")
            return None

    def add_food_item_to_store(self, name, price, expiration_date, weight, store):
        new_food_item = Food(name, price, expiration_date, weight)

        if store.add_item(new_food_item):
            print("Item added successfully")
            return new_food_item
        else:
            print("Item already exists")
            return None

    def add_drink_item_to_store(self, name, price, expiration_date, volume, is_alcohol, store):
        new_drink_item = Drink(name, price, expiration_date, volume, is_alcohol)

        if store.add_item(new_drink_item):
            print("Item added successfully")
            return new_drink_item
        else:
            print("Item already exists")
            return None
