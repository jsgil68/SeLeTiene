/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seletiene;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Envio {
    String direccion;
    String nombre;
    String numero;
    Scanner Read = new Scanner(System.in);
    Scanner pago = new Scanner(System.in);
    
    public void Enviar(){
                    Scanner teclado = new Scanner(System.in);
                    System.out.print("Introduzca su direccion: ");
                        direccion = teclado.nextLine();
                    System.out.println("¡Su pedido sera enviado a: " + direccion);
                    System.out.println("..::TIPO DE ENVIO::..");
                    System.out.println(" 1. Aereo");
                    System.out.println(" 2. Terrestre");
                    System.out.println(" 2. Ir a un punto a recogerlo");
                        int tipoEnvio = Read.nextInt();
                switch (tipoEnvio) {
                case 1:
                        System.out.println("Su pedido se realizara por avion");
                        System.out.println("Que metodo de pago desea utilizar?");
                        System.out.println(" 1. PSE");
                        System.out.println(" 2. Targeta");
                        int tipoPago = pago.nextInt();
                        switch (tipoPago) {
                            case 1:
                                System.out.println(" Digite el nombre de la targeta:");
                                Scanner teclado1 = new Scanner(System.in);
                                nombre = teclado1.nextLine();
                                System.out.println("Digite el numero de la targeta");
                                Scanner teclado2 = new Scanner(System.in);
                                numero = teclado2.nextLine();
                                System.out.println("PEDIDO CONFIRMADO!");
                                break;
                            case 2:
                                System.out.println(" Digite el nombre de la targeta:");
                                Scanner teclado3 = new Scanner(System.in);
                                nombre = teclado3.nextLine();
                                System.out.println("PEDIDO CONFIRMADO!");
                                break;
                        }
                break;
                case 2:
                    System.out.println("Su pedido se realizara por avion");
                        System.out.println("Que metodo de pago desea utilizar?");
                        System.out.println(" 1. PSE");
                        System.out.println(" 2. Targeta");
                    int tipoPago1 = pago.nextInt();
                        switch (tipoPago1) {
                            case 1:
                                System.out.println(" Digite el nombre de la targeta:");
                                Scanner teclado1 = new Scanner(System.in);
                                nombre = teclado1.nextLine();
                                System.out.println("Digite el numero de la targeta");
                                Scanner teclado2 = new Scanner(System.in);
                                numero = teclado2.nextLine();
                                System.out.println("PEDIDO CONFIRMADO!");
                                break;
                            case 2:
                                System.out.println(" Digite el nombre de la targeta:");
                                Scanner teclado3 = new Scanner(System.in);
                                nombre = teclado3.nextLine();
                                System.out.println("PEDIDO CONFIRMADO!");
                                break;
                        }
                break;
                case 3:
                        System.out.println("Su pedido se realizara por avion");
                        System.out.println("Que metodo de pago desea utilizar?");
                        System.out.println(" 1. PSE");
                        System.out.println(" 2. Targeta");
                        System.out.println(" 3. Efectivo");
                        int tipoPago2 = pago.nextInt();
                        switch (tipoPago2) {
                            case 1:
                                System.out.println(" Digite el nombre de la targeta:");
                                Scanner teclado1 = new Scanner(System.in);
                                nombre = teclado1.nextLine();
                                System.out.println("Digite el numero de la targeta");
                                Scanner teclado2 = new Scanner(System.in);
                                numero = teclado2.nextLine();
                                System.out.println("PEDIDO CONFIRMADO!");
                                break;
                            case 2:
                                System.out.println(" Digite el nombre de la targeta:");
                                Scanner teclado3 = new Scanner(System.in);
                                nombre = teclado3.nextLine();
                                System.out.println("PEDIDO CONFIRMADO!");
                                break;
                            case 3:
                                System.out.println("Usted realizara el pago cuando retire el producto");
                                System.out.println("PEDIDO CONFIRMADO!");
                                break;
                        }
                break;
                }
    }
}
