/*
Shannon Vogelesang
Date: 05-14-2019

Description: Generic QuickSort
 */
import java.util.Comparator;

public class Exercise23_03 {

	public static <E extends Comparable<E>> void quickSort(E[] list) {						//sort method
		quickSort (list, 0, list.length-1);

	}


	public static <E extends Comparable<E>> void quickSort(E[] list, int first, int last) {	//helper method
		if(last > first) {
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex-1);
			quickSort(list, pivotIndex+1, last);
		}
	}

	public static <E extends Comparable> int partition (E[] list, int first, int last) {
		E pivot = list[first];													//choose first element as the pivot
		int low = first +1;														//index for forward search
		int high = last;															//index for backward search

		while(high > low) {
			
			while(low <= high && list[low].compareTo(pivot) <= 0) {				//search forward from left

				low++;															//forward
			}
			
			while(low <= high && list[high].compareTo(pivot) > 0) {				//search backward from right
				high--;															//backward
			}
			
			if(high > low) {														
				E temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}
		while(high > first && list[high].compareTo(pivot) >= 0) {
			high--;
		}
		
		if(pivot.compareTo(list[high]) > 0) {									
			list[first] = list[high];
			list[high] = pivot;													//place pivot
			return high;															//pivot's new index
		}
		else {
			return first;														//pivot's original index
		}
	}


	public static <E> void quickSort(E[] list, Comparator<? super E> comparator) {							//comparator 1 argument
		quickSort(list, 0, list.length -1, comparator);
	}






	public static <E> void quickSort(E[] list, int first, int last, Comparator<? super E> comparator) {		//comparator 3 argument
		if(last > first) {
			int pivotIndex = partition(list, first, last, comparator);
			quickSort(list, first, pivotIndex-1, comparator);
			quickSort(list, pivotIndex+1, last, comparator);
		}
	}







	private static <E> int partition(E[] list, int first, int last, Comparator<? super E> comparator) {		//comparator partition
		E pivot = list[first];													//choose first element as the pivot
		int low = first +1;														//index for forward search
		int high = last;															//index for backward search

		while(high > low) {
			
			while(low <= high && comparator.compare(list[low], pivot) <= 0) {		//search forward from left
				low++;															//forward
			}
			
			while(low <= high && comparator.compare(list[high], pivot) > 0) {		//search backward from right
				high--;															//backward
			}

			if(high > low) {
				E temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}
		while(high > first && comparator.compare(list[high], pivot) >= 0) {
			high--;
		}
		if(comparator.compare(pivot, list[high]) > 0) {
			list[first]=list[high];
			list[high]=pivot;
			return high;
		}
		else {
			return first;
		}
	}




	public static void main(String[] args) {
		Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
		quickSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}

		System.out.println();
		Circle[] list1 = {new Circle(2), new Circle(3), new Circle(2),
				new Circle(5), new Circle(6), new Circle(1), new Circle(2),
				new Circle(3), new Circle(14), new Circle(12)};
		quickSort(list1, new GeometricObjectComparator());
		for (int i = 0; i < list1.length; i++) {
			System.out.println(list1[i] + " ");
		}

	}
}