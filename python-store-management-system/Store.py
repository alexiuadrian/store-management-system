import uuid


class Store:
    def __init__(self, address, employees=[], items=[]):
        self.address = address
        self.uuid = uuid.uuid4()
        self.employees = employees
        self.items = items

    def __str__(self):
        return f"Store: {self.uuid}, {self.address}"

    def get_employee(self, SSN):
        for employee in self.employees:
            if employee.SSN == SSN:
                return employee

        return None

    def add_employee(self, employee):
        # check if the employee already exists
        for employee1 in self.employees:
            if employee1.SSN == employee.SSN:
                return None

        self.employees.append(employee)
        return employee

    def get_item(self, uuid):
        for item in self.items:
            if item.uuid == uuid:
                return item

        return None

    def add_item(self, item):
        # check if the item already exists
        for item1 in self.items:
            if item1.uuid == item.uuid:
                return None

        self.items.append(item)
        return item
