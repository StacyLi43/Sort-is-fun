n = int(input())
theArray = input().split(" ")
for x in theArray:
    x = int(x)
for i in range(1,n):
    for j in range(0,n-1):
        if theArray[j] > theArray[j+1]:
            tmp = theArray[j]
            theArray[j] = theArray[j+1]
            theArray[j+1] = tmp
for x in theArray:
    print(x, end = " ")
print()
