class Deposit:
    def __init__(self, company_name, profit, stores=[]):
        self.company_name = company_name
        self.profit = profit
        self.stores = stores

    def __str__(self):
        return f"Deposit: {self.company_name}, {self.profit}, {self.stores}"

    def get_store(self, uuid):
        return self.strores[uuid]

    def add_store(self, store):
        # check if store already exists
        for store1 in self.stores:
            if store1.uuid == store.uuid:
                return None

        self.stores.append(store)
        return store

    def delete_store(self, uuid):
        del self.stores[uuid]

