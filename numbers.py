#the aim of this program is to calculate the sum of squares of a given input of numbers
numbers = []
squares = []
summation = 0
prompt = int(input("Enter the number of elements: "))
for i in range(0, prompt):
	elements = int(input())
	numbers.append(elements)
for number in numbers:
	square = number ** 2
	squares.append(square)
for value in squares:
	summation = summation + value
print(summation)
