# Sort-is-fun
Records on learning sort algorithms. To be updated anytime. 

## Bubble Sort
Bubble sort compares each two consecutive elements and puts them in the right order. After comparison, the largest element would be sorted (or say 'bubbled') to the end of the array. Consider the end part of the array as 'sorted' and repeat the comparison process to 'unsorted' part until all the elements in the array are in the correct order. 

Implementing bubble sort in coding: (in java)
```
void BubbleSort(int[] theArray){
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

## Insertion Sort
Similar to bubble sort, insertion sort also compares each two consecutive elements. However, insertion sort always assumes the head of the array 'sorted'. For each new element coming from 'unsorted' part of the array, it is compared to the elements in 'sorted' part one by one and reorder simultaneously until it reaches its proper place in 'sorted' part. The process stops when the the last element in the array is in the right place and the whole array is considered 'sorted'.

Implementing insertion sort in coding: (in java)
```
void InsertionSort(int[] theArray){
  for (int i = 1; i < n; i++){
    for (int j = i; j > 0; j--){
      if(theArray[j] < theArray[j-1]){
        int tmp = theArray[j];
        theArray[j] = theArray[j-1];
        theArray[j-1] = tmp;
      }
    }
  }
}
```
Visualized insertion sort by me at  
https://www.bilibili.com/video/BV1tN4y1x7F9/
