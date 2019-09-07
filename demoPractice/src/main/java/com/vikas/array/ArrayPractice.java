package com.vikas.array;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class ArrayPractice {
    public static void main(String args[] ) throws IOException {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        String[] a1 = new String[size];
        String[] b1 = new String[size];
        int[] c = new int[size];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        a1 = a.split("\\s");
        b1 = b.split("\\s");
        for(int i=0;i<size ; i++){
            int n = Integer.parseInt(a1[i]);
            int n1 = Integer.parseInt(b1[i]);
            c[i]=n+n1;
            System.out.print(n+n1+" ");
        }
        sc.close();
        // Write your code here

    }
}
