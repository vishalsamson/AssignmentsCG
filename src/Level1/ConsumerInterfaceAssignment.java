package Level1;

import java.util.function.Consumer;

public class ConsumerInterfaceAssignment {
	public static void main(String[] args) {
		Consumer<String> con=(t)->{
			t+=" add on";
			System.out.println(t);
		};
		
		String[] arr= {"Vishal","Pratik","Chaitanya","Rohan","Yogesh"};
		for(String i: arr) {
			con.accept(i);
		}
	}

}
