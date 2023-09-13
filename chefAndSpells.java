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
		for (int i=0; i<T; i++) {
		    int[] powers = new int[3];
		    Arrays.fill(powers,0);
		    for (int j=0; j<3; j++) {
		        powers[j] = read.nextInt();
		    }		    
    		Arrays.sort(powers);
    		System.out.println(powers[2]+powers[1]);
		}
	}
}
