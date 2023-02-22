import java.util.*;
class e1
{
    public static void main(String args [])
    {
        int b,r=0,n;
        System.out.println("enter a number = ");
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        int a=n;
        while(n!=0)
        {
            b = n%10;
            r = r*10+b;
            n/=10;
        }
        if(a==r)
        {
            System.out.println("this number is palindrom");
        }
        else
        {
            System.out.println("this number is not palindrom");
        }
    }
}           