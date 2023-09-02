class Person{
String name="santu jana";
String dept="cse";
Person(){
	System.out.println("your name is:"+name);
	System.out.println("your dept is "+dept);
}

}
class Student extends Person{
int roll,cgpa;
String sem;
 Student(int r,int c,String s){
roll=r;
cgpa=c;
sem=s;
System.out.println("your roll no is ="+roll);
System.out.println("your cgpa is="+cgpa);
System.out.println("your swm="+sem);
}
}
class Employee extends Person{
int empid=101;
String designation="null";
Employee(){
System.out.println("your empid="+empid);
System.out.println("your designation="+designation);
}

}
class q1{
public static void main(String[] args) {
	Person p=new Person();
	Person p1=new Student(2,8,"5th");
	Person p11   =new Employee();
	/*
//	p.Person();
    Student su=new Student(2,8,"5th");
    Student su1=new Person();
  //  su.Student(27,8,"5th");
    //su.Person();
    Employee emp=new Employee();
    Employee emp1=new Person();
    //emp.Employee();
    //emp.Person();
    */
    //Employee emp1=new Person();
}
}