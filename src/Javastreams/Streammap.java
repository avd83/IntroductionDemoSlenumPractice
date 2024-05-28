package Javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streammap {

	public static void main(String[] args) {
		
		//Print the names which have last letter "a" with Upper Case? 
		
		Stream.of("Abhay","Apoorv","Mitansh","Mihika").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.print(s));
		
		//find name started with "S"-->upper case-->sort out the names
		List<String> names = Arrays.asList("Kamal","Shamal","Ram","Shyam");
		
		names.stream().filter(s->s.startsWith("S")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
		
	}

}
