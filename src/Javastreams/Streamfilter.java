package Javastreams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Streamfilter {

	public static void main(String[] args) {
		
		//Count names start with A ?
		
		ArrayList<String> names =  new ArrayList<String>();
		names.add("Abhay");
		names.add("Apoorv");
		names.add("Pallavi");
		names.add("Kamal");
		names.add("Vijay");
		
		//no life for intermediate operation if there is no terminal operation
		//terminal operation will execute only if intermediate(filter) operation return true
		//how to use filter in stream API
		long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		//create a array list in stream and count the name start with M
		long d = Stream.of("Abhay","Apoorv","Mitansh","Mihika").filter(s->s.startsWith("M")).count();
		System.out.println(d);
		
		//Print the names which are having length more then 5?
		names.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
		
		//Print single name which are having length more then 5 and ?
		names.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));
	}

}
