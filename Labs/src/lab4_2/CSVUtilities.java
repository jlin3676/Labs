package lab4_2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVUtilities {

	private ArrayList<String> CSVData = new ArrayList<String>();
	private int numColumns;
	
	public CSVUtilities(File csv) throws IOException {
		Path pathToFile = Paths.get("2012_SAT_Results.csv");
		try (BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII)){
			String line = br.readLine();
			while(line != null) {
				this.CSVData.add(line);
				line = br.readLine();
			}
		}		
				catch (IOException ioe) {
				ioe.printStackTrace();
			}
		this.numColumns = getColumnHeaders().size();
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
	
	public List<String> getDataString(int column){
		ArrayList<String> data = new ArrayList<String>();
		if(!CSVData.isEmpty() && column < numColumns) {
			for (String line : CSVData)
			{
				String[] split = line.split(",");
				data.add(split[column]);
			}
		}
		return data;
	}
	
	public List<Integer> getDataInt(int column){
		ArrayList<Integer> data = new ArrayList<Integer>();
		if(!CSVData.isEmpty() && column < numColumns) {
			for (String line : CSVData)
			{
				String[] split = line.split(",");
				data.add(Integer.parseInt(split[column]));
			}
		}
		return data;
	}
	
	public List<Double> getDataDouble(int column){
		ArrayList<Double> data = new ArrayList<Double>();
		if(!CSVData.isEmpty() && column < numColumns) {
			for (String line : CSVData)
			{
				String[] split = line.split(",");
				data.add(Double.parseDouble(split[column]));
			}
		}
		return data;
	}
	
	
}
