import java.util.Scanner;
public class palindrome{
public static void main(String[] args){
int n;
int reversenum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
n=sc.nextInt();
for(int i=n-1;i>0;i--){
int a=n%10;
reversenum=reversenum*10+a;
n=n/10;
}
if(n==reversenum)
System.out.println("Number is palindrome");
else
System.out.println("Number is not palindrome");
}
}
