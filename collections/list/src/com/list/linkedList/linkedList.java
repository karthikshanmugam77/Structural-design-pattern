package com.list.linkedList;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class linkedList {
	public static void createList(Scanner sc , LinkedList<String>	 nameList)
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
	
	public static void showList(LinkedList<String> nameList)
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

	public linkedList() {
		
		Scanner sc = new Scanner(System.in);
		LinkedList<String>  nameList = new LinkedList<String>();
		System.out.println("LinkedList initialized...");
		createList(sc , nameList);
		System.out.println("Do you want to sort the list...(y/n)");
		char a = sc.next().charAt(0);
		if(a=='y')
		{
			Collections.sort(nameList);
			System.out.println("List sorted...");
		}
		System.out.println("Do you want to Reverse the list...(y/n)");
		char b = sc.next().charAt(0);
		if(b=='y')
		{
			Collections.reverse(nameList);
			System.out.println("List Reversed...");
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
