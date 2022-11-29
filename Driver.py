from Car import Car

def main():
    car = Car("Red", "Toyota", "Corolla", "2017")
    print("Color:", car.color)
    print("Make:", car.make)
    print("Model:", car.model)
    print("Year:", car.year)
    print("Speed:", car.speed)

    for i in range(5):
        car.accelerate(10)
        print("Speed:", car.speed)

    for i in range(5):
        car.brake(10)
        print("Speed:", car.speed)


main()