class bubblesort{
	public static void main(String[] args) {
		
		int a[]={5,4,8,2,7,1};
		//for(int i=1;i<=5;i++){
          for(int j=0;j<=5;j++){
          	if (a[j]>a[j+1]) {
          		int temp=a[j];
          		a[j]=a[j+1];
          		a[j]=temp;
          	}

          
          for( int i=0;i<5;i++)
          System.out.println(a[i]);
  }
  }
}