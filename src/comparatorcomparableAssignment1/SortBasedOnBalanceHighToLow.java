package comparatorcomparableAssignment1;

import java.util.Comparator;

public class SortBasedOnBalanceHighToLow implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		return o2.getBalance()-o1.getBalance();
	}
	

}
