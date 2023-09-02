class car{
	int wheel,mil,dist,oill;
	/*void Display(){

	}*/
	void setWheel(int w,int d,int o){
		wheel=w;
		dist=d;
		oill=o;


	}
	int getWheel(){
		return this.wheel;
	}
	int getDist(){
   return this.dist;


	}
	int getOil(){
		return this.oill;
	}
	void Display(){
		mil=this.dist/this.oill;
		System.out.println("wheel="+this.wheel);
		System.out.println("Distance="+this.dist);
		System.out.println("Oil-consumed="+this.oill);
		System.out.println("mileage="+mil);
	}

}
class q10{
	public static void main(String[] args) {
		car c=new car();
		c.setWheel(4,1700,35);
		c.getWheel();
		c.getOil();
		c.getDist();
		c.Display();
		car c1=new car();
		c1.setWheel(4,1700,30);
		c1.getWheel();
		c1.getOil();
		c1.getDist();
		c1.Display();
		
		System.out.println("compare of two "+c.equals(c1));
	}
}