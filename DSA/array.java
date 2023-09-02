import java.util.Scanner;
class array{
	public static void main(String[] args) {
		int arr[];
		int no;
		int c;
		int search;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many number:");
		no=sc.nextInt();
		arr=new int[no];
		System.out.println("enter the element:");
		for(c=0;c<no;c++){
			arr[c]=sc.nextInt();

		}
		System.out.println("Enter which number are search:");
        search=sc.nextInt();
		for (c=0;c<no;c++ ) {
			if (c==search) {
				System.out.println("found");
				
			}
			
			
		}


	}
}