import shapePack.Shape3d;
class parallelpiped implements Shape3d{
int l=9,p=9,h=2;
public void clacVolume(){
	System.out.println("parallelpiped volume is ="+l*p*h);
}
public void clacSurface(){
	System.out.println("parallelpiped Surface ="+l*p*p*h*h*l);
}
}
class q21{
	public static void main(String[] args) {
		
		parallelpiped p=new parallelpiped();
		p.clacSurface();
		p.clacVolume();

	}
}