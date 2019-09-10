package literals;

public class Literals_class 
{
	int a = 10 ;
	int octa = 0122;
	int hexa = 0x44;
	String name="deshan";
	char c = 'A';
	

	public void method1()
	{
		System.out.println(a);
		System.out.println(octa);
		System.out.println(hexa);
		System.out.println(name);
		System.out.println(c);
	}
	
	
public static void main(String[] args) {
		
		Literals_class obj = new Literals_class();
		obj.method1();
		
		
	}

}


