package level01;

public class Fourth {
	public static void main(String [] args) {
		int cp = 129;
		int sp = 191;
		System.out.println("The CP is INR " + cp + " and the SP is INR " + sp);
		double p = sp - cp;
		double profitp = (p/cp) * 100; 
		System.out.println("The profit is INR " + (sp-cp) + " and the profit percentage is " + profitp + "%");
	}
}
