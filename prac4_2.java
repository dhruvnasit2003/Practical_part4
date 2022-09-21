import java.util.*; 
class check extends Exception 
{ public check(String s)
 { super(s); 
}
 }
 class Prac4_2 { 
class demo
 { static void f_(int a,int b)throws check
 { throw new check("There is an Exception");
 }
 }
 public static void main(String[] args) 
{ 
try {
 demo.f_(4,8); 
} 
catch (check e) {
 System.out.println(e); 
}

}
 }

