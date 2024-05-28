
class Conditionswithforloop 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,4,5,6,8};
		
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i] % 3 == 0)
			{
				
				System.out.println(arr[i]);
				//break;
				
			}
			else
			{
			System.out.println(arr[i] + "not multiple of 2");	
			}
				
			
		}

	}

}
