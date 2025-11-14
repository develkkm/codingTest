import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.*;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 

		 Pattern pattern = Pattern.compile("[ieaouIEAOU]");
	    
		while(true) {
			String text = br.readLine();
			if(text.equals("#"))break;
			int count = 0;
			
				
				Matcher matcher = pattern.matcher(text);
				while (matcher.find())count++;
				
				bw.write(count+"\n");
		}
		bw.close();
		br.close();
	}
}