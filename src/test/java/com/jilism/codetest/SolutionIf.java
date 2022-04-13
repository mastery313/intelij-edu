package com.jilism.codetest;

import java.util.Scanner;

public class SolutionIf {
    private static final Scanner scanner = new Scanner(System.in);

    private static final String WEIRD = "Weird";
    private static final String NOT_WEIRD = "Not Weird";

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N >= 1 && N <=100){
            //even
            if(N % 2 == 0){
                if((N >= 2 && N <=5) || N > 20) System.out.println(NOT_WEIRD);
                if(N >= 6 && N <= 20) System.out.println(WEIRD);
            }else{
            //odd
                System.out.println(WEIRD);
            }
        }

        scanner.close();
    }
}
