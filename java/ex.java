import java.util.*;
public class ex {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter first no. : ");
        int a = sc.nextInt();
        System.out.println("enter second no. : ");
        int b = sc.nextInt();
        System.out.println("choose operator");
        int operator = sc.next().charAt(0);

        if (operator == '+'){
            System.out.println(a+b);
           
        }
         else {
                System.out.println(a-b);
            }
    }/*  */
}

