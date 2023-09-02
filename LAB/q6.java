public class q6{
	public static void main(String[] args) {
		dog d=new dog();
		d.eat();
		d.brak();
	}
}
class Animal{
	void eat(){
		System.out.println("all animal can eat");

	}
}
class dog extends Animal{
	void brak(){
		System.out.println("dog are barking");
	}
}