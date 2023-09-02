class Box{
	int len,hei,weidth;
	Box(){
        System.out.println("this is a box vol claculate prog");
	}
	Box(int h){
		hei=h;
		System.out.println("box height="+hei);
	}
	Box(int h,int l,int w){
		hei=h;
		len=l;
		weidth=w;
		System.out.println("box height="+h);
		System.out.println("Box weidth="+w);
		System.out.println("Box length="+l);

	}
	void Vol(int h,int l,int w){
		hei=h;
		len=l;
		weidth=w;
		int vol;
		vol=hei*len*weidth;
		System.out.println("Box vol="+vol);
	}
}
class q9{
	public static void main(String[] args) {
		Box b=new Box();
      // Box b1 = new Box();
        Box b2=new Box(7);
        Box b3=new Box(7,5,8);
       b.Vol(7,5,8);
	}
}