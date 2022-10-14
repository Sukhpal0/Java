import java.util.Scanner;

public class object 
{
    public void addition()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first no.");
           int  x=sc.nextInt();
            System.out.println("Enter second no.");
           int  y=sc.nextInt();
           int z=x+y;
           System.out.println(z);
        }
             
    }

public static void main(String[] args)
{ object myobj=new object();
    myobj.addition();
}}