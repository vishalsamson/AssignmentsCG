package Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamAssignment2 {
public static void main(String[] args) {
	List <Account> list = new ArrayList<>();
	
	list.add(new Account(20, "omkar", 100, "beng"));	
	list.add(new Account(12, "aaditi", 9000, "Benglore"));	
	list.add(new Account(33, "digya", 32, "pune"));	
	list.add(new Account(4, "ashu", 2322, "Benglore"));	
		while(true) {
			switch(new Scanner(System.in).nextInt()) {
			case 1: printAccounts(list); break;
			case 2:  creditIntrest(list); break;
			case 3: getMinAndMaxbalance(list); break;
			case 4: List<Account> ans=getAccounts(list); printAccounts(ans); break;
			case 5: System.exit(0);
			}
		}
			
}
	
			public static void printAccounts(List <Account> list) {
				list.stream().forEach(x->System.out.println("Name= "+x.getAccountHolderName()+" AccountNumber= "+x.getAccountNumber()+" Balance= "+x.getBalance()+" LOcation ="+x.getLocation()));
			}
			public static List<Account>getAccounts(List <Account> list){
					List<Account > ans=list.stream().filter(x->x.getBalance()<10000).collect(Collectors.toList());
					return ans;
			}
			public static void creditIntrest(List <Account> list) {
				list.stream().map(x->x.getBalance()*0.02).
					forEach(x->System.out.println(x));
			}
			public static void getMinAndMaxbalance(List <Account> list) {

				Optional<Integer> min= list.stream().filter(x->x.getLocation().equals("Benglore")).map(Account::getBalance).min(Double::compare);
			
				Optional<Integer> max= list.stream().filter(x->x.getLocation().equals("Benglore")).map(Account::getBalance).max(Double::compare);
			
				System.out.println(min.get());
			
				System.out.println(max.get());
			}
}
