import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
public class h7 {
	public static void main(String[] args) {
	
	}
		public static void readAndWrite(String path, String path2, String path3){
	try{
		int count = 0;
		FileReader file=new FileReader(path);
		FileWriter fileWrite=new FileWriter(path2);
		FileWriter fileWrite1=new FileWriter(path3);
		
		BufferedReader bufferedReader=new BufferedReader(file);
		BufferedWriter bufferedWriter=new BufferedWriter(fileWrite);
		BufferedWriter bufferedWriter1=new BufferedWriter(fileWrite1);
		
		while(bufferedReader.ready()){
			String line=bufferedReader.readLine();
			count++;
			if(count % 2 == 0){
			bufferedWriter.write(line);
			}else{
				bufferedWriter1.write(line);
			}
			
		}
		bufferedReader.close();
		bufferedWriter.close();
		bufferedWriter1.close();
		
		
		
	}catch(Exception e){
		System.out.println("Error while reading a file.");
		System.out.println(e.getMessage());
		System.exit(0);
	}
}
}