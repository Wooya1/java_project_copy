package constructor;

public class PersonTest {
   
	 public static void main(String[] args) {
		  Person lsy = new Person();
		  lsy.name = "조민우";
		  lsy.height = 176F;
		  lsy.weight = 102F;
		  lsy.shwoInfo();
		  
		  Person lsy2 = new Person("조민우");
		  lsy.height = 176F;
		  lsy.weight = 102F;
		  lsy.shwoInfo();
		  
		  
		  
		  Person lsy3 = new Person("조민우",176F,102F);
		  
//		  personKim.name = "김유신";
//		  personKim.weight = 85.5F;
//		  personKim.height = 180.0F;
//		
//		  Person personLee = new Person("이순신", 175, 75);
	 }
}
