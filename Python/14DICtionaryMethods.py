student = {
    "name": "Adarsh",
    "subjects": {                  
        "physics": 99,
        "chem": 90,
        "math" : 80,
    }

}

#01 it return all the keys:
print(student.keys())



#02 It return all the values:
print(list(student.values()))   #here we have use the concept of typecasting to convert this into list.

#03 return all (key,value) pairs as tuple :
print(list(student.items()))

#04 Return the key according to the value:
print(student.get("name"))

#05 Insert the specified items to the dictionary:
print(student.update({"city":"delhi"}))

print(student)


