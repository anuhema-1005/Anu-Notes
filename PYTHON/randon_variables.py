# import random
# for i in range(3):
#     print(random.random())
#     print(random.randint(10,20))

import random

class Dice:
    def roll(self):
        first = random.randint(1,6)
        second = random.randint(1,6)
        # return (first,second) - not necessary
        return first,second
    
dice = Dice()
print(dice.roll())