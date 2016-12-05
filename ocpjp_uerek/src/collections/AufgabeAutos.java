package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;






public class AufgabeAutos {

	public static void main(String[] args) {
		
		VW auto1 = new VW("Golf", 1990);
		BMW auto2 = new BMW("Z4", 2000);
		System.out.println(auto1);
		System.out.println(auto2);
		System.out.println("----------teil 3--------");
		VW vw1 = new VW("Golf", 2000);
		VW vw2 = new VW("Golf", 1999);
		VW vw3 = new VW("Passat", 2010);

		
		List<VW> list = new LinkedList<VW>();
		list.add(vw1);
		list.add(vw2);
		list.add(vw3);
		Collections.sort(list);
		print(list);
		
		//Hashset
	
		HashSet<VW> hashSet = new HashSet<VW>();
		hashSet.addAll(list);
		VW vw4 = new VW("dd", 2000);
		hashSet.add(vw4);
		
		print(hashSet);
	
		//TreeSet
	
		TreeSet<VW> treeSet = new TreeSet<>(list);
		print(treeSet);
		
		//PriorityQueue
	

		PriorityQueue<VW> pQueue = new PriorityQueue<>(list);
		print(pQueue);
		
		System.out.println("----Aufgabe 6----");
		 BMW bmw1 = new BMW("BMW1er", 2000);
		BMW bmw2 = new BMW("BMW5er", 2016);
		ArrayList<BMW> listBMW = new ArrayList<BMW>();
		listBMW.add(bmw1);
		listBMW.add(bmw2);
		printBMW(listBMW);
		System.out.println();
		
		HashSet<BMW> hashSetBMW = new HashSet<>(listBMW);
		printBMW(hashSetBMW);
		
		TreeSet<BMW> treeSetBMW = new TreeSet<>(listBMW);
		printBMW(treeSetBMW);
		
		PriorityQueue<BMW> pQueueBMW = new PriorityQueue<>(listBMW);
		printBMW(listBMW);
		
		System.out.println("----aufgabe 7------");
		if(hashSetBMW.contains(bmw1)){
			System.out.println(bmw1 + " existiert");
		}
		else {
			System.out.println("ex. nict!");
		}
		System.out.println("----aufgabe 8------");
		bmw1.setBaujahr(2015);
		if(hashSetBMW.contains(bmw1)){
			System.out.println(bmw1 + " existiert");
		}
		else {
			System.out.println("das gesuchte auto ex. nicht!");
		}
		System.out.println("--------Aufgabe 9 + 10--------");

		VW vw = new VW("Polo", 2200);
		list.add(vw);
		System.out.println(Collections.binarySearch(list, vw));
		Collections.sort(list);
		print(list);
		
		
	}
	static void print(Collection<VW> autos) {
		System.out.println("--------- autos (" + autos.getClass() + ")");
		for (VW a : autos) {
			System.out.println(a);
		}
	}
static void printBMW(Collection<BMW> autos) {
	System.out.println("--------- autos (" + autos.getClass() + ")");
		for (BMW a : autos) {
			System.out.println(a);
		}
	}
}
