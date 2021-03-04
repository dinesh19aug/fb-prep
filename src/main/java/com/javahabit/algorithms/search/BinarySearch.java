package com.javahabit.algorithms.search;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    
    public static void main(String[] args) {
        System.out.println("Binary Search");
        List<Integer> listOfInt = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
		41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        //Pass list and search number
        boolean doesNumberExist= doBinarysearch(98, listOfInt);
        System.out.println(doesNumberExist);
    }

    private static boolean doBinarysearch(int searchValue, List<Integer> listOfInt) {
        Integer[] arrayOfInt =   listOfInt.toArray(new Integer[listOfInt.size()]);
         
        boolean isNumberExist = false;
        int min =0;
        int max = listOfInt.size() -1;
        //Do-while loop until break
        while(min<=max){
            int mid = (min + max)/2;
           
            if(arrayOfInt[mid]==searchValue){
                isNumberExist = true;
                break;
            }else if(arrayOfInt[mid]>searchValue){
                
                max=mid-1;
            }else{
                min = mid+1;
            }

        }
        return isNumberExist;
    }
    
}
