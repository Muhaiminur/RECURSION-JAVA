/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion.java;

/**
 *
 * @author ITCLANBD
 */
public class RECURSIVE_BINARY_SEARCH {

    public static void main(String[] args) {
        Object[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        //Implement a recursive algorithm of Binary search. (Input a sorted array,start index,last index,key)
        System.out.println("Found on index = "+Binary(a, 0, 7, 8));//Found on index = 7
        System.out.println("Found on index = "+Binary(a, 0, 7, 6));//Found on index = 5
        System.out.println("Found on index = "+Binary(a, 0, 7, 3));//Found on index = 2
    }

    public static Object Binary(Object[] b, int p, int q, Object key) {
        int mid = (p + q) / 2;
        if (p > q) {
            return -1;
        } else if (key.equals(b[mid])) {
            return mid;
        } else if (((Comparable) key).compareTo(b[mid]) > 0) {
            return Binary(b, mid + 1, q, key);
        } else {
            return Binary(b, p, mid - 1, key);
        }
    }

}
