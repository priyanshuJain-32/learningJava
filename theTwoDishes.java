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
		int N,S;
		N=S=0;
		for (int i=0; i<T; i++) {
		    N = read.nextInt();
		    S = read.nextInt();
		    if (S <= N) {
		        System.out.println(S);
		    } else {
                System.out.println(N-(S-N));		        
		    }
		}
	}
}
