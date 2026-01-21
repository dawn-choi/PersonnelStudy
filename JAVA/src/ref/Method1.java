package ref;

public class Method1 {
	public static void main(String[] args) {
		
		
		Student a = new Student(); 
		
		Student b = a; 
		
		a = null;
		
		System.out.println(b);
		System.out.println(a);
	}

}
