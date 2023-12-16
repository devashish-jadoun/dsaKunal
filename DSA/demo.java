
import java.util.*;
class demo{

    public static void main(String[] args) {
      
       int sum = sum();

       System.out.println("addition of two number : "+sum);

    }

   static int sum(){

    int a,b,c;

      Scanner sc = new  Scanner(System.in);
      
      System.out.print("Enter the first number : ");

      a = sc.nextInt();

      System.out.print("Enter the second number : ");

      b = sc.nextInt();

      c = a + b;
      
     return c;

    }
}