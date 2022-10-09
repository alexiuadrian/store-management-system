from Item import Item


class Food(Item):
    def __init__(self, name, price, expiration_date, weight):
        super().__init__(name, price, expiration_date)
        self.weight = weight

    def __str__(self):
        return f"Item: {self.name}, {self.price}, {self.expiration_date}, {self.weight}"
