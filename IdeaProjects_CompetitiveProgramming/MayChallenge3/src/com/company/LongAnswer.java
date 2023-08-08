package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LongAnswer {

    public static void main(String[] args) {


        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(br.readLine());
            while (t-->0){
                String lines=br.readLine();
                String[] str=lines.trim().split("\\s+");

                long x=Long.parseLong(str[0]);
                long y=Long.parseLong(str[1]);
                long l=Long.parseLong(str[2]);
                long r=Long.parseLong(str[3]);


                long max=0;
                long answer=0;
                for (long z=l;z<=r;z++){
                     long sum=(x&z)*(y&z);
                     if (sum>max){
                         max=sum;
                         answer=z;
                     }
                }
                if (answer==0){
                    System.out.println(l);
                }else {
                    System.out.println(answer);
                }

            }

        }catch (Exception e){
            return;
        }

    }
}
