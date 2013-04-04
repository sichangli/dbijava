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
	
	private double calFixCost(int n, HashMap<String, Double> map){
		double r = map.get("r");
		double l = map.get("l");
		double t = map.get("t");
		double f = map.get("f");
		return n*r+(n-1)*l+n*f+t;
	}
	
	private double[] calMetricC(int n, double p, HashMap<String, Double> map){
		double fcost = calFixCost(n, map);
		double[] rs = new double[2];
		rs[0] = ((p-1)/fcost);
		rs[1] = p;
		return rs;
	}
	
	
	
}
