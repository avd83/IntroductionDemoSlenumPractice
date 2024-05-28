
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//below code is for required to create the object and then get the result.
		Methods m = new Methods();
		//m.getData();
		String name=m.getData();
		System.out.println(name);
		
		//below methods define in different class and execute in this class
		Methods2 m2 = new Methods2();
		m2.getData();
		
	
		
		//this below method is define as static so can not required to make object for the result
		getData2();
		
	}

	// methods always return this body not in upper execution body
	
	public String getData()
	{
		System.out.println("I am Learning Selenium through the methods");
		return "Abhay";
	}
	
	public static String getData2()
	{
		System.out.println("I am Learning Selenium through the methods");
		return "Apoorv";
	}
	
}
