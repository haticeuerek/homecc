package ioStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

public class SaveLoadArray {
			
	static int[] createArray(int i){
		int [] arr = new int[i];
		for (int j = 0; j < i; j++) {
			arr[j] = new java.util.Random().nextInt(50);
		}
		return arr ;
		
	}
	
	static void saveArray(int[] arr, String datei) throws IOException{
			Writer out = new FileWriter(datei); 
			String i ;
			for (int j = 0; j < arr.length; j++) {
				i = String.valueOf(arr[j]);
				out.write(i);
				out.write(" ");
			}		 
		if (out!=null) {
			out.close();
		}						
			
		}	
	static int[] loadArray(String str) throws IOException {
		
		BufferedReader r1 = new BufferedReader(new FileReader(str));
		String s = " ";
		String[] a = r1.readLine().split(s);
//		int[] arr = null;
		
		int[] arr = new int[a.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= Integer.parseInt(a[i]);
		}
		return arr;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		int len = new java.util.Random().nextInt(100) + 1 ;
		int[] arr1 = createArray(len);
		saveArray(arr1, "array.txt");
		System.out.println(Arrays.toString(arr1));
		System.out.println("------------");
		int[] arr2 = loadArray("array.txt");
		System.out.println(Arrays.toString(arr2));
		
		
		
		
//		for (int i = 0; i < a.le2gth; i++) {
//			
//			arr2[i]= Integer.parseInt(a[i]);
//			System.out.println(arr2[i]);
//		}
//		
			
			}
}
