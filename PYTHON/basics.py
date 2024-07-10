# Basics of python

# Hello World
print("Hello World")
# Input, Variable, Operators
name = input("What is your name ")
print(name)
print(4+5)
# Lists
numbers = [1,2,3,4,5]
print(numbers[0])
numbers.append(25)
print(numbers[5])
# Tuples
number = (45,26,25)
print(number[1])
# For loop
numbers = [1,2,3,4,5]
for a in numbers:
    print(a)    
# If statement
a=2
if a>0:
    print(a)
#for loop
for item in 'Python':
    print(item)
# range 
for uipath in range(0,5):
    print(uipath)
for post in range(10):
    print(post)
for run in range(12,29,2):
    print(run)
#list
for q in [1,2,3,4]:
    print(q)
#Sample code
prices = [10,20,30]
total = 0
for price in prices:
    total+=price
print(f"Total: {total}")
