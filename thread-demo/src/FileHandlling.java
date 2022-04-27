import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlling {
	public static void main(String[] args) throws IOException {
		String data = "sample Rakuten Data";
		String fileName = "input1.txt";
		//readfile(fileName);
		writefile(data,fileName);
	}
	public static void readfile(String file) throws IOException {
		FileReader reader = new FileReader(file);
		BufferedReader bufferedreader = new BufferedReader(reader);
		String line = bufferedreader.readLine();
		System.out.println(line);
		bufferedreader.close();
	}
	
	public static void writefile(String data,String file) throws IOException  {
		FileWriter writer = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		bufferedWriter.write(data);
		bufferedWriter.close();
	}
}
