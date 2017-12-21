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

public class CSVUtilities {

	private ArrayList<String> CSVData = new ArrayList<String>();
	private int numColumns;
	
	public CSVUtilities(File csv) {
		Path pathToFile = Paths.get(csv.getAbsolutePath());
		try (BufferedReader br = Files.newBufferedReader(pathToFile, 
				StandardCharsets.US_ASCII)){
			String line = br.readLine();
			while(line != null) {
				line = br.readLine();
				String[] data = line.split(",");
				for(int i = 0; i < data.length; i++) {
					this.CSVData.add(data[i]);
				}
			}
		}		
				catch (IOException ioe) {
				ioe.printStackTrace();
			}
		
	}
	
	public List<String> getColumnHeaders()
	{
		ArrayList<String> headers = new ArrayList<String>();
		if (!CSVData.isEmpty())
		{
			String[] split = CSVData.get(0).split(",");
			for(int i = 0; i < split.length; i++) {
				headers.add(split[i]);
			}
		}
		return headers;
	}
	
	public List<String> getData(int column){
		ArrayList<String> data = new ArrayList<String>();
		if(!CSVData.isEmpty() && column < numColumns) {
			for(int i = )
		}
	}
	
	public List<Integer> getData(int column){
		
	}
	
	public List<Double> getData(int column){
		
	}

}
