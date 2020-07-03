package linkedHashMap;

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class linkedHashMap {
	public static void createMap( Scanner sc , LinkedHashMap<Integer , String> numberMap)
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
		System.out.println(" LinkedHashMap created...");
	}
	public static void showMap( LinkedHashMap<Integer , String> numberMap)
	{
		for(Entry<Integer , String> T : numberMap.entrySet())
		{
			System.out.println( " ID -> " + T.getKey() + " Name -> " + T.getValue() );
		}
	}

	public linkedHashMap() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<Integer , String> numberMap = new  LinkedHashMap<Integer , String>();
		System.out.println("LinkedHashMap initialized...");
		createMap(sc , numberMap);
		System.out.println("Do you want see result... (y/n).");
		char c = sc.next().charAt(0);
		if(c=='y')
		{
			showMap(numberMap);
		}
		System.out.println("Sorted & insertion order... \n Built successful...");
	}

}
