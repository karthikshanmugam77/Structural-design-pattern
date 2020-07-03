package com.map.hashMap;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;

public class hashMap {
	
	public static void createMap( Scanner sc , HashMap<Integer , String> numberMap)
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
		System.out.println("HashMap created...");
	}
	public static void showMap(HashMap<Integer , String> numberMap)
	{
		for(Entry<Integer , String> T : numberMap.entrySet())
		{
			System.out.println( " ID -> " + T.getKey() + " Name -> " + T.getValue() );
		}
	}

	public hashMap() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<Integer , String> numberMap = new HashMap<Integer , String>();
		System.out.println("HashMap initialized...");
		createMap(sc , numberMap);
		System.out.println("Do you want see result... (y/n).");
		char c = sc.next().charAt(0);
		if(c=='y')
		{
			showMap(numberMap);
		}
		System.out.println("Sorted & Random order... \n Built successful...");
	}

}



