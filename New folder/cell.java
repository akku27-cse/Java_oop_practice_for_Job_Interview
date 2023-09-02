public class cell{
	public static void main(String[] args) {
		
/*
question no 2
		cellph cel=new cellph();
		cel.calling();
		cel.ring();
		cel.trying();*/ 
		square sq= new square();
		sq.side=2;
		//sq.area();
		System.out.println(sq.area());

	}
}
// class cellph{
// 	public void calling(){
// 		System.out.println("callfriend");
// 	}
// 	public void ring(){
// 		System.out.println("ringing");

// 	}
// 	public void trying(){
// 		System.out.println("ryinggg...");
// 	}
// }
//question no 3::::
class square{
	int side;
public int area(){
	 return side*side;
}
}