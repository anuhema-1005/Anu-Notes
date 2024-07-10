numbers = [5,2,1,7,4,5,5,5]
numbers.append(20)
print(numbers)
numbers.insert(0, 56) #int object
print(numbers)
numbers.remove(56) #int object
print(numbers)
numbers.index(7)
print(numbers)
print (60 in numbers)
print (numbers.count(5))
print(numbers.sort())
print(numbers.reverse())
num = numbers.copy()
numbers.pop()
print(numbers)
numbers.clear() #int object
print(numbers)

# challenge - remove duplicates
numbers = [2,4,6,3,4,6,7,6]
uniques = []
for num in numbers:
    if num not in uniques:
        uniques.append(num)
print(uniques)