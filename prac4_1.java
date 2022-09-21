import java.util.*;
 public class prac4_1 { 
    static public void main(String[] args) 
    { Scanner sc=new Scanner(System.in);
         System.out.println("Give the number which you want to divide with 0"); 
         int a=sc.nextInt(); 
         try 
            { 
                System.out.println(a/0); 
            } 
        catch (Exception e) 
        { 
            System.out.println("The division of any number with zero is not possible");
        }
    }
}