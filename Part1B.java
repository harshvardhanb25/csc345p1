
public class Part1B {

	public static void main(String[] args) {
		int n= Integer.parseInt(args[0]);
		int count=0;
		int sum=0;
		while (n>0) {
		for (int j=1; j<=n; j++) {
			for (int k=1; k<=j; k++) {
				sum+= j+k;
				count++;
			}
		}
		n=n/3;
		
	}
	
	System.out.println("Total Count: "+ count);
	}
}
