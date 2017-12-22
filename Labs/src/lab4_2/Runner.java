package lab4_2;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class Runner {

	public static void main(String[]args) {
		File csv = new File("2012_SAT_Results.csv");
		CSVUtilities  theCSV = new CSVUtilities(csv);
		
		for(String a : theCSV.getColumnHeaders()) {
			System.out.println(a);
		}
		/*for(String s : theCSV.getDataString(1)) {
			System.out.println(s);
		}
		*/
	}
}
