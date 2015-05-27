import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class h6 {

	public static void main(String[] args) {
		

	}
	public static void readAndWrite(String path, String path2){
		try{
			FileReader file=new FileReader(path);
			FileWriter fileWrite=new FileWriter(path2);
			
			BufferedReader bufferedReader=new BufferedReader(file);
			BufferedWriter bufferedWriter=new BufferedWriter(fileWrite);
			
			while(bufferedReader.ready()){
				String line=bufferedReader.readLine();
				line.replace('.',' ');
				line.replace('?',' ');
				line.replace('!',' ');
				line.replace(':',' ');
				line.replace(',',' ');
				line.replace(';',' ');
				
				bufferedWriter.write(line);
				
			}
			bufferedReader.close();
			bufferedWriter.close();
			
			
			
		}catch(Exception e){
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}

}
