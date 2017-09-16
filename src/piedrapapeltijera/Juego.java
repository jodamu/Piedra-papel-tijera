/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijera;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author JODAMU
 */
public class Juego {
 int jugadaPersona;
 int juegadaCompu;
 String jugadapc="";
 String jugadaTextoPersona="";
 
 public void jugar(){
     Persona P =new Persona();
     System.out.println("*******************************************");
     System.out.println("\t\tPIEDRA PAPEL O TIJERA");
     P.SolicitarDatosPersonas();
     System.out.println("\t\tCOMIENZA EL JUEGO");
     System.out.println("JUGADOR");
     
     P.mostrarDatosPersonas();
     
     Scanner sc = new Scanner(System.in);
     
     
     for(int i=1; i<=3;i++){
         System.out.println("\t\t(RONDA "+i+")");
         System.out.println("Seleccione su juegada escribiendo un numero-->: ");
        System.out.println("0 -> Para piedra");
        System.out.println("1 -> Para Papel");
        System.out.println("2 -> Para Tijera");
        int opcionPersona=sc.nextInt();
        
        switch(opcionPersona){
            case 0:
              jugadaTextoPersona="piedra"; 
              break;
         case 1:
              jugadaTextoPersona="papel"; 
              break;
        case 2:
              jugadaTextoPersona="tijera"; 
              break;      
        }
        
        imprimirJugadaEnLetras();
        
        
       if(jugadaTextoPersona=="tijera" && jugadapc=="piedra"){
           juegadaCompu=juegadaCompu+1;
       } else if(jugadaTextoPersona=="piedra" && jugadapc=="papel"){
           juegadaCompu=juegadaCompu+1;
       } else if(jugadaTextoPersona=="papel" && jugadapc=="tijera"){
           juegadaCompu=juegadaCompu+1;
       } else if(jugadaTextoPersona=="piedra" && jugadapc=="tijera"){
           jugadaPersona=jugadaPersona+1;
       } else if(jugadaTextoPersona=="tijera" && jugadapc=="papel"){
           jugadaPersona=jugadaPersona+1;
       } else if(jugadaTextoPersona=="papel" && jugadapc=="piedra"){
           jugadaPersona=jugadaPersona+1;
       }
       
         
       
        
     }
     buscarEimprimirGanadorFinal();
  
 }  
public void generarJuegoComputador(){
    Random R=new Random();
    int jugada=R.nextInt(3);
    switch(jugada){
            case 0:
              jugadapc="piedra"; 
              break;
         case 1:
              jugadapc="papel"; 
              break;
        case 2:
              jugadapc="tijera"; 
              break;      
        }
    
 } 

public void imprimirJugadaEnLetras(){
    generarJuegoComputador();
      System.out.println("=================");
         System.out.println("jugada persona: "+jugadaTextoPersona);
        
        System.out.println("jugada Computador: "+jugadapc);
         System.out.println("=================");
         if(jugadaTextoPersona==jugadapc){
         System.out.println("EMPATE\n");
         }
         
 }

public void buscarEimprimirGanadorFinal(){
     System.out.println("\n\n----------------GANADOR -----------------");
         if(juegadaCompu>jugadaPersona){
             System.out.println("\tComputador");
             System.out.println("Numero de aciertos: "+juegadaCompu);
         } else{
             System.out.println("\tPersona");
             System.out.println("Numero de aciertos: "+jugadaPersona);
         }
 }
}
