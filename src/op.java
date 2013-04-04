import java.util.HashMap;


public class OP {
	
	public static void main(String[] args) {
		
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
		return 
	}
	
}
