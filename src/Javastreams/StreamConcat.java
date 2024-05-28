package Javastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class StreamConcat {

	public static void main(String[] args) {
		
		//Concatenate the 2 lists arrays using stream->sort it out and print it
		
		ArrayList<String> names =  new ArrayList<String>();
		names.add("Abhay");
		names.add("Apoorv");
		names.add("Pallavi");
		names.add("Kamal");
		names.add("Vijay");
			
		List<String> names1 = Arrays.asList("Kamal","Shamal","Ram","Shyam");
		
		Stream <String> newStream = Stream.concat(names.stream(),names1.stream());
		newStream.sorted().forEach(s->System.out.println(s));
		
		

	}

}
