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
		int N,X,S,R;
		N=X=0;
		
		for (int i=0; i<T; i++) {
		    N = read.nextInt();
		    X = read.nextInt();
		    int[] ratings = new int[N];
		    Arrays.fill(ratings, 0);
		    for (int j=0; j<N; j++) {
		        S = read.nextInt();
		        R = read.nextInt();
		        if (S<=X) {
		            ratings[j] = R;
		        }
		    }
		    int size = ratings.length;
		    int maximum = -10000;
		    for (int k=0; k<size; k++) {
		        if (ratings[k]>maximum) {
		            maximum = ratings[k];
		        }
		    }
		    System.out.println(maximum);
		}
	}
}
