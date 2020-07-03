package com.map.treeMap;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class treeMap {
	
	public static void createMap( Scanner sc , TreeMap<Integer , String> numberMap)
	{
		System.out.println("ENter number of elements...");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter ID...");
			int tempId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name...");
			String tempName = sc.nextLine();
			numberMap.put(tempId, tempName);
		}
		System.out.println("TreeMap created...");
	}
	public static void showMap(TreeMap<Integer , String> numberMap)
	{
		for(Entry<Integer , String> T : numberMap.entrySet())
		{
			System.out.println( " ID -> " + T.getKey() + " Name -> " + T.getValue() );
		}
	}

	public treeMap() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TreeMap<Integer , String> numberMap = new TreeMap<Integer , String>();
		System.out.println("TreeMap initialized...");
		createMap(sc , numberMap);
		System.out.println("Do you want see result... (y/n).");
		char c = sc.next().charAt(0);
		if(c=='y')
		{
			showMap(numberMap);
		}
		System.out.println("Sorted & in Ascending order... \n Built successful...");
	}

}
