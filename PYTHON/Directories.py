from pathlib import Path
# path = Path("Email")
# print (path.exists())
# # print (path.mkdir())
# print (path.rmdir())
path = Path()
# print(path.glob('*'))
# print(path.glob('*.*'))
for file in path.glob('*.py'):
    print(file)