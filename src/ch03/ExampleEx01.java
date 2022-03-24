package ch03;

public class ExampleEx01 {
	
	static double calc(double gasoline,double distance) {
		int efficiency = (int)(distance/gasoline);
		return efficiency;
	}

	public static void main(String[] args) {
		double distance = 182.736;
		double gasoline = 8.86;
		double efficiency = calc(gasoline,distance);
		System.out.println("¿¬ºñ" + efficiency + "km/L");
		

	}

}
