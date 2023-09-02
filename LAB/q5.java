public class q5{
	public static void main(String[] args) {
		student st=new student();
		st.setData("santu",22);
		st.Displaydata();
	}
}
class student{
	String name;
	int age;
	void setData(String s,int a){
     name=s;
     age=a;
	}
	void Displaydata(){
      System.out.println("my name is"+name);
      System.out.println("my age no is"+age);
	}
}