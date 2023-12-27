# Sort-is-fun
Records on learning sort algorithms. To be updated anytime. 

## Bubble Sort
Bubble sort compares each two consecutive elements and puts them in the right order. After comparison, the largest element would be sorted to the end of the array. Consider the end part of the array as 'sorted' and repeat the comparison process to the 'unsorted' parts until all the elements in the array are sorted. 

Implementing bubble sort in coding:
(take java as an example)
```
void BubbleSort(int[] theArray)
{
  for(int i = 1; i < n; i++){
    for (int j = 0; j < n-1; j++){
      if(theArray[j] > theArray[j+1]){ //swap to keep each two consecutive elements in order
        int tmp = theArray[j];
        theArray[j] = theArray[j+1];
        theArray[j+1] = tmp;
      }
    }
  }
}
```
Visualized bubble sort by me at

https://www.bilibili.com/video/BV11c411r7o6/
