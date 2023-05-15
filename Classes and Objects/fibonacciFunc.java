import java.util.*;
public class fibonacciFunc {
    
public static void fib(int n)
{
    int n1=0,n2=1,n3=0;
int c=0;
    while(c<n)
{   
    System.out.print(n1+" ");
    n3=n1+n2;
    n1=n2;
    n2=n3;

    c++;
}

    System.out.println(n1+" "+n2+" ");
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=3;

    fib(n);
}

}
