package com.set.hashSet;


import java.util.HashSet;
import java.util.Scanner;

public class hashSet {
	
	public static void createSet(Scanner sc , HashSet<String>	 nameSet)
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
	
	public static void showSet(HashSet<String> nameSet)
	{
		System.out.println("Showing using for-each...");
		for(String s : nameSet)
		{
			System.out.println(s);
		}
		System.out.println("Showing using LAMBDA EXPRESSION...");
		nameSet.forEach(System.out::println);
	}

	public hashSet() {
		
		Scanner sc = new Scanner(System.in);
		HashSet <String> nameSet = new HashSet<String>();
		System.out.println("HashSet initialized...");
		createSet(sc , nameSet);
//		System.out.println("Do you want to SEARCH in the SET...(y/n)");
//		char a = sc.next().charAt(0);
//		if(a=='y')
//		{
//			System.out.println("Enter data to search..");
//			String st = sc.nextLine();
//			if(nameSet.contains(st))
//			{
//				System.out.println("Data found ...");
//			}
//			else
//			{
//				System.out.println("No data found...");
//			}
//		}
		System.out.println("Do you want see result SET... (y/n).");
		
		char c = sc.next().charAt(0);
		if(c=='y')
		{
			showSet(nameSet);
		}
		System.out.println("Do you want to EMPTY the SET... (y/n).");
		char e = sc.next().charAt(0);
		if(e=='y')
		{
			nameSet.clear();
			System.out.println(" SET emptied ... \n SET size = " + nameSet.size());
		}
		
		System.out.println("Do you want to CONVERT the SET to ARRAY... (y/n).");
		char ar = sc.next().charAt(0);
		if(ar=='y')
		{
			nameSet.toArray();
			System.out.println(" CONVERTED to ARRAY ... \n Resultant ARRAY is ... ");
			nameSet.forEach(System.out::print);
			System.out.println();
			
		}
		System.out.println("Built successful...");
	}

}
