
public class CorejavaBrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declared variable with value assigned
		int A = 9002;
		String FullName = "Abhay Vijaykumar Dere";		
		//boolean False;
        double dec = 5.55;
        char letter = 'A';
        
		System.out.println(A);
		System.out.println(FullName);
		System.out.println(false);
		System.out.println(dec);
		System.out.println(letter);
		
		                    //Array
		//Array with new memory location and then assigned value to array.
		int[] arr = new int[3];
		arr[0]=1;
		arr[1]=7;
		arr[2]=8;
		
		System.out.println(arr[0]);
		//for loop with direct length
		for (int i=0; i<3; i++)
		{
			System.out.println(arr[i]);
		}
		
		//Array assigned value directly to variable.
		int[] arr1= {5,6};
		
		System.out.println(arr1[1]);

		//For loop with length methods
		for(int i=0;i<arr1.length;i++)
		{
		
			System.out.println(arr1[i]);
		}
		//for loop with variable declaration
		for (int i: arr1)
		{
			System.out.println(i);
			
		}
		
		
		String[] Names = {"abhay","apoorv","pallavi"};
		
		for (int i=0; i<3; i++)
		{
			System.out.println(Names[i]);
		}
		
		String [] Name = new String[2];
		Name[0]="VijayKumar";
		Name[1]="Kamal";
		
		for (int i=0; i<Name.length; i++)
		{
			System.out.println(Name[i]);
		}
		
		//For loop using variable declaration
		for(String s : Name)
		{
			System.out.println(s);
		}
		
	}
				
}


