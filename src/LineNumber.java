

import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class LineNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lineNumber = 1;
		
		try {
			Stream<String> lines = Files.lines(Paths.get("C:\\Users\\sbammannavar\\Documents\\workspace-spring-tool-suite-4-4.5.1.RELEASE\\Project 1\\Linenumberfile.txt"));
		    String line = lines.skip(lineNumber).findFirst().get();
			System.out.println(line);
		}
	   catch(IOException e){
	}
	}
}
