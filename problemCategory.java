/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner read = new Scanner(System.in);
		int T = read.nextInt();
		int x = 0;
		for (int i=0; i<T; i++) {
		    x = read.nextInt();
		    if (x < 100) {
		        System.out.println("Easy");
		    } else if (x >=200) {
		        System.out.println("Hard");
		    } else {
		        System.out.println("Medium");
		    }
		}
	}
}
