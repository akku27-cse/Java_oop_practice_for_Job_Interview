// class p{
// 	void add(int x,int y){
// 		int c;
// 		c=x+y;
// 		System.out.println(c);
// 	}
// 	void add(int e,double f){ 
// 		double d;
// 		d=e+f;
// 		System.out.println(d);
// 	}
// }
// class polymorphisum{
// 	public static void main(String[] args) {
// 		p ob=new p();
// 		ob.add(4,4.7);
// 	}
// }

class dynamic{
	void add(int x,int y){
		int c;
		c=x+y;
		System.out.println("this is first"+c);
	}
}
class  dynamic1 extends dynamic{
	void add(int x,int y){
		int c;
		c=x+y;
		System.out.println(c);
	}
}


class polymorphisum{
	public static void main(String[] args) {
		dynamic d=new dynamic();
		d.add(4,5);
	}
}