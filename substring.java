import java.io.*;
import java.util.*;
class substring
{
  public static void main(String args[])
  {
     String s;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string:");
     s=sc.next();
     System.out.println(s.substring(2,4));
     System.out.println(s.substring(2));
  }
}