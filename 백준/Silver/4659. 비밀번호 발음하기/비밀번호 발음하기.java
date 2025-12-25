import java.io.*;
import java.util.*;

public class Main {
    static String[] eval = {"is acceptable.", "is not acceptable."};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String password = br.readLine();

            if (password.equals("end")) {
                break;
            }

            if(!password.matches(".*[aeiou].*")
                    || password.matches(".*[aeiou]{3,}.*") 
                    || password.matches(".*[^aeiou]{3,}.*") 
                    || password.matches(".*([a-df-np-z])\\1.*")) { 

                bw.write(String.format("<%s> is not acceptable.\n", password));
                continue;
            }

            bw.write(String.format("<%s> is acceptable.\n", password));
        }

        bw.flush();
        bw.close();
    }

}