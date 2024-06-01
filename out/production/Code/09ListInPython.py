#ListIn works like same way how a array works but the difference is it can be any data type which we can store in a single listIn

#Lists are mutable in nature where as strings are not

# student = ["Adarsh", 55, "Delhi"]
# print(student[0])

# student[0]= "yuvrajj"
# print(student[0])




#List method:

list = [2,1,3]
print(list.append(4))#it doesnt return any thing it will just make changes to the parent string and not create a new string
print(list.sort())#same
print(list.sort(reverse=True))
print(list.insert(1,5))

#now when we print then
print(list) #so this will return the appended and sorted list