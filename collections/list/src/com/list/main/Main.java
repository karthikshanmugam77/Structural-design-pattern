package com.list.main;
import java.util.*;

import com.list.linkedList.linkedList;

import arrayList.arrayList;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int choice =0;
		do
		{
		System.out.println("select your choice :\n What type of LIST to create ?");
		System.out.println(" 1.ArrayList..  \n 2.LinkedList...\n 3.exit...");
		choice = sc.nextInt();
		sc.hasNextLine();
		switch(choice)
		{
		case 1 : arrayList t = new arrayList();
			break;
			
		case 2 : linkedList h = new linkedList();
			break;
		
		}
		}while(choice!=3 && choice<3);
		System.out.println("Built closed...");
		sc.close();
		
		

	}

}
