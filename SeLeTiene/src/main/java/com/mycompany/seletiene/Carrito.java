/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seletiene;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Carrito {
    public static void listas(){
        int Gammas = 1;
                System.out.println("BIENVENIDO AL MENU DE COMPRAS");
                switch (Gammas) {
                    case 1:
                        String[] producto = {"Ryzen 3","Ryzen 5","Ryzen 7","RAM 4","RAM 8", "RAM 16", "GTX 1060", "GTX 1650", "GTX 3080", "Bolsa gamma baja", "Bolsa gamma media", "Bolsa gamma alta"};
        Double[] precios = {300000.0,500000.0,700000.0,70000.0,120000.0,180000.0, 700000.0, 1200000.0, 1800000.0, 1000000.0, 1600000.0, 2500000.0};
        int opcion =0;
        
        double total =0;
        
        ArrayList<String> carrito = new ArrayList();
        Scanner os = new Scanner (System.in);
        System.out.println("Productos en la tienda");
        
           
            System.out.println("\n1. Ryzen 3 $ 300000.0");
            System.out.println("2. Ryzen 5 $ 500000.0");
            System.out.println("3. Ryzen 7 $ 700000.0");
            
            System.out.println("\n4. RAM 4 $ 70000.0");
            System.out.println("5. RAM 8 $ 120000.0");
            System.out.println("6. RAM 16 $ 180000.0");
            
            System.out.println("\n7. GTX 1060 $ 700000.0");
            System.out.println("8. GTX 1650 $ 1200000.0");
            System.out.println("9. GTX 3080 $ 1800000.0");
            
            System.out.println("\n10. Bolsa gamma baja $ 1000000.0");
            System.out.println("11. Bolsa gamma media $ 1600000.0");
            System.out.println("12. Bolsa gamma alta $ 2500000.0");
            
            System.out.println("\n..::13. VER CARRITO::..");
            System.out.println("..::14.PAGAR::..");
            System.out.println("..::15.SALIR::..");
            System.out.println("SELETIENE.COM");
            System.out.println("Elija sus productos");
            
        do{
            opcion=os.nextInt();
            switch(opcion){
                case 1:
                    carrito.add(producto[0]);
                    total=total +  precios[0];
                break;
                case 2:
                    carrito.add(producto[1]);
                    total=total +  precios[1];
                break;
                case 3:
                    carrito.add(producto[2]);
                    total=total +  precios[2];
                break;
                case 4:
                    carrito.add(producto[3]);
                    total=total +  precios[3];
                break;
                case 5:
                    carrito.add(producto[4]);
                    total=total +  precios[4];
                break;
                case 6:
                    carrito.add(producto[5]);
                    total=total +  precios[5];
                break;
                case 7:
                    carrito.add(producto[6]);
                    total=total +  precios[6];
                break;
                case 8:
                    carrito.add(producto[7]);
                    total=total +  precios[7];
                break;
                case 9:
                    carrito.add(producto[8]);
                    total=total +  precios[8];
                break;
                case 10:
                    carrito.add(producto[9]);
                    total=total +  precios[9];
                break;
                case 11:
                    carrito.add(producto[10]);
                    total=total +  precios[10];
                break;
                case 12:
                    carrito.add(producto[11]);
                    total=total +  precios[111
                            ];
                break;
                case 13:
                    for(int i=0; i<carrito.size(); i++){
                        System.out.println(carrito.get(i));
                    }
                break;
                case 14:
                    System.out.println("Su pago total es: " + total);
        
                //ENVIO
                    Envio env = new Envio();
                    env.Enviar();
                break;
            }
        }while (opcion!=15);
        
    }
}
}
