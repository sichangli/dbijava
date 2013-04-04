import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;


public class OP {
	
	static double r, t, l, m, a, f;
	
	public static void main(String[] args) {
		
//		String queryFile = args[0];
		String configFile = "config.txt";
		List<Double> selectivities = new ArrayList<Double>();
//		HashMap<String, Double> config = new HashMap<String, Double>();
		Properties configProp = new Properties();
		try {
			configProp.load(new FileInputStream(configFile));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		r = Double.valueOf(configProp.getProperty("r"));
		t = Double.valueOf(configProp.getProperty("t"));
		l = Double.valueOf(configProp.getProperty("l"));
		m = Double.valueOf(configProp.getProperty("m"));
		a = Double.valueOf(configProp.getProperty("a"));
		f = Double.valueOf(configProp.getProperty("f"));
		
		System.out.println(r + " " + t + " " + l + " " + m + " " + a + " " + f);
		
//		Scanner in = new Scanner(new File(queryFile));
//		while () {
//			
//		}

	}
}
