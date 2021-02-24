import java.util.Arrays;
import java.util.Random;


public class Part1D {

	public static void main(String[] args) {
		int n= Integer.parseInt(args[0]);
		Random rand= new Random();
		int[] a= new int[n];
		int[] random= new int[n];
		int count=0;
		for (int i=0; i<n;i++) {
			random[i]= rand.nextInt(10000000);
		}
		a=Arrays.copyOf(random, n);
		for (int i=1; i<n;i++) {
			int j=i;
			int k=j-1;
			count+=2;
			while (k>=0 && a[j]<a[k]) {
				int aj=a[j];
				a[j]=a[k];
				a[k]=aj;
				j--;
				k--;
				count+=4;
			}
		}
		int randomCount=count;
		System.out.println("random case count: "+ randomCount);
		count=0;
		Arrays.sort(a);
		for (int i=1; i<n;i++) {
			int j=i;
			int k=j-1;
			count+=2;
			while (k>=0 && a[j]<a[k]) {
				int aj=a[j];
				a[j]=a[k];
				a[k]=aj;
				j--;
				k--;
				count+=4;
			}
		}
		
		int bestCount=count;
		System.out.println("best case count: "+ bestCount);
		int[] worst= new int[n];
		Arrays.sort(a);
		for (int i=0; i<n;i++) {
			worst[n-1-i]=a[i];
		}
		a= Arrays.copyOf(worst, n);
		count=0;
		for (int i=1; i<n;i++) {
			int j=i;
			int k=j-1;
			count+=2;
			while (k>=0 && a[j]<a[k]) {
				int aj=a[j];
				a[j]=a[k];
				a[k]=aj;
				j--;
				k--;
				count+=4;
			}
		}
		
		int worstCount=count;
		System.out.println("worst case count: "+ worstCount);
		
	}

}
