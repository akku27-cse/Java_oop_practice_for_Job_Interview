class Selection{
	public static void main(String[] args) {
		int a[]={9,7,4,2,6};
		int i=0;
		int j,loc;
		while(i<4){
			int temp=a[i];
			j=i+1;
			while(j<5){
				if(temp>a[j]){//7>9
				temp=a[j];}
				loc=j;
			
				j=j+1;
			}
			if(a[loc]<a[i]){ 
               int temp1=a[loc];
               a[loc]=a[i];
               a[i]=temp1;
               i=i+1;
			}
		}
		System.out.println(a[5]);
	}
}