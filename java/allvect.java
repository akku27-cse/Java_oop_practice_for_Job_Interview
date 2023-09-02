import java.util.Vector;
class allvect{
public static void main(String[] args) {
	int i;
	Vector vect=new Vector();
	vect.add("java");
	vect.add("php");
	for(i=0;i<vect.size();i++){
		System.out.println(vect.get(i));
	}
}
}