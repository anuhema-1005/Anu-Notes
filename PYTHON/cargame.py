command = " "
started = False
while True:
    command = input("> ").lower()
    if command == 'start':
        if started:
            print("Car has already started")
        else:
            started = True
            print("Car started...")
    elif command == 'stop':
        if not started:
            print("Car has already stopped")
        else:
            started = False
            print("car stopped...")
    elif command == 'quit':
        print("Game Over")
        break
    elif command == 'help':
        print("""
start - Car has started...
stop - Car has stopped...
quit - To exit game
            """)
    else:
        print("Sorry I could not understand")


