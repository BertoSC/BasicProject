package org.example;


import java.util.Scanner;

public class candles {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int casos= entrada.nextInt();

        while (casos > 0) {
            int seg= entrada.nextInt();
            int result=0;
            String segBin= Integer.toBinaryString(seg);
            char [] temp=segBin.toCharArray();
            for (int i=0; i<segBin.length();i++){
                if (temp[i]=='1'){
                    result++;

                }
            }
            System.out.println(result);
            casos--;
        }
    }
}