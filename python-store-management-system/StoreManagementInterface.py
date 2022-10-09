class StoreManagementInterface:
    def print_deposit_information(self):
        pass

    def print_store_information(self, uuid):
        pass

    def print_employee_information(self, SSN):
        pass

    def print_item_information(self, uuid):
        pass

    def add_store_to_deposit(self, address):
        pass

    def add_employee_to_store(self, first_name, last_name, SSN, store):
        pass

    def add_food_item_to_store(self, name, price, expiration_date, weight, store):
        pass

    def add_drink_item_to_store(self, name, price, expiration_date, volume, is_alcohol, store):
        pass
