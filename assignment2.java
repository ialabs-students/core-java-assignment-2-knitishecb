package com.hello;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class SortArrayListDescending{
  public static void main(String args[]){
    ArrayList<BigInteger> al = new ArrayList<>();
    System.out.println("enter the number of elem);
         Scanner sc = new Scanner(System.in);
                       int n = sc.nextInt();
                       BigInteger arr[] = new BigInteger[n];
                       for(int i=0;i<n;i++){
                         arr[i] = sc.nextBigInteger();
                       }
                       for(int i=0;i<n;i++){
                         al.add(arr[i]);
                       }
                       //for ascending order sorting in O(N)
                       Arrays.sort(arr);
                       for(int i=0;i<n;i++){
                         System.out.println(arr[i] + ",");
                       }
                         
                       
                       //descending order function
                       arrayListSortDesc(al);
                       }
                       private static void arrayListSortDesc(ArrayList<BigInteger> al){
                         Collections.sort(al);
                         Collections.reverse(al);
                         System.out.println(al);
                         
                         
                         
                         
                         
    
