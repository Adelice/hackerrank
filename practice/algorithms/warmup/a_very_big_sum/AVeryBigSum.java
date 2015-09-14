package algorithms.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AVeryBigSum {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int numbers = Integer.parseInt(stdin.nextLine());
        String[] integers = stdin.nextLine().split(" ");
        long sum = 0;
        for(int i = 0; i < numbers; i++)
        {
            sum += Long.parseLong(integers[i]);
        }
        System.out.println(sum);
        stdin.close();
    }
}