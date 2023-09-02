import java.util.Scanner;
class Sem5{
	public static void main(String[] args) {
		System.out.println("hello world");
		//data type and variable
		int s=20;
		System.out.println(s);
		// user input
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1:");
		int a=sc.nextInt();
		System.out.println("enter number 2");
		int b=sc.nextInt();

		System.out.println(a+b);
		//pratice1
		System.out.println("enter sub 1");
		float sub=sc.nextFloat();
        System.out.println("enter sub 2");
        float sub2=sc.nextFloat();
        float cgp=(sub+sub2)/20;
        System.out.println(cgp);
//pratcie 2
     System.out.println("enter your name:");
     String name=sc.next();
     System.out.println("Eneter your location:");
     String location=sc.next();
     System.out.println("my name is"  +  name  + "and i am from" + location); 
     //pratice {given varialbe int or not}
     System.out.println(sc.hasNext()) ;    

	}
}