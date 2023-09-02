// public class prime{
// 	boolean isprime(int n){
// 		int flag;
// 		if(n==1||n==0)
// 			System.out.println("not prime number")
		
// 		for(int i=2;i*i<n;i++){
// 			if(n%i==0)
// 				flag=1;
// 		}
// 		if (flag==1){
// 			System
// 		}
	
// 	}
// 	public static void main(String[] args) {
		
// 	}
// }
// /*
// class prime{
// 	public static void main(String[] args) {
// 		int no,N=30;
// 		int flag,i;

// 	}
// }*/
public class prime{
	public static void main(String[] args) {
		int num=30,count;
		for(int i=0;i<=num;i++){
			count =0;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					count ++;
					break;
				}
			}
			if(count==0){
				System.out.println(i);
			}
		}

	}
}