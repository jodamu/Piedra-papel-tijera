/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijera;

import java.util.Scanner;

/**
 *
 * @author JODAMU
 */
public class Persona {
  String alias;
  String correo;
    public void SolicitarDatosPersonas(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el alias");
        alias=sc.nextLine();
        System.out.println("Ingrese correo");
        correo=sc.next();
    }
    public void mostrarDatosPersonas(){
        System.out.println(alias+ " - "+correo);
    }
}
