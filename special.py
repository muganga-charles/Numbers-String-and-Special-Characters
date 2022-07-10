#allows a user to make an entry
#tells if the entry is a number,character, string or special character
def entry():
    entry = input("Enter a number, character, string or special character: ")
    if entry.isdigit():
        print("You entered a number")
    elif entry.isalpha():
        print("You entered a character")
    elif entry.isalpha():
        print("You entered a string")
    else:
        print("You entered a special character")
def main():
    entry()
main()