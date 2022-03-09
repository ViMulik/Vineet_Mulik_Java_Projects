package cre;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

 class FileHandling {

	public static void main(String[] args) throws IOException {
	 File file = new File("E:\\home\\VineetMulik\\temp\\simplilear.txt");
	
	 if(file.createNewFile()) {
		 System.out.println("Files created sucessfully");
	 }else {
		 System.out.println("File is already exist");
	 }
	 String data = "Hello World....";
	 Files.write(Paths.get("E:\\home\\VineetMulik\\temp\\simplilear.txt"),data.getBytes());
	 System.out.println("Files written Sucessfully");
	 FileWriter writer = new FileWriter(file);
	    writer.append(data);
		writer.append(data);
		writer.append(data);
		writer.close();
		System.out.println("File Append Operation Done Successfully"); 
BufferedReader reader = new BufferedReader(new FileReader("E:\\home\\VineetMulik\\temp\\simplilear.txt"));
		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();
		System.out.println("Fiile Readed Successfully");	
	}
}

