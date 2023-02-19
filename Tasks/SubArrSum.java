import java.util.ArrayList;
	import java.util.Scanner;
	public class SubArrSum {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			ArrayList<Integer> ar1=new ArrayList<>();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int k=sc.nextInt();
			
			ArrayList<Integer> ar=new ArrayList<>();
			int c=0;
			for(int i=0;i<k;i++) {
				ar.add(arr[i]);
				c+=arr[i];
			}
			ar1.add(c);
			
			int j=k;
			while(j<n) {
				ar.add(arr[j]);
				c+=arr[j];
				c-=ar.get(0);
				ar.remove(0);
				ar1.add(c);
				j++;
			}
			System.out.println(ar1);
			
		}
	
	}