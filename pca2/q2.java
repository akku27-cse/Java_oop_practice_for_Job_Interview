abstract class Shape{
int dim1,dim2;
float dim3;
	Shape(){
		System.out.println("this is a Shape");
	}
	abstract void Area();
}
class Rect extends Shape{
	Rect(){
		System.out.println("this is a rect");

	}
	void Area(int d,int d1){
		dim1=d;
		dim2=d1;
     int area=dim1*dim2;
     System.out.println("area of rect="+area);
	}
	public void Area(){

	}

}
class Square extends Shape{
	Square(){
System.out.println("this is Square");
	}
	void Area(int d1){
		dim1=d1;
		int area=dim1*dim1;
System.out.println("area of Square="+area);
	}
	public void Area(){

	}
}
/*class Triangle extends Shape{
	Triangle(){

	}
	void Area(){

	}
	public void Area(){

	}
}*/
class Circle extends Shape{
	Circle(){
System.out.println("this is circle");
	}
	void Area(float d3){
    dim3=d3;
		float area=3.14f*dim3*dim3;
System.out.println("area of Square="+area);
	}
	public void Area(){

	}
}
class Parallelepipped extends Rect{
	Parallelepipped(){
		System.out.println("this is a Parallelepipped");

	}
	void Area(int d,int d1){
		dim1=d;
		dim2=d1;
       int area=dim1*dim2;
       System.out.println("area of Parallelepipped="+area);
	}
}
class Cube extends Square{
	Cube(){
System.out.println("this is Cube");
	}
	void Area(int d1){
    dim1=d1;
		int area=6*dim1*dim1;
System.out.println("area of Square="+area);
	}
}
class Sphere extends Circle{
	Sphere(){
     System.out.println("this is Sphere");
	}
	void Area(float d3){
		 dim3=d3;
		float area=3.14f*dim3*dim3;
System.out.println("area of Square="+area);

	}
}
class q2{
	public static void main(String[] args) {
		Rect re=new Rect();
		re.Area(8,5);
		Rect re1=new Parallelepipped();
		re1.Area(9,8);
		Circle c=new Circle();
		c.Area(5.5f);
		Circle c1=new Sphere();
		c1.Area(9.5f);
		Square s=new Square();
		s.Area(8);
		Square s1=new Cube();
		s1.Area(9);


	}
}