import java.util.Arrays;
import java.util.Random;
public class Part1C {
	
    private static int count;
	private static int[] best;
	private static int[] worst;
	private static int[] random;
	
	public static void main(String[] args) {
		
		int n= Integer.parseInt(args[0]);
		Random rand= new Random();
		
		best= new int[n];
		worst= new int[n];
		random=new int[n];
		
		for (int i=0; i<n; i++) {
			int x= rand.nextInt(100000);
			random[i]=x;
		}
		
		best= Arrays.copyOf(random, n);
		Arrays.sort(best);
		for (int i=n-1; i>=0; i--) {
			worst[n-1-i]=best[i];
		}
		
		count=0;
		doSomething(best);
		System.out.println("best case count: "+count);
		
		count=0;
		doSomething(worst);
		System.out.println("worst case count: "+count);
		
		count=0;
		doSomething(random);
		System.out.println("random case count: "+count);
		
	}
	
private static void doSomething(int[] a) {
	
	int x=a[0];
	int p=0;
	int f=1;
	
	for (int i=1; i<a.length;i++) {
		int ai=a[i];
		count++;
		
		if (ai<x) {
			a[i]=a[f];
			a[f]=a[p];
			a[p]=ai;
			
			count+=4;
			p++;
			f++;
			
		}else if (ai==x) {
			
			a[i]=a[f];
			a[f]=ai;
			
			count+=4;
			f++;
		}
	}
}
}