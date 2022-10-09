import uuid


class Item:
    def __init__(self, name, price, expiration_date):
        self.name = name
        self.price = price
        self.expiration_date = expiration_date
        self.uuid = uuid.uuid4()

    def __str__(self):
        return f"Item: {self.name}, {self.price}, {self.expiration_date}"

