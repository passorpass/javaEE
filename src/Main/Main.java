package Main;

import java.util.*;

public class Main {
//  static int fact(int n){
//      if(n <= 1){
//          return 1;
//      }
//      return n * fact( n - 1);
//  }
//  static int A(int m,int n){
//      return fact(m) / fact(n);
//  }
//  static int C(int m ,int n){
//      return fact(m) / fact(n) / fact(m-n);
//  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int k = sc.nextInt();
        int[] ints = new int[n];
        int ans = 0 ;
        for(int i = 0 ;i <n ; i++){
            ints[i] = sc.nextInt();
        }
        for(int i = 0 ; i < ints.length ; i++){
            int allcount = 0,oncount = 0,j = i;
            while (oncount <= k && j < ints.length){
                if(ints[j] % 2 ==0 && ++oncount > k){
                    break;
                }
                allcount++;
                j++;
            }
            if(allcount > ans){
                ans = allcount;
            }
        }
        System.out.println(ans);

    }

    }