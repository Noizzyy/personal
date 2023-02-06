// Parameterized constructor
// Constructor with arguments(or you can say parameters) is known as Parameterized constructor.
public class Preperson {
    String pername;
	String pergender;
	double perweight;
	int pernumOfJowa;

Preperson(String name, String gender, double weight, int numOfJowa){
    this.pername = name;
    this.pergender = gender;
    this.perweight = weight;
    this.pernumOfJowa = numOfJowa;
}
   void name(){
    System.out.println(pername + "\n" + pergender + "\n" + perweight+ "\n"+ pernumOfJowa );
   } 
   public static void main(String[] args) {
     Preperson per1 = new Preperson("Alex", "Male", 66.8, 2);
     Preperson per2 = new Preperson("David", "Male", 78, 8);
     Preperson per3 = new Preperson("Rovic", "Male", 62, 1);
     per1.name();
     per2.name();
     per3.name();
   }
}

