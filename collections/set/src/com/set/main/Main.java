package com.set.main;

import java.util.Scanner;
import com.set.TreeSet.treeSet;
import com.set.hashSet.hashSet;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int choice =0;
		do
		{
		System.out.println("select your choice :\n What type of SET to create ?");
		System.out.println(" 1.HashSet..  \n 2.TreeSet...\n 3.exit...");
		choice = sc.nextInt();
		sc.hasNextLine();
		switch(choice)
		{
		case 1 : hashSet t = new hashSet();
			break;
			
		case 2 : treeSet h = new treeSet();
			break;
		
		}
		}while(choice!=3 && choice<3);
		System.out.println("Built closed...");
		sc.close();
	}

}
