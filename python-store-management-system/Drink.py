from Item import Item


class Drink(Item):
    def __init__(self, name, price, expiration_date, volume, is_alcohol):
        super().__init__(name, price, expiration_date)
        self.volume = volume
        self.is_alcohol = is_alcohol

    def __str__(self):
        return f"Item: {self.name}, {self.price}, {self.expiration_date}, {self.volume}, {self.is_alcohol}"
