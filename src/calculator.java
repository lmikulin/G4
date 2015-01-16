public class calculator {
	
	public static double gammaSpread(double distance, double intensity){
		double intense = intensity / Math.pow(distance,2); 
		return intense;
	}
	
	public static double neutronSpread(double distance, double intensity){
		double intense = intensity / Math.pow(distance,2); 
		return intense;
	}
	
	public static double thermalSpread(double distance, double intensity){
		return distance;
	}
	
	public static double falloutSpread(double distance){
		return distance;
	}
	
	public static double EMPSpread(double distance){
		return distance;
	}
	
	public static double groundshockSpread(double distance){
		return distance;
	}
	
	public static double overpressureSpread(double distance){
		return distance;
	}
	
	public static double cratorSpread(){
		return (Double) null;
	}
}
