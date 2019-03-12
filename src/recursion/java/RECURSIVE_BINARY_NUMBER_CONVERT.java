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
public class RECURSIVE_BINARY_NUMBER_CONVERT {

    public static void main(String[] args) {
        Object[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Takes a decimal number n and converts n to its corresponding binary number.");
        decimalTobinary(156);
        System.out.println();

    }

    public static void decimalTobinary(int o) {
        if (o == 0) {
            //return;
        } else {
            decimalTobinary(o / 2);
        }
        System.out.print(o % 2);
    }
}
