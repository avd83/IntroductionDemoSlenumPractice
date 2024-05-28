package Javastreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamcollect {

	public static void main(String[] args) {
		
		List<String> li =Stream.of("Abhay","Apoorv","Mitansh","Mihika").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		
		System.out.println(li.get(0));
		
		
}
}
