import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {
	public static String  readfile(String path) {
		String text1 = "";
		File file1 = new File(path);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file1));
			String line;
			while ((line = br.readLine()) != null) {
				text1 = line + " " + text1;
				
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return text1.toLowerCase();
	}

}
