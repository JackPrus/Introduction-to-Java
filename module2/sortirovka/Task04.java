package by.jonline.module2.sortirovka;

import java.util.Arrays;

public class Task04 {
	
	// сортировка обменами возрастанию. (пузырьком) + подсчитывать количество перестановок. 
	
	public static void main(String[] args) {
		
		int [] aa = {9,8,7,6,5,4,3,2,1};
		
		int counter =0;
		
		for	(int i=0; i< aa.length; i++) {
			for(int j=0; j<aa.length-1; j++) {
				int m=0; 
				if(aa[j]>aa[j+1]) {
					m=aa[j];
					aa[j]=aa[j+1];
					aa[j+1]=m;
					counter++;
				}
			}
		}
		
		System.out.println(Arrays.toString(aa));
		System.out.println(counter);
		
		
	}
	

}
