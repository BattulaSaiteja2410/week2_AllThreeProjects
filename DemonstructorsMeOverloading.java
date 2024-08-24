package xenosisweek2;

public class DemonstructorsMeOverloading {
public static void test(int i, int j) {
	System.out.println("test method with int arg"+i+j);
}
public static void test(String a) {
	System.out.println("test method with String arg"+a);
}
public static void test(Boolean b) {
	System.out.println("test method with Boolean arg"+b);
}
public static void test(int i ,String a,double d, char ch, boolean n) {
	System.out.println("test method wit all the args"+i+a+d+ch+n);
}
public static void main (String[]args) {
	DemonstructorsMeOverloading.test(1,3);
	DemonstructorsMeOverloading.test("Xenosis");
	DemonstructorsMeOverloading.test(true);
	DemonstructorsMeOverloading.test(1,"Sai Teja",1.02,'A',true);
}
}
