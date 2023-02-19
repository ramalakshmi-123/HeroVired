import java.util.Scanner;
public class UniqueElements {
static void distinct(int arr[], int num)
{
for (int i = 0; i < num; i++)
{
int j;
for (j = 0; j < i; j++)
if (arr[i] == arr[j])
break;
if (i == j)
System.out.print( arr[i] +" ");
}
}

public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);
int num;
num = sc.nextInt();
int arr[] = new int[num];
for(int i=0; i<num; i++)
{
arr[i] = sc.nextInt();
}
distinct(arr, num);
}
}


