import java.util.Scanner;
interface BasicExp{
	int hostelfee=3000;
	int examfee=1200;
void calcfee();
}
class Stipend{
	Scanner sc=new Scanner(System.in);
	int tutionfee=40000;
	//System.out.println("enter tutionfee");
	//tutionfee=sc.nextInt();
	double totalstipend;
void calstipend(){
	int cgpa;
	System.out.println("enter cgpa:");
	cgpa=sc.nextInt();
	if(cgpa<=7)
		totalstipend=0.25*tutionfee;
	 else if(cgpa>7)
		totalstipend=0.40*tutionfee;
	System.out.println(totalstipend);
}

}
class total extends Stipend implements BasicExp{
public void calcfee(){
	super.calstipend();
	double totalamount;
	totalamount = tutionfee - totalstipend; 
	System.out.println("total amount="+totalamount);
}
void show(){

	//System.out.println("total amount="+totalamount);
this.calcfee();
}
}
class Asignment1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		total t=new total();
		t.show();
		//t.cgpa();
	}
}