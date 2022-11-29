def heapify(arr, n, i): 
    largest = i 
    l = 2 * i + 1     
    r = 2 * i + 2     
    if l < n and arr[i] < arr[l]: 
        largest = l 
    if r < n and arr[largest] < arr[r]: 
        largest = r 
    if largest != i: 
        arr[i],arr[largest] = arr[largest],arr[i] 
        heapify(arr, n, largest) 
def heapSort(arr): 
    n = len(arr) 
    for i in range(n, -1, -1): 
        heapify(arr, n, i) 
    for i in range(n-1, 0, -1): 
        arr[i], arr[0] = arr[0], arr[i] 
        heapify(arr, i, 0) 
A = list(map(int, input("Enter the array elements comma separated (ex: 1, 2, 3): ").split(",")))
low = int(input("Low: "))  # asking high value
high = int(input("High: "))  # asking low value
print(f'The original array is {A}')
a=[]
for i in A:
    if i > low and i < high:
        a.append(i)
print(f'The Maxheap of those elements within the spefified range is: {a}')
heapSort(A) 
print(f'The final sorted array is: {A}')