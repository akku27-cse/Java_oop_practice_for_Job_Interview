public class assig{
	public static void main(String[] args) {
	// ********1.class and defalult const obj creating 
		num s=new num();
		//s.first(8);
		//s.last(9);
		s.num();
	
		//System.out.println(s.sum);
	
        /**const with parammeter*/
        sum su=new sum(18,10);
       // su.sum();
        /* copy const*/
        sum su1=su;
        su1.show();
        ///function over loading//**
        people pe=new people();
        pe.first(7,8);
        //single inheritance
        inherit1 in=new inherit1();
        in.add();
             in.sub();
                /* multiple inherit
                */
                inher inh=new inher();
                inh.mul();
                inh.sub();
	}
}
/* *******************1 create class in java*//////////////////
class num{
	
	public void num(){
	int first=8;
 	int last=9;
 	int sum=first*last;
System.out.println(sum);
}


}
//***************constructor*//////////////
class sum{

int sum;
	// createing parameterised with  constructor
	sum(int first,int last){
	//int first=8;
 	//int last=9;
 	//in//t sum=first*last;
		sum=first*last;
System.out.println(sum);
}
//** copy const*///
void show(){
	System.out.println(sum);
}

}	 
/* function over loading*///*********** same name and diffent parameter
class people{
	void first(int f,int w){
		int height=f*w;
		System.out.println(height);
	}
}
/*        **************Inheritance*//////////////////
//single inherit
inheritance inherit{
	void add(){
		int x=10;
		int y=9;
		int z=x+y;
		System.out.println(z);

	}
}
class inherit1 extends inherit{
	void sub(){
		int x=4;
		int y=9;
		int z=x-y;
		System.out.println(z);
	}
}
/*multiple inherit (two base class inherit one child)*/
class inher extends inherit1 implements inherit{
	void mul(){
	int x=9;
	int y=2;
	int z=x*y;
	System.out.println(z);
}
}



































