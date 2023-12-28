def Insertionsort(theArray):
    for i in range(1,len(theArray)):
        for j in range(i,0,-1):
            if(theArray[j] < theArray[j-1]):
                tmp = theArray[j]
                theArray[j] = theArray[j-1]
                theArray[j-1] = tmp

n = int(input())
theArray = input().split(" ")
for x in theArray:
    x = int(x)
Insertionsort(theArray)
for x in theArray:
    print(x,end = " ")
print()
