def MergeSort(a,b):
    c = []
    while len(a) != 0 or len(b) != 0:
        if len(b) == 0:
            c.append(a[0])
            del a[0]
        elif len(a) == 0:
            c.append(b[0])
            del b[0]
        elif a[0] < b[0]:
            c.append(a[0])
            del a[0]
        elif b[0] < a[0]:
            c.append(b[0])
            del b[0]
    return c

def Merge(theArray):
    if len(theArray) == 1: return theArray
    n = int(len(theArray)/2)
    a = theArray[:n].copy()
    b = theArray[n:].copy()
    a = Merge(a)
    b = Merge(b)
    return MergeSort(a,b)

n = int(input())
theArray = input().split(" ")
for x in theArray:
    x = int(x)
theArray = Merge(theArray)
for x in theArray:
    print(x, end = " ")
print()
