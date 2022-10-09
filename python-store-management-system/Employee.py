class Employee:
    def __init__(self, first_name, last_name, SSN):
        self.first_name = first_name
        self.last_name = last_name
        self.SSN = SSN

    def __str__(self):
        return f"Employee: {self.first_name}, {self.last_name}, {self.SSN}"
