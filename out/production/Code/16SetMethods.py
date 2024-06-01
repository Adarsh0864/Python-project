collection = {1,2,3,2,2,"hello","world",2}


# THis add method is use to add elements in the set.
collection.add(4)
print(collection)

collection.remove(3)
print(collection)

print(collection.pop())#This method pops any random value from the given collection.
print(collection.pop())


# SEt union and intersection method:

set1={1,2,3}
set2={2,3,4}

print(set1.union(set2))

print(set1.intersection(set2))
