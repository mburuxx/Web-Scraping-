class Car:
    def __init__(self, color, make, model, year):
        self.color = color
        self.make = make
        self.model = model
        self.year = year
        self.speed = 0

    def accelerate(self, amount):
        self.speed = self.speed + amount

    def brake(self, amount):
        self.speed = self.speed - amount