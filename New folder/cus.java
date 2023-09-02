public class cus{
	public static void main(String[] args) {
		 // myemp mp=new myemp();
		 // System.out.println(mp.id);
		 // System.out.println(mp.name);

          rect rc=new rect(13,14);
          System.out.println(rc.area);
	}
	
}
//create constructor::
//example 1:
// class myemp{
// int id;
// String name;


// public myemp(){
// id=27;
// name="santu";
// }
// }
//example 2::
// class rect{
// 	int height;
// 	int weight;
// 	int area;
// 	public rect(){
// 		height=3;
// 		weight=5;
//        area=height*weight;

// 	}
// }\


//parameter constructor

 class rect{
	int height;
	int weight;
	int area;
	public rect(int height,int weight){
       area=height*weight;

	}
}