public class q7{
	public static void main(String[] args) {
		areaSpace ar=new areaSpace();
		ar.area(7);
		ar.area(5,4);
		ar.area(3,2,4);
	}
}
class areaSpace{
	void area(float r){
		float cr=3.14f*r*r;
		System.out.println("area of circle is ="+r);

	}
	void area(int length,int breadth){
		int rc=length*breadth;
		System.out.println("area of ractengale ="+rc);
	}
	void area(int length,int breadth,int height){
		int cub=2*(length+breadth+height);
		System.out.println("area of cub="+cub);
	}
}