summation = 0
prompt = int(input("Enter number of elements: "))
for number in range(0, prompt):
	elements = int(input())
	if elements < 0:
		break
	summation = summation + elements
print(summation)
