/*Write a java program to input an array and search an element using binary search*/
package com.java;
public class BinarySearch 
{
	public static void main(String args[]) {
		
		int arr[][]= new int[3][3];

		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		System.out.println("Matrix:");
		for (int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
			
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("Transpose of a Matrix :");
		for (int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				
				System.out.print(arr[j][i]);
			}
			System.out.println();
		}
	}
}
