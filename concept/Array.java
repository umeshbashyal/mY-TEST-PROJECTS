// import java.util.Scanner;

// public class Array {

//     // public static void main(String[] args){
//     //     int [] arr={2,4,6};
//     //     System.out.print(arr[0]);
//     // }

// public static void main(String args[]){

// // int [] marks=new int[3];
// // marks[0]=34;
// // marks[1]=43;
// // marks[2]=41;
// // for(int i=0;i<3;i++){

// //     System.out.println(marks[i]);
// // }

// Scanner sc=new Scanner(System.in);
// int size= sc.nextInt();

// int [] num= new int[size];

// // input
// for(int i=0;i<size;i++){
//     num[i]=sc.nextInt()

// }

// // output
// for(int i=0;i<size;i++){
// System.out.println(num[i]);

// }

// }
// }



// Take an aray as input from the user . search for a given number x and print index at which it  occure;

import java.util.*;
public class Array{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();

    int [] num= new int[size];
    
    for(int i=0;i<size;i++){
        num[i]=sc.nextInt();
    }

    int x=sc.nextInt();
    for (int i=0;i<num.length;i++){
        if(num[i]==x){
            System.out.print("x found at index"+ i);
}}}}




























































//  import java.util.*;
// public class Array{
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// int []arr= new int[3];

// for(int i=0; i<arr.length;i++){

//     arr[i]=sc.nextInt();
// }

// System.out.println(arr[]);

// }
// }