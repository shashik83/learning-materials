package sort;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []intArray = {20,35,-15,7,55,1,-22};
		
		
		for(int i = 0;i<intArray.length;i++)
		{
			System.out.println(intArray[i]);
		}

	}
	
	public static void mergeSort(int[] input, int start, int end)
	{
		if(end - start < 2)
		{
			return;
		}
		
		int mid = (start + end)/2;
		mergeSort(input,start,mid);
		mergeSort(input,mid,end);
	}

}
