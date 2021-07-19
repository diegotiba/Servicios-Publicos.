/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import MODELO.Agua;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class vista {

    public vista() {

    }
    static Scanner leer1 = new Scanner(System.in);
    public int menuVista() {
        Scanner leer1 = new Scanner(System.in);
        System.out.println("PAGO DE SERVICIOS PÚBLICOS");
        System.out.println("Seleccione el servicio público");
        System.out.println("1. Energía");
        System.out.println("2. Acueducto");
        System.out.println("3. Gas Natural");
        System.out.println("4. Salir");
        int opcion1 = leer1.nextInt();
        leer1.nextLine();
        return opcion1;
    }

    public int estrato() {
        Scanner leer1 = new Scanner(System.in);
        System.out.println("Estrato del inmueble:");
        int opcion2 = leer1.nextInt();
        leer1.nextLine();
        return opcion2;

    }

    public int consumo() {
        Scanner leer1 = new Scanner(System.in);
        System.out.println("Consumo del inmueble:");
        int opcion3 = leer1.nextInt();
        leer1.nextLine();
        return opcion3;
    }

  

}
