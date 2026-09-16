import java.util.*;
public class calculator {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter first no. : ");
        int a = sc.nextInt();
        System.out.println("enter second no. : ");
        int b = sc.nextInt();
        System.out.println("choose case");
        int operator = sc.nextInt();

    switch(operator){
        case 1: System.out.println("addition " + (a+b));
        break ;
        case 2: System.out.println("substraction " +(a-b));
        break ;
        case 3 : System.out.println("multiplication "+(a*b));
        break ;
    }  
    }
    
}
