package com.map.main;
import java.util.*;

import com.map.hashMap.hashMap;
import com.map.treeMap.treeMap;

import linkedHashMap.linkedHashMap;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice =0;
		do
		{
		System.out.println("select your choice :\n What type of MAP to create ?");
		System.out.println(" 1.TreeMap.. \n 2.HashMap... \n 3.Linked-HashMap...\n 4.exit...");
		choice = sc.nextInt();
		sc.hasNextLine();
		
		switch(choice)
		{
		case 1 : treeMap t = new treeMap();
			break;
			
		case 2 : hashMap h = new hashMap();
			break;
			
		case 3 : linkedHashMap l = new linkedHashMap();
			break;
		}
		}while(choice!=3 && choice<4);
		System.out.println("Built closed...");
		sc.close();
		
		

	}

}
