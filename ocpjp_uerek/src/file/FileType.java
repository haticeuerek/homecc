package file;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FileType {
	
	public static String filePath;

	public FileType(String filePath) {

		this.filePath = filePath;
	}

public Collection<String> getFileTypes() {
	
	File f = new File( filePath );
	File[] files = f.listFiles();
	
	Collection<String> fileExt = new ArrayList<String>();
	for (int i = 0; i < files.length; i++) {
		
		
		int posOfPoint = files[i].getName().lastIndexOf('.');

		if((!fileExt.contains(files[i].getName().substring(posOfPoint+1))))
			
		fileExt.add(files[i].getName().substring(posOfPoint+1));
		
	}
	return fileExt;
}

	
}
