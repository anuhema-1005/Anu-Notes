# class Point:
#     def __init__(self,x,y):
#         self.x=x
#         self.y=y

#     def move(self):
#         print("move")

#     def draw(self):
#         print("draw")

# # object  = Point()
# # object.x = 10
# # object.y = 20
# # print(object.x)
# # object.draw()
# # object.move()

# # object1  = Point()
# # object1.x = 1
# # print(object1.x)

# # Constructors

# o = Point(20, 30)
# o.x= 15
# print(o.x)

class Person:
    def __init__(self, name):
        self.name=name
        
    def talk(self):
        print(f"Hi, I am {self.name}")

john = Person("John")
john.talk()

