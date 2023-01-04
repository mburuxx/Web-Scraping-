import random
import time

def insertion_sort(nums):
    start = time.time()

    for i in range(1, len(nums)):
        j = i
        while j > 0 and nums[j] < nums[j-1]:
            nums[j], nums[j-1] = nums[j-1], nums[j]
            j -= 1

    end = time.time()
    return (end - start)

def merge_sort(nums):
    if len(nums) <= 1:
        return nums

    mid = len(nums) // 2
    left = merge_sort(nums[:mid])
    right = merge_sort(nums[mid:])

    return merge(left, right)

def merge(left, right):
    merged = []
    left_idx = 0
    right_idx = 0

    while left_idx < len(left) and right_idx < len(right):
        if left[left_idx] <= right[right_idx]:
            merged.append(left[left_idx])
            left_idx += 1
        else:
            merged.append(right[right_idx])
            right_idx += 1

    merged += left[left_idx:]
    merged += right[right_idx:]

    return merged

def heap_sort(nums):
    start = time.time()

    build_max_heap(nums)
    for i in range(len(nums)-1, 0, -1):
        nums[i], nums[0] = nums[0], nums[i]
        max_heapify(nums, index=0, size=i)

    end = time.time()
    return (end - start)

def parent(i):
    return (i-1)//2

def left(i):
    return 2*i + 1

def right(i):
    return 2*i + 2

def build_max_heap(nums):
    for i in range(len(nums), -1, -1):
        max_heapify(nums, index=i, size=len(nums))

def max_heapify(nums, index, size):
    l = left(index)
    r = right(index)
    if l < size and nums[l] > nums[index]:
        largest = l
    else:
        largest = index
    if r < size and nums[r] > nums[largest]:
        largest = r
    if largest != index:
        nums[index], nums[largest] = nums[largest], nums[index]
        max_heapify(nums, largest, size)

# Generate 10 random numbers
nums = [random.randint(0,9999) for _ in range(10)]

# Insertion Sort
print("Insertion Sort:")
print("10 numbers:")
print("Data Generated: ", nums)
insertion_sort(nums)
print("Sorted Data: ", nums)
print("Time: ", insertion_sort(nums))

# Merge Sort
print("\nMerge Sort:")
print("10 numbers:")
print("Data Generated: ", nums)
merge_sort(nums)
print("Sorted Data: ", nums)
print("Time: ", merge_sort(nums))

# Heap Sort
print("\nHeap Sort:")
print("10 numbers:")
print("Data Generated: ", nums)
heap_sort(nums)
print("Sorted Data: ", nums)
print("Time: ", heap_sort(nums))