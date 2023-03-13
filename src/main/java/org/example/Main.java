package org.example;

import java.util.Scanner;
// coded with hassan shalash
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int num=input.nextInt();
        int arrMin[]=new int[200005];
        int arrMax[]=new int[200005];

        for(int i=0;i<size;i++){
            int x=input.nextInt();
            if (x < 0){
                arrMin[x * -1]=1;
            }else {
                arrMax[x] =1;
            }
        }
        for (int i =num;i >0 ;i--){
            if (arrMin[i] == 0){
                System.out.println(-i);
                System.exit(0);
            }
        }
        for (int i=0 ;i <= num ;i++){
            System.out.println(i);
            System.exit(0);
        }




    }
}