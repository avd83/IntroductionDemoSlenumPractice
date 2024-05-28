package Javastreams;

import java.util.ArrayList;

public class Javastreams {

	public static void main(String[] args) {
		
		//Count names start with A
		ArrayList<String> names =  new ArrayList<String>();
		names.add("Abhay");
		names.add("Apoorv");
		names.add("Pallavi");
		names.add("Kamal");
		names.add("Vijay");
		
		int count=0;
		for(int i=0;i<names.size();i++)
		{
			String actual = names.get(i);
			
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
