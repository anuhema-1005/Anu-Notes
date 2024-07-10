#lists
names = ['a0','a1','a2','a3','a4']
print(names[2])
print(names[2:])
print(names[2:4])
print(names[:4])
print(names[:])
names[0]='kjhisl0'
print(names[:])

#Challenge - largest num
numbers = [23,56,45,89,56]
max = numbers[0]
for num in numbers:
    if num > max:
        max = num
print (max)