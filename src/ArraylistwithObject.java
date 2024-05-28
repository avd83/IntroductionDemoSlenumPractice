import java.util.ArrayList;

public class ArraylistwithObject {

	//private static char[] name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList is dynamic index added in class and extract through the object.
		ArrayList<String> a = new ArrayList<String>();
		a.add("Abhay");
		a.add("Dere");
		a.add("Apoorv");
		a.add("Pallavi");
		
		System.out.println(a.get(0));
		System.out.println(a.remove(1));
		
		// if no string in Arraylist then below statement will execute
		System.out.println(a.isEmpty());
		
		//below contains methods confirms that same string available in array or not in true/false
		System.out.println(a.contains("Pallavi"));
		
		//in Arraylist we are using Size methods instead on length in array
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}

		for ( String name :a)
		  {
			System.out.println(name);
			
		   }
		
		}
	}

