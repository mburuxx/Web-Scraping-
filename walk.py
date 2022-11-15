import random
import matplotlib.pyplot as plt

def uniform_random_walk(steps):
    position = 0
    for i in range(steps):
        position += random.uniform(-1,1)
    return position
def normal_random_walk(steps, mean, std):
    position = 0
    for i in range(steps):
        position += random.gauss(mean, std)
    return position

def main():
    steps = 20
    plt.plot([uniform_random_walk(steps) for i in range(1000)])
    plt.show()
    plt.plot([normal_random_walk(steps, 0, 1) for i in range(1000)])
    plt.show()
    plt.plot([normal_random_walk(steps, 0, 2) for i in range(1000)])
    plt.show()
    plt.plot([normal_random_walk(steps, 1, 2) for i in range(1000)])
    plt.show()

if __name__ == "__main__":
    main()