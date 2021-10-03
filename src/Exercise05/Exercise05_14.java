package Exercise05;
/*
* @author Rami Vasudev (D21CS104)
*/
/*
 (Estimate ) can be computed using the following series:
 m(i) = 4(1 - 1/3+1/5+1/7+1/9-1/11+...+(-1)i+5/2i-1)
 
 Write a method that returns m(i) for a given i and write a test program that displays the following table:
i                  m(i)
________________________
1                  4.0000
101                3.1515
201                3.1466
301                3.1449
401                3.1441
501                3.1436
601                3.1433
701                3.1430
801                3.1428
901                3.1427
*/

public class Exercise05_14 {
	public static void main(String[] args) {			
		System.out.println("\ni            m(i)     "); //print
		System.out.println("---------------------"); 
		for (int i = 1; i <= 901; i += 100) {        //For loop
			System.out.printf("%d\t", i);              //Formattig and print i
			System.out.printf("%1.4f\n", p(i));         //Formattig and print m(i)
		}
	}
	public static double p(double n) {
		double a= 0;		
		for (double i = 1; i <= n; i ++) {
			a += Math.pow(-1, i +5) / (2 * i - 1);   //Method for m(i)
		}
		a *= 4;
		return a;
	}
}
