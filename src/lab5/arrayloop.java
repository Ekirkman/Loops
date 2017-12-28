
package lab5;

import java.util.Scanner;

public class arrayloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] numbers = new int[3][3];
		 
		for(int rows =0; rows < 3; rows++) {
			
			for(int cols=0; cols < 3; cols++) {
				
				System.out.println(" Enter an integer value: ");
				 numbers[rows][cols]= sc.nextInt();
			}
		}
				System.out.println(" Your entered values are: ");
				
				int sum =0;
				for(int rows =0;  rows <3; rows++) {
					for(int cols = 0; cols < 3; cols++) {
						
				
					System.out.print(numbers[rows][cols]);
					sum = sum + (numbers[rows][cols]);
				}
				System.out.println();
		}
	System.out.println("the final sum :"+sum);
	}

	}


