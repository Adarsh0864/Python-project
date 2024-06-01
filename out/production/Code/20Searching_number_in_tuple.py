# nums = (1, 3, 4, 5, 6, 7, 8, 9, 10)

# x = 5

# i = 0
# while i < len(nums):
#     if nums[i] == x:
#         print("Found at index", i)
#         break
#     else:
#         print("Finding...")
#         i += 1



# Use of continue keyword in python:

# i = 1
# while i<=10:
#     if(i%2==0):
#         i+=1

#         continue#continue keyword is used within loops to skip the rest of the code inside the loop for the current iteration and proceed to the next iteration. It's particularly handy when you want to skip certain iterations based on a condition without exiting the loop altogether.
    
#     print(i)
#     i+=1


#Another example of continue keyword:

i = 0
while i <=5:
    if(i==3):
        i+=1
        continue
    
    print(i)
    i+=1


   