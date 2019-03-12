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
public class COMMON_DIVISOR_RECURSION {

    public static void main(String[] args) {
        System.out.println("Find the greatest common divisor (gcd) of 2 integers m and n");
        System.out.println(greatestcommondivisor(108, 30));//6

    }

    public static Object greatestcommondivisor(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return greatestcommondivisor(n, m % n);
        }
    }

}
