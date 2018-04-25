package pls;

import java.util.Scanner;

class highest{
    int high;
    int arr[];
    int n;
    public static void main(String[] args) {
        highest t = new highest();
        t.findHighest(0);
        t.printHighest();
     }
    //method to assign numbers to array
    highest(){
    		Scanner input = new Scanner(System.in);
        n=8;
        arr = new int[9];
        System.out.println("Enter in 8 numbers to find highest number in array: ");
        input.nextInt();
        for (int i = 0; i < arr.length; i++) {  
            arr[i]=i;
        }
        high = arr[0]; 
        }
   
    //method to print out whatever number was the highest
    public void printHighest(){
        System.out.println("highest = "+high);
    }
    //method to find highest
    public void findHighest(int i){
        //if number is greater than n-1 return whatever was found
    		if(i > n-1){
            return;
        }
    		//recursion to see if array[i] is larger than whatever was previously highest
        if(arr[i] > high){
            high = arr[i];
        }
        findHighest(i+1);
        return;
    }
}
