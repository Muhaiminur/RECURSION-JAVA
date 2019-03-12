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
public class RECURSIVE_POWER_FIND {

    public static void main(String[] args) {
        System.out.println("Find the m^n (m raised to the power n) in a linear fashion [linear recursive].");
        System.out.println(linearfashion(2, 3));

    }

    public static int linearfashion(int m, int n) {
        if (n == 0) {
            return 1;
        } else {
            return m * linearfashion(m, n - 1);
        }
    }

}
