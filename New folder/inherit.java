// // public class inherit{
// // 	public static void main(String[] args) {
// // 		inh hr=new inh();
// // 		hr.x=2;
// // 		hr.y=9;
// // System.out.println(hr.sum);
// // 		herit h=new herit();
// // 		System.out.println(h.sum);
// // 	}
// // }
// // class inh{
// // 	int x;
// // 	int y;
// // 	int sum;
// // 	public inh(){
// // 		sum=x*y;
// // 	}
// // }
// // class herit extends inh{

// // }
// public class inherit{
// 	public static void main(String[] args) {
// 		 // myemp mp=new myemp();
// 		 // System.out.println(mp.id);
// 		 // System.out.println(mp.name);

//           rect rc=new rect(13,14);
//           System.out.println(rc.area);
//           racti r=new racti();
//           System.out.println(r.area);
// 	}
	
// }
// //create constructor::
// //example 1:
// // class myemp{
// // int id;
// // String name;


// // public myemp(){
// // id=27;
// // name="santu";
// // }
// // }
// //example 2::
// // class rect{
// // 	int height;
// // 	int weight;
// // 	int area;
// // 	public rect(){
// // 		height=3;
// // 		weight=5;
// //        area=height*weight;

// // 	}
// // }\


// //parameter constructor

//  class rect{
// 	int height;
// 	int weight;
// 	int area;
// 	public rect(int height,int weight){
//        area=height*weight;

// 	}
// }
// class racti() extends rect(int height,int weight){

// }

                              //inheitance//
public class inherit{
	public static void main(String[] args) {
		// add a=new add();
		// //a.x=6;
		// //a.y=7;
		// a.add();
		sub b=new sub();
        b.add();
		b.sub();
	}
}
class add{
	
		void add(){

		int x=8;
		int y=7;
	 int sum;
	 sum=x+y;
	 System.out.println(sum);

	}
	
}
class sub extends add{
	void sub(){
		 int x=8;
		 int y=7;
		 int sum;
		sum=x-y;
		System.out.println(sum);
	}
}































