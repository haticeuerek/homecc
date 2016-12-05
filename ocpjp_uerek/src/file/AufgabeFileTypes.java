package file;

import java.util.Collection;

public class AufgabeFileTypes {
public static void main(String[] args) {
	FileType ft = new FileType("C:\\Users\\huerek\\Desktop\\haticeCC");
	
	Collection<String> extColl = ft.getFileTypes();
	for (String string : extColl) {
		System.out.println(string);
	}
	
}
}
