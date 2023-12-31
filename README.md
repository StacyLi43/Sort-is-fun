# Sort-is-fun
>Records on learning sort algorithms. To be updated anytime.

**Contents**  
- Bubble Sort  
- Insertion Sort
- Selection Sort

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
      if(theArray[j] < theArray[j-1]){ //swap to keep the head of the array 'sorted'
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

## Selection Sort
Selection sort selects the minimum element in 'unsorted' part of the array, and place it at the end of 'sorted' part of the array. Repeat the process until the maximum element in the array is placed at the end of the array.

Implementing Selection sort in coding: (in java)
```
void SelectionSort(int[] theArray){
  for(int i = 0; i < n; i++){
    int currentmin = theArray[i];
    int itsposition = i; //always take the first element in 'unsorted' part as the minimum and record its position
    for(int j = i; j < n; j++)
      if(theArray[j] < currentmin){ //find the minimum element in 'unsorted' part
        currentmin = theArray[j];
        itsposition = j;
      }
    int tmp = theArray[i];
    theArray[i] = currentmin;
    theArray[itsposition] = tmp;
  }
}
```
