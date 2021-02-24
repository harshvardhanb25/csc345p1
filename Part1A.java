
public class Part1A {

	public static void main(String[] args) {
		int N=Integer.parseInt(args[0]);
		int j,k;
		int count=0;
		for (int i=1; i<=N; i++) {
			j=i;
			while (j>=1){
				k=1;
				while (k<=N) {
					k=k*2;
					count++;
				}
				j=j-1;
			}
		}
		System.out.println("Total Count: " +count);
	}

}
