def split(word): 
    wList = list(word)
    nList = []
    for w in wList:
    	nList.append(int(w))
    return nList

numberStr = input("Please input a number to sum (for loop): ")

nums = split(numberStr)

x = 0
for n in nums:
	x += n

print(x)


numberStr2 = input("Please input a number to sum (while loop): ")

nums2 = split(numberStr2)

i = 0
result = 0
while i < len(nums2):
	result += nums2[i]
	i += 1

print(result)


z = 0
f = []

for z in range(0, 5):
	f.append(input("Enter subject {} grade:".format(z + 1)))
	z += 1
print(f)