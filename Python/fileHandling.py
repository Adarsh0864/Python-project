try:
    with open("demo.txt", "r") as f:
        data = f.read()
        print(data)
        print(type(data))
except FileNotFoundError:
    print("The file demo.txt was not found.")
except IOError:
    print("An error occurred while reading the file.")
