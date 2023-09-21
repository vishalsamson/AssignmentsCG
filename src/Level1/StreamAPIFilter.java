package Level1;

import java.util.stream.Stream;

public class StreamAPIFilter {
	public static void main(String[] args) {
		Stream.of("Vishal","Pratik","Chaitanya","Rohan","Yogesh","Chetan")
		.filter((x)->(x.startsWith("C")))
		.forEach((x)->{
			System.out.println(x);
		});
		
	}

}
