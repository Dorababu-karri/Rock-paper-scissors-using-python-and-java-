import random

computer = random.randint(1, 3)

choices = {1: "Rock", 2: "Paper", 3: "Scissors"}

while True:
    user = int(input("Enter user choice: "))
    if user<1 or user>3:
        print("Invalid choice")
        continue
    print("User choose:", choices[user])

    print("Computer chose:", choices[computer])

    if computer == user:
        print("Tie")
   elif (computer == 1 and user == 2) or (computer == 2 and user == 3) or (computer == 3 and user == 1):
        print("User won and computer lost")
    else:
        print("User lost and computer won")
    play_again = input("Play again? (y/n): ").lower()
    if play_again != 'y':
        print("Thanks for playing!")

        break
