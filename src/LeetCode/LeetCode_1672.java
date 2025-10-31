package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

// Richest Customer Wealth
public class LeetCode_1672 {
    public static int maximumWealth(int[][] accounts) {
        ArrayList<Integer> list=new ArrayList<>();
        int res = 0;
        for(int i = 0; i < accounts.length; i++){
            int rowSum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                rowSum += accounts[i][j];
            }
            list.add(rowSum);
        }
        res = Collections.max(list);
        return res;
    }
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }
}
