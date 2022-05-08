//package com.example.springboot_ssmp.domain;

//import java.util.*;
//public class Main{
//    private static int n ;
//    static int[] nums = new int[100010];
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for (int i = 1 ; i < n; i ++){
//            int q = sc.nextInt();
//            nums[q] = 1;
//        }
//        for(int i = 1 ; i <= n; i ++){
//            if (nums[i] == 0)
//                System.out.println(i);
//        }
//
//    }
//}
//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        HashSet set = new HashSet();
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int[][] nums1 = new int[m][2];
//        for(int i = 0; i < m; i ++){
//            for (int j = 0 ; j < 2; j ++)
//                nums1[i][j] = sc.nextInt();
//        }
//        int n = sc.nextInt();
//        int[][] nums2 = new int[n][2];
//        for (int i = 0 ; i < n ; i ++){
//            for (int j = 0 ; j < 2; j ++){
//                nums2[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println(get(nums1,m,nums2,n));
//    }
//    static int get(int[][] nums1,int m ,int[][] nums2 , int n){
//
//        int[] minl = new int[m];
//        int[] maxl = new int[m];
//        for (int i = 0; i < m;i ++){
//            minl[i] = nums1[i][0];
//            maxl[i] = nums1[i][1];
//        }
//        int[] minr = new int[n];
//        int[] maxr = new int[n];
//        for (int i = 0; i < n ;i ++){
//            minr[i] = nums2[i][0];
//            maxr[i] = nums2[i][1];
//        }
//        int a = m;
//        int t = n ;
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        while (t -- > 0) {
//            a = m;
//            while (a-- > 0) {
//                if (minl[a] - maxr[t] > 0) {
//                    priorityQueue.add(maxl[a] - minr[t]);
//                }
//            }
//        }
//        int q = n;
//        while (m -- > 0) {
//            q = n;
//            while (q-- > 0) {
//                if (minr[q] - maxl[m] > 0) {
//                    priorityQueue.add(maxl[m] - minr[q]);
//                }
//            }
//        }
//        if (priorityQueue.isEmpty()) return 0;
//        return Math.abs(priorityQueue.poll());
//    }
//}