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
		int N,A,B,C;
		N = A = B = C = 0;
		for (int i = 0; i < T; i++) {
            N = read.nextInt();
            A = read.nextInt();
            B = read.nextInt();
            C = read.nextInt();
            N = N - A;
            B = B - A;
            N = N - C;
            B = B - C;
            if (N<=0) {
                if (N<=B) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
		}
	}
}
