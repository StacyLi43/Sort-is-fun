def Selectionsort(theArray):
    for i in range(0,len(theArray)):
        currentmin = theArray[i]
        itspos = i
        for j in range(i+1,len(theArray)):
            if theArray[j] < currentmin:
                currentmin = theArray[j]
                itspos = j
        tmp = theArray[itspos]
        theArray[itspos] = theArray[i]
        theArray[i] = tmp

n = int(input())
theArray = input().split(" ")
for x in theArray:
    x = int(x)
Selectionsort(theArray)
for x in theArray:
    print(x, end = " ")
print()
