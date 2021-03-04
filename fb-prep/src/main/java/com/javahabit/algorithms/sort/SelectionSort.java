package com.javahabit.algorithms.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numberArray = {2,4,22,18,1,16,2,14,4,13,6,3,23,7,30};
        System.out.println("Before sort");
        for(int value: numberArray){
            System.out.println(value);
        }
        selectionSort(numberArray);
    }

    private static void selectionSort(int[] numberArray) {
        int minIndex;
        //Step 1: Iterate over array
        for(int currentIndex=0; currentIndex< numberArray.length; currentIndex++) {
            //Step 2: find the minIndex
            minIndex = findMinIndex(numberArray, currentIndex);
            //Step 3: swap minValue with the current array Index
            swap(numberArray, minIndex, currentIndex);
        }
        
        System.out.println("After sort");
        
        //Step 4: Print sorted array
        for(int value: numberArray){
            System.out.println(value);
        }
    }

    private static void swap(int[] numberArray, int minIndex, int currentIndex) {
        int temp = numberArray[minIndex];
        numberArray[minIndex] = numberArray[currentIndex];
        numberArray[currentIndex]= temp;
    }

    private static int findMinIndex(int[] numberArray, int startIndex) {
        int minIndex=startIndex;
        int minValue = numberArray[startIndex];
        for(int i =startIndex+1; i< numberArray.length; i++){
            if(numberArray[i]< minValue){
                minIndex = i;
                minValue=numberArray[i];
            }
        }

        return minIndex;
    }
    
}
