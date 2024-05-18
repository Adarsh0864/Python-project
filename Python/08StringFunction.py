#To check that your string ends with the same letter which you are typing we use "endswith"

str = "my name is Adarsh Mishra"

print(str.endswith("ra")) # So this will return us true 

#02 To make the first character capital we use this function

print(str.capitalize())#it makes the first letter capital of the string.

#03 if we wanna replace any letter from the string with the new ones so we use this

print(str.replace("m","h")) #hy nahe is Adarsh Mishra -- So this is the new output which we got.

#04 if we want to search something then we can use this command

print(str.find("name"))

#05 Count function will count that how many time a word is getting repeted in a string.

print(str.count("m"))
