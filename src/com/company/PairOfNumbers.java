package com.company;

import java.util.ArrayList;

public class PairOfNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,-2,4,5,-9,0,10,40};
        System.out.println(pairOfNumbersSolution(arr, 4 ));
    }

    public static ArrayList<ArrayList<Integer>> pairOfNumbersSolution(int[] numbers, int key){
        ArrayList<ArrayList<Integer>> listOfResults = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1;j<numbers.length;j++){
                try{
                    if(numbers[i]+numbers[j]==key || numbers[i]-numbers[j]==key || numbers[i]*numbers[j]==key || ((numbers[i]/numbers[j]==key) && (numbers[i]%numbers[j]==0)) || ((numbers[j]/numbers[i]==key) && (numbers[j]%numbers[i]==0))){
                        ArrayList<Integer> numbersPairs = new ArrayList<>();
                        numbersPairs.add(numbers[i]);
                        numbersPairs.add(numbers[j]);
                        listOfResults.add(numbersPairs);
                    }
                }
                catch (ArithmeticException e) {}

            }
        }
        return listOfResults;
    }



}

