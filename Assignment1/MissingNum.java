import java.util.Scanner;
public class MissingNum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
  int j=arr.length-1;	
  int k=0;
for(int i=1;i<arr[j];i++)
		{
			
			if(arr[k]!=i)
			{
				System.out.print(i+" ");
			}
			else
			{
				k++;
			}
		}
}
}