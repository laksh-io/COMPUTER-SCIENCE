import java.util.*;
public class ex2 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int button =sc.nextInt();
     /*   System.out.println(" enter the first number: ");
        int a = sc.nextInt();
        System.out.println("enter the second number: ");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("they are equal");
        }
        else{
            if(a>b){
                System.out.println("a is greater");
            }
            else{
                    System.out.println("a is lesser");
                }
            
       }  */ 

                switch(button){
                    case 1: System.out.println("hello");
                    break;
                    case 2: System.out.println("namaste");
                    break;
                    case 3: System.out.println("bonjour");
                    break;
                    default: System.out.println("invalid");
                }
    }
    
}
