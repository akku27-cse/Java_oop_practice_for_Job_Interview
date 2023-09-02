class amstro{
	public static void main(String[] args) {
		
		int no=15;
		int result=0 ,result1;
		while(no!=0){
			result1=no%10;
			result=result+(result1*result1*result1);
			no=no/10;
		}
		if(no==result){
			System.out.println("this is an amstrong Number");
		}
		else{
			System.out.println("this is not amstrong number");
		}
	}
}