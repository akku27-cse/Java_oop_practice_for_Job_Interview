import java.util.*;
class Fmq1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d[]=new int[100];
		  System.out.println("enter Array size:");
          int n=sc.nextInt();
          System.out.println("Enter element:");
          for(int i=0;i<n;i++)
          	d[i]=sc.nextInt();
          for (int i=1;i<n;i++){
          	int temp=d[i];
          int j=i-1;
          while(j>=0 && temp<d[j]){
          	d[j+1]=d[j];
          	j=j-1;
          }
          d[j+1]=temp;
      }
      System.out.println("Sorted Array are:");
      for(int i=0;i<n;i++)
      	System.out.println(d[i]);

	}

}