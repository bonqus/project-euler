package from_21_to_30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Problem_22 {

	static String[] names;
	
	public static void main (String[] args) {
		loadNames();
		long sum = 0;
		for (int i = 0; i < names.length; i++) {
			long sumbuff = 0;
			for (int i2 = 0; i2 < names[i].length(); i2++) {
				sumbuff += aplhaWorth(names[i].charAt(i2));
			}
			sum += sumbuff*(i+1);
		}
		System.out.println(sum);
	}
	static int aplhaWorth(char cha) {
		char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		for (int i = 0; i < alphabet.length; i++) {
			if (cha == alphabet[i]) {
				return i+1;
			}
		}
		return 0;
	}
	
	static void loadNames(){
		try {
			File filePath = new File("TextFiles\\Problem_22.txt");
			Scanner file = new Scanner(filePath);
			String line = new String();
			while (file.hasNext()) {
				line += file.next();
			}
			String s = new String();
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) != '"'){
					s += line.charAt(i);
				}
			}
			names = s.split(",");
			Arrays.sort(names);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
}