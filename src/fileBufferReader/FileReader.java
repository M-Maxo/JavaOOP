package fileBufferReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) throws IOException {
		
		File file = new File("Hello.txt");
		
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		writer.write("Hello from created file");
		writer.close();
		
		BufferedReader reader = new BufferedReader(new java.io.FileReader(file));
		
		String line ;
		while((line = reader.readLine()) != null){
			
			System.out.println(line);
		}
		reader.close();
	}

}
