public class insert{
	public static void main(String[] args) {
		int arr[]={7,8,9,53,25,47};
		insertSort ins=new insertSort();
		ins.sort(arr);
		ins.print(arr);
	}
}
class insertSort{
	void sort(int arr){
		int n=arr.length;
		for (int i=0;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	void print(){
		int n=arr.length;
		for(int i=0;i<n;++i)
			System.out.println(arr[i]+"");

	}
}
