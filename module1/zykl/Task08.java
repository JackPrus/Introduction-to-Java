package by.jonline.module1.zykl;

import java.util.ArrayList;
import java.util.List;

public class Task08 {
	public static void main(String[] args) {
		
		// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. 
		
		int a=134534576;
		int b=65473445;
		
		List<Integer>alist = new ArrayList<>();
		List<Integer>blist = new ArrayList<>();
		
		while (a!=0) {alist.add(a%10); a=a/10;}
		while (b!=0) {blist.add(b%10); b=b/10;}
		
		for	(int i=0; i<10; i++) {
			if (alist.contains(i)&&(blist.contains(i))) {System.out.print(i+"|");}
			}
		
	}
}
