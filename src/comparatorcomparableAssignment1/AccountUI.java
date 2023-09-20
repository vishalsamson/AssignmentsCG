package comparatorcomparableAssignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class AccountUI {
	public static void main(String[] args) {
		TreeSet<Account> allAccounts=new TreeSet<>();
		
		Account a1=new Account(1234, "Vishal", 2000, "Solapur");
		Account a2=new Account(1235, "Yogesh", 5000, "Solapur");
		Account a3=new Account(1236, "Pratik", 7000, "Sangli");
		Account a4=new Account(1237, "Omkar", 8000, "Satara");
		Account a5=new Account(1238, "Rohan", 9000, "Kolhapur");
		Account a6=new Account(1239, "Mahesh", 4000, "Nashik");
		
		allAccounts.add(a1);
		allAccounts.add(a2);
		allAccounts.add(a3);
		allAccounts.add(a4);
		allAccounts.add(a5);
		allAccounts.add(a6);
		
		
		System.out.println("---------------Default Sorting---------------");
		for(Account a:allAccounts) {
			System.out.println(a);
		}
		
		System.out.println("-------------------High to Low----------------");
		getAccountsBasedonBalanceHightoLow(allAccounts);
		
		System.out.println("-------------------Low to High----------------");
		getAccountsBasedonBalanceHightoLow(allAccounts);
		
		System.out.println("-------------------Sort Based on Location----------------");
		SortAccountsBasedOnLocation(allAccounts);
		
		
	}
	
	public static void getAccountsBasedonBalanceHightoLow(TreeSet<Account> allAccounts) {
		List<Account> templist=new ArrayList<>();
		templist.addAll(allAccounts);
		
		SortBasedOnBalanceHighToLow sortCode=new SortBasedOnBalanceHighToLow();
		Collections.sort(templist,sortCode);
		for(Account a:templist) {
			System.out.println(a);
		}
	}
	
	public static void getAccountsBasedonBalanceLowToHigh(TreeSet<Account> allAccounts) {
		List<Account> templist=new ArrayList<>();
		templist.addAll(allAccounts);
		
		SortBasedOnBalanceLowToHigh sortCode=new SortBasedOnBalanceLowToHigh();
		Collections.sort(templist,sortCode);
		
		for(Account a:templist) {
			System.out.println(a);
		}
	}
	
	public static void SortAccountsBasedOnLocation(TreeSet<Account> allAccounts) {
		List<Account> templist=new ArrayList<>();
		templist.addAll(allAccounts);
		
		Collections.sort(templist,Comparator.comparing(Account::getLocation));
		
		for(Account a:templist) {
			System.out.println(a);
		}
	}

}
