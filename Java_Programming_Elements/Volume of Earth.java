package level01;

public class Seventh {
	public static void main(String [] args) {
		int r = 6378;
		double v = (4/3f) * (22/7f) * r * r * r;
		System.out.println("The volume of earth in cubic kilometers is " + v + " and cubic miles is " + v * 0.62);
	}
}
