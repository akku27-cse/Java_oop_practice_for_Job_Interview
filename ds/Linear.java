import java.util.*;
class Linear{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int val[]={7,8,9,10,11,12};
		System.out.println("enter your element to  be search");
	    int search=sc.nextInt();
	    int i=0;
	    int flag=0;
	    while(i<6){
	
	    	if(val[i]==search){
	    		System.out.println("found");
	    		// flag=1;
	    	}
	    	else
	    		i=i+1;
	    
	   /* if(flag==1){
	    	System.out.println("number is found");
	    }
	    else
	    {
	    	System.out.println("number is not found");
	    }*/
	}
	}
}