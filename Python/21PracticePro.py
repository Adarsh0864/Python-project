# #Print no from one to 100:

# i= 1;
# while i<=100:
#     print(i)
#     i+=1


#     #02: Print the number from 100 to 1:

# i = 100
# while i>=1:
#         print(i)
#         i-=1


#03 Print the element of following list using a loop:
# 1,4,9,16,25,36,49,64,81,100

# nums = [1,4,9,16,25,36,49,64,81,100]

# for el in nums:
#         print(el)



#04 Search for a number using loops:

num = (1,3,4,5,6,7,8,9,10)
x = 5

idx = 0 #We have created an index to print out the index of target value 
for el in num:
        if(el==x):
                print("found at index ",idx )
                idx+=1
        
