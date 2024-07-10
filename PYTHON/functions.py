def calc_cost(total,shipping,discount):
    print(total)
    print(shipping)
    print(discount)

def greet_user(name):
    print('Hi there!'+name)
    print(f'Hi {name}! ')
    print(f'Hi {name}! '+name)
    print('Welcome abroad')

def square(number):
    return number*number
def sq(number):
    print(number*number)
print("Start")
greet_user("John")
calc_cost(total=50,shipping=5,discount=0.1)
# greet_user(first="John",'Smith')
print("Finish")
print(square(5))
print(sq(3))