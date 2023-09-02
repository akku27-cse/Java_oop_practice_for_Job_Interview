import java.util.*;
class search{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]={10,40,58,80};
		int f=0;
		System.out.println("Enter the number you serah:");
		int n=sc.nextInt();
		for(int i=0;i<=3;i++){
			if(a[i]==n){
				f=1;
			}
			else
				f=0;
		}
			if(f==1){
				System.out.println("number is founded");
			}
			
			else
				System.out.println("number not found");
		}
	}


	
interface rect{
	abstract public void rect();
} 
class test implements rect{
	public void rect(){
		int height=7;
		int weidth=8;
		int area=height*weidth;
		System.out.println("the area of rect is="+area);
	}
}