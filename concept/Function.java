// package concept;
// import java.util.*;

// public class Function {

//     public static int calculatesum(int a , int b){
//         int sum=a+b;
//         return sum;
//     }


//     public static void main(String[] args){
//          Scanner sc= new Scanner(System.in);
//          int a=sc.nextInt();
//          int b=sc.nextInt();
        
//          int sum= calculatesum(a,b);
//          System.out.println(sum);

//     }
// }


// Make function to  give product of two number

// import java.util.*;
// public class Function{
//     public static int calproduct(int a,int b)
//     {
//         int pro=a*b;
//         return pro;


//     }


//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int a= sc.nextInt();
//         int b=sc.nextInt();

//      int pro=calproduct(a,b);
//         System.out.println(pro);


//     }
// }

//  factorial of a number

// import java.util.*;

// public class Function{


//     public static  int pfactio(int a){

//     int fact=1;
//     for( int i=a;i>1;i--){
    
//      fact=fact*i;
// }
// return fact;
//     }
//     public static void main(String[] args){

//         Scanner sc= new Scanner(System.in);
//         int a=sc.nextInt();
//  int fact= pfactio(a);
// System.out.println(fact);
//     }

// }


// ***Enter 3 number from user and make a function to print their average***********
/* import java.util.*;

 public class Function {

    public static int navg(int n1, int n2, int n3){
         int avg=(n1+n2+n3)/3;
         return avg;

    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();

        int avg=navg(n1,n2,n3);
        
        System.out.println(avg);

}
}

*/


// Find greater of two numbers using static method

/* 
import java.util.*;
public class Function{
 public static void Greatest(int a, int b){

     if(a>b){
          System.out.println("a is greater");
     }
     else{
          System.out.println("b is greater");
     }
 }

     public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a= sc.nextInt();
int b= sc.nextInt();

Greatest(a, b);

}
}
*/

// Print even numbers from 1 to 10 using function

import java.util.*;
public class Function{

public static void Return_even(int a){

     for(int i=1;i<a;i++){
          if(i%2==0){
               System.out.println(i);
          }
     }
}

     public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

Return_even( a);
}
}