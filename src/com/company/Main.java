package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][]matrix = {{1,2,4,4},{5,1,2,3},{9,5,1,2}};
        boolean r=true;
        int m=matrix.length;
        int n=matrix[0].length;
        for (int i = 0; i <n ; i++) {

            int j=0;
            int k=i;
            int x = matrix[j][k];
            while (j<m-1 && k<n-1) {
                j=j+1;
                k=k+1;
                if (matrix[j][k] != x) {
                    r=false;
                    break;
                }
            }
            if(!r) break;
        }

        for (int i = 0; i <m ; i++) {
            int j=i;
            int k=0;
            int x = matrix[j][k];
            while (j < m - 1 && k < n - 1) {
                j++; k++;
                if (matrix[j][k] != x) {
                    r=false;
                    break;
                }
            }

        }
        System.out.println(r);



        System.out.println(m + " " + n);
    }
}
