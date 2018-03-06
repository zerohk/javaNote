//
import java.util.*;
public class BinarySearch
{
public static void main(String[] args)
{
	int arr[] = {1,3,5,13,24,45,57,78,82,91};
	System.out.println("Please input the search num:");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	System.out.println(binarySearch(arr,num));
	
	
}

public static int binarySearch(int arr[],int num)
{
	if(arr.length == 0) return -1;
	int start = 0;
	int end = arr.length - 1;
	int m = (start + end) / 2;
	while(end >= start)
	{
		if(arr[m] == num)
			return m;
		if(arr[m] > num)
			end = m-1;
		if(arr[m] < num)
			start = m + 1;
		m = (start + end) / 2;
	}
	return -1;
}
}
