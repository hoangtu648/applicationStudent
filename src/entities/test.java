package entities;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		List<String> string = new ArrayList<>();
		string.add(new String("a"));
		string.add(new String("b"));
		string.add(new String("c"));
		String[] test = {"a", "b", "c"};
		String content = String.join(", ", string);
		System.out.println(content);
		
	}
}
