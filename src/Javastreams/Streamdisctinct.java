package Javastreams;

import java.util.Arrays;
import java.util.List;


public class Streamdisctinct {

	public static void main(String[] args) {
		// print the distinct number of this array --> sorted out.

		List<Integer> numbers = Arrays.asList(13, 5, 3, 7, 5, 9, 6, 5);

		numbers.stream().distinct().sorted().forEach(s -> System.out.println(s));
	}

}
