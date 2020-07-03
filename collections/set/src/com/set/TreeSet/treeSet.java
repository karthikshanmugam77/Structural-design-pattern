package com.set.TreeSet;


import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class treeSet {
	public static void createSet(Scanner sc , TreeSet<String> nameSet)
	{
		System.out.println("Enter number of names...");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++)
		{
			int temp = i+1;
			System.out.println("ENter name " + temp +"...");
			nameSet.add(sc.nextLine());
		}
		System.out.println("SET added successfully...");		
	}
	
	public static void showSet(TreeSet<String> nameSet)
	{
		System.out.println("Showing using for-each...");
		for(String s : nameSet)
		{
			System.out.println(s);
		}
		System.out.println("Showing using Iterator...");
		Iterator<String>  i = nameSet.iterator();
		while( i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("Showing using LAMBDA EXPRESSION...");
		nameSet.forEach(System.out::println);
	}

	public treeSet() {
		
		Scanner sc = new Scanner(System.in);
		TreeSet <String> nameSet = new TreeSet<String>();
		System.out.println("HashSet initialized...");
		createSet(sc , nameSet);
		System.out.println("Do you want to know SIZE of the SET...(y/n)");
		char a = sc.next().charAt(0);
		if(a=='y')
		{
			System.out.println("SET size = " + nameSet.size() +" ...");
		}
		System.out.println("Do you want see result... (y/n).");
		char c = sc.next().charAt(0);
		if(c=='y')
		{
			showSet(nameSet);
		}
		System.out.println("Built successful...");
	}


}
