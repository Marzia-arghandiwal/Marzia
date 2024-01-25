// Caculator project
import java.util.Scanner;

// 1. create a class 
public class CalculatorProject
{

// 3. create five different functions for performing five different operation
void add(int a, int b)
{
	int result = a + b;
	System.out.println(a +" + "+ b + " = "+ result);

}
void sub(int a, int b)
{
	int result = a - b;
	System.out.println(a +" - "+ b + " = "+ result);

}
void mul(int a, int b)
{
	int result = a * b;
	System.out.println(a +" * "+ b + " = "+ result);

}
void dev(int a, int b)
{
	int result = a / b;
	System.out.println(a +" / "+ b + " = "+ result);

}
void mod(int a, int b)
{
	int result = a % b;
	System.out.println(a +" % "+ b + " = "+ result);

}




// 2. create the main method
public static void main(String[] args) {

Scanner obj = new Scanner(System.in);

// 5. take the data from the user
System.out.println("Enter the first number: ");
int n1 = obj.nextInt();

// 6. take the operator form the user 
System.out.println("Enter the operator: ");
char o = obj.next().charAt(0);

System.out.println("Enter the second number: ");
int n2 = obj.nextInt();

CalculatorProject oj = new CalculatorProject();

// 4. call the function 
switch(o)
{
case '+':
	oj.add(n1, n2);
	break;
case '-':
	oj.sub(n1, n2);
	break;
case '*':
	oj.mul(n1, n2);
	break;
case '/':
	oj.dev(n1, n2);
	break;
case '%':
	oj.mod(n1, n2);
	break;
default:
	System.out.println("Invalid operator");
}
}
	
}

