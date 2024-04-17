/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projeto1010;

import java.util.Scanner;

public class Projeto1010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigopeca1, codigopeca2, numerodepecas1, numerodepecas2;
        double valorunitario1, valorunitario2;
        codigopeca1 = sc.nextInt();
        numerodepecas1 = sc.nextInt();
        valorunitario1 = sc.nextDouble();
        codigopeca2 = sc.nextInt();
        numerodepecas2 = sc.nextInt();
        valorunitario2 = sc.nextDouble();
        double VALORAPAGAR = (valorunitario1 * numerodepecas1) + (valorunitario2 * numerodepecas2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", VALORAPAGAR);
    }
}
