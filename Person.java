package xenosisweek2;

public class Person {
static String name ;
static int age;
public Person(String name, int age) {
    Person.name = name;
    Person.age = age;
}

public   void displayName() {
	System.out.println("Name :"+name);
}
public  void displayAge(){
	System.out.println("Age:"+age);
}
//Encapsulation 
public  static void displayalldetails() {
	 Person person =new Person("Sai teja" , 24);
	    person.displayName();
	    person.displayAge();
}
public static void main(String[] args) {
 Person.displayalldetails();
}
}
 