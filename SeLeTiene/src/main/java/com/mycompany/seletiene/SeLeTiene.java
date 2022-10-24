/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.seletiene;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class SeLeTiene {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        Scanner Read = new Scanner(System.in);
        int ciclo=0;
        //System.out.println("Hello World!");
        
        int Buy = 2;
        do{
            
        
        System.out.println("     SELETIENE.COM");
        System.out.println("Bienvenido, Que desea hacer?");
        System.out.println(" 1. Comprar articulos");
        System.out.println(" 2. Vender articulos");
        System.out.println(" 3. Salir");
        Buy = Leer.nextInt();//INTRODUCIMOS NUESTRA OPCIÓN POR TECLADO.

        switch (Buy) {
            case 1:
               Carrito obje = new Carrito();
               obje.listas();                    
            break;
       //vender
            case 2:
        // Creamos un ArrayList de Productos
            List <Producto> productos = new ArrayList<>();
          Producto prod = new Producto();
                System.out.println("Escriba el nombre del producto que desea vender: ");
            {
                String nombre;
                Scanner teclado9 = new Scanner(System.in);
                nombre = teclado9.nextLine();
                prod.setNombre(nombre);
            }
                System.out.println("Escriba el precio del producto: ");
            {
                int numero;
                Scanner reader = new Scanner(System.in);
                numero = reader.nextInt();
                prod.setPrecio(numero);
            }
          
                System.out.println("Producto: " + prod.getNombre() + " $" + prod.getPrecio());
            break; 
            //salir
            case 3:
                System.exit(0);
                break;
        }
        }while (Buy!=3);
    }
}
    
    