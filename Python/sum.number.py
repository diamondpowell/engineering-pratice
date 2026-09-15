## sum numbers in a list

def sum_list(nums):
    total_sum = 0

    for num in nums:
        total_sum += num

    return total_sum

numbers = [1, 2, 3]
result = sum_list(numbers)
print(f"The sum of the list is: {result}")