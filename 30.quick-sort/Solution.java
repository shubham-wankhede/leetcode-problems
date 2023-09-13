public class Solution {
	public static void main(String[] args){
		int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
		sort(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}

	public static void sort(int[] nums, int start, int end){
		if(start<end){
			int pivot = partition(nums, start, end);
			sort(nums, start,pivot-1);
			sort(nums,pivot+1, end);
		}
	}

	public static int partition(int[] nums, int start, int end){
		int x = start;
		int pivot = nums[end];
		for(int i=start ;  i<end ; i++){
			if(nums[i]<pivot){
				swap(nums, i, x);
				x++;
			}
		}
		swap(nums,x,end);
		return x;
	}

	public static void swap(int[] nums, int x, int y){
		int temp = nums[x];
		nums[x] = nums[y];
		nums[y] = temp ;
	}
}

