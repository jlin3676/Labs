package lab4_3;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;

public class WriteCSV
{
	public static void csvWriter(String file,String name, int score) throws IOException
	{	
		final String comma = ",";
		final String escape = "\n";
		final String header = "Name,Score";
		
		FileWriter fileWriter = null;

		 try {
			           	 fileWriter = new FileWriter(file);
			             fileWriter.append(header.toString());
			             fileWriter.append(escape);
			             
			             fileWriter.append(name);
			             fileWriter.append(comma);
			             fileWriter.append(String.valueOf(score));
			             fileWriter.append(escape);
		 }
	     catch (Exception e) {
		            System.out.println("Error");
		            e.printStackTrace();
		        } finally {
		            try {
		                fileWriter.flush();
		                fileWriter.close();
		            } catch (IOException e) {
		                System.out.println("Error");
		                e.printStackTrace();
		            }
		        }

	}
}
