package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class arrayList {
	
	public static void createList(Scanner sc , ArrayList<String>	 nameList)
	{
		System.out.println("Enter number of names...");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++)
		{
			int temp = i+1;
			System.out.println("ENter name " + temp +"...");
			nameList.add(sc.nextLine());
		}
		System.out.println("List added successfully...");		
	}
	
	public static void showList(ArrayList<String> nameList)
	{
		System.out.println("Showing using for-each...");
		for(String s : nameList)
		{
			System.out.println(s);
		}
		System.out.println("Showing using Iterator...");
		Iterator<String>  i = nameList.iterator();
		while( i.hasNext())
		{
			System.out.println(i.next());
		}
	}

	public arrayList() {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String>  nameList = new ArrayList<String>();
		System.out.println("ArrayList initialized...");
		createList(sc , nameList);
		System.out.println("Do you want to sort the list...(y/n)");
		char a = sc.next().charAt(0);
		if(a=='y')
		{
			Collections.sort(nameList);
			System.out.println("List sorted...");
		}
		System.out.println("Do you want see result... (y/n).");
		char c = sc.next().charAt(0);
		if(c=='y')
		{
			showList(nameList);
		}
		System.out.println("Built successful...");
	}

}
