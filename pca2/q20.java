import java.util.*;
class Time1224{
	int hour,min,second;
	Time1224(int h,int m,int s){
     hour=h;
     min=m;
     second=s;

	}
	void Add(){

	}
	void Sub(){

	}
void Display(){
	SimpleDateFormat dateFormat;
	dateFormat =new SimpleDateFormat("hh:mm:ss a");
	System.out.peintln("Time="+dateFormat);
}
}
class q20{
	public static void main(String[] args) {
		Time1224 t=new Time1224();
		t.Display();
	}
}