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
public class EQUATION_FIND {

    public static void main(String[] args) {
        System.out.println("Task =07 :==find the m^n (m raised to the power n) by dividing the problem into two equal parts:");
        System.out.println(dividing(2, 4));//16

    }

    public static int dividing(int m, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 0) {
                int temp = dividing(m, n / 2);
                return temp * temp;
            } else {
                int temp = dividing(m, (n - 1) / 2);
                return temp * temp * m;
            }
        }
    }

}
