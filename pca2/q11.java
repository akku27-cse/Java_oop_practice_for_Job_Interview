import java.util.*;
class Date{
	int day,month,year;
	Date(){
		day=1;
		month=1;
		year=1970;
		System.out.println(day+"/"+month+"/"+year);
	}
	Date(int m,int y){
		month=m;
		year=y;
		System.out.println(month+"/"+year);
	}
	Date(int d,int m,int y){
		day=d;
		month=m;
		year=y;
		System.out.println(day+"/"+month+"/"+year);
	}
	void setDate(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the date:");
		 day=sc.nextInt();
		System.out.println("enter month:");
		 month=sc.nextInt();
		System.out.println("enter  year:");
		 year=sc.nextInt();
		/*day=da;
		month=mon;
		year=ye;*/
	}
	int getDay(){
    return this.day;
	}
	int getMonth(){
		return this.month;
	}
	int getYear(){
		return this.year;
	}
	void Display(){
		System.out.println(this.day+"/"+this.month+"/"+this.year);
	}
}
class q11{
	public static void main(String[] args) {
		Date d=new Date();
		Date d1=new Date(1,1970);
		Date d2=new Date(1,1,1970);
		d.setDate();
		d.getYear();
		d.getMonth();
		d.getDay();
		d.Display();
	}
}