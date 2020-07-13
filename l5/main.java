package l5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while (T != 0) {

			int nElements = scn.nextInt();
			int[] array = new int[nElements];

			for (int i = 0; i 
					<= array.length - 1; i++) {

				array[i] = scn.nextInt();

			}

			System.out.println(countSeries(array));

			T--;
		}

	}

	

	    public static int countSeries(int[] arr){
	int count=0;
	        boolean flag=false;
	        for(int i=0;i<arr.length-1;i++){
	            if(arr[i]+1==arr[i+1]){
	                flag=true;        
	            }else{
	                if(flag){
	                    count++;
	                    flag=false;
	                }
	            }
	        }
	        if(flag){
	            count++;
	        }
	        return count;
	    }
}
