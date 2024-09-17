package org.example;
public class BirthdayArgs {
    public static void main(String[] args) {
        int numCases =Integer.parseInt(args[0]);
        int cases=1;
        while (cases<=numCases){
            int age=Integer.parseInt(args[cases]);
            String binaryAge=Integer.toBinaryString(age);

            int contador=0;
            for (int i=0; i<binaryAge.length();i++){
                if (binaryAge.charAt(i)=='1'){
                    contador++;
                }
            }
            System.out.println(contador);


            cases++;
        }



    }
}
