import java.util.*; 
public class Prac4_3 
{ 
    public static void main(String[] args) 
    { 
     Scanner sc=new Scanner(System.in);
     int n;
     System.out.println("If you want arithmatic exception the press 1 or arrey index out of bound exception then 2"); 
    n=sc.nextInt(); 
          try
          { 
             if (n==1) 
             { 
                System.out.println(1/0); 
             } 
             if(n==2)
             { int a[]=new int[3];
                for(int i=0;i<=3;i++) 
                {
                    a[i]=sc.nextInt();
                }
             }
           } 
        catch(ArithmeticException e) 
            {
                System.out.println("There is an Arithmatic Exception");
            } 
        catch (ArrayIndexOutOfBoundsException e) 
            { 
                System.out.println("THere is ArreyIndexOutOfBound Exception");
            }
        finally 
            { 
                System.out.println("We found an Exception");
            }
    }