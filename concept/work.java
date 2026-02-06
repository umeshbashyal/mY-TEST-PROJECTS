
import java.util.*;
import java.util.random.*;


public class work {
    public static void main(String[] args){
        
        Random r= new Random();
        int r1=r.nextInt(10);
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        
        if(r1==num){
            System.out.println("Yours answer is correct");
        }
        else{
            System.out.println("Yours answer is  noot correct");
        }
        System.out.println("This os random number:  "+ r1);
        System.out.println(num);
        






    }

}
