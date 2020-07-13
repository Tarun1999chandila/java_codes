package l7;

import java.util.Comparator;

public class generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car[] carr=new car[4];
carr[0]= new car(100,"black",500000);
carr[1]= new car(200,"blue",200000);
carr[2]= new car(150,"white",600000);
carr[3]= new car(80,"red",700000);
display(carr);
bubblesort(carr);
display(carr);
	}
	public static <T> void display(T[] arr) {
		for(T val:arr) {
			System.out.println(val);
		}
	}
	public static<T extends Comparable<T>> void bubblesort(T[] arr) {
		int n=arr.length;
				for(int count=0;count<=n-2;count++) {
					for(int j=0;j<n-count-2;j++) {
						if(arr[j].compareTo(arr[j+1]) >0){
						T temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						}
					}
						
					}
				}
	public static <T> void bubbleSort(T[] arr, Comparator<T> comp) {

		int n = arr.length;

		for (int count = 0; count <= n - 2; count++) {

			for (int j = 0; j <= n - count - 2; j++) {

				if (comp.compare(arr[j], arr[j + 1]) > 0) {

					// swap
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}

	}
	

}
