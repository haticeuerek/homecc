package ioStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CopyTextFile {
	
	
	public static void copyTextFile(String fromFile, String toFile) throws IOException{
		Reader in = null;
		Writer out = null;
			 in = new FileReader(fromFile);
			 out = new FileWriter (toFile);
			
		char [] cbuf = new char[1024];
		int len;
		
		while((len = in.read(cbuf)) != -1){
			
			out.write(cbuf, 0, len);
		}
		
		in.close();
		out.close();
		
		
	};
	

	public static void main(String[] args) throws IOException {
		
		
		copyTextFile("source.txt", "copy.txt");
		


	}

}
