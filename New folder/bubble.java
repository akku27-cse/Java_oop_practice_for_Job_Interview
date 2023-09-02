import java.util.Scanner;
public class bubble{
	public static void main(String[] args) {
		bubblesort bu=new bubblesort();
		bu.bubbleSort();
	}
}
class bubblesort{
Scanner sc=new Scanner(System.in);
void bubbleSort(){
int a[];
int n;
int i;
int j;
int temp;
System.out.println("Enter the number of array :");
n=sc.nextInt();
System.out.println("Enter the nnumber");
for(i=0;i<n;i++){
	a[i]=sc.nextInt();

}	
for(i=1;i<n;i++)
for(j=0;j<(n-1);j++)
	if(a[j]>a[j+1]){
		temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
	}
	System.out.println("after sorting-->>");
	for(i=0;i<n;i++)
		System.out.println(a[i]);

}
}