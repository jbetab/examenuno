package org.example;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // declarando variables
        String NombreYApellido;
        byte Edad;
        int NumeroDeUsosDeLaTatgeaEnELUltimoMes;
        int MontoEnPesosDeComprasDeProductosDeAseoConLaTargeta;
        int MontoEnPesosDeComprasDeProductosAlimenticiosConLaTargeta;
        String MontosDeOtrosProductosConLaTargeta;
        int PuntajeDeCredito;
        String puntaje;


        //inicializar las variables
        Scanner teclado= new Scanner(System.in);

        System.out.println("***bienvenido a almacenes exito***");

        System.out.println("señor usuario por favor dijite su nombre y apellido:");
        NombreYApellido=teclado.nextLine();

        System.out.println(" señor ususrio por favor dijite su edad:");
        Edad=teclado.nextByte();

        System.out.println(" dejenos saber cuantas veces a utilizado su tajeta *tuya* en el mes:");
        NumeroDeUsosDeLaTatgeaEnELUltimoMes=teclado.nextInt();

        System.out.println("por favor diganos el monto en pesos de compras en productos de aseo: ");
        MontoEnPesosDeComprasDeProductosDeAseoConLaTargeta=teclado.nextInt();

        System.out.println("por favor diganos el monto en pesos de compras en productos alimenticios:");
        MontoEnPesosDeComprasDeProductosAlimenticiosConLaTargeta=teclado.nextInt();

        System.out.print("por favor digano otros productos que compro con su tarjeta *tuya*");
        MontosDeOtrosProductosConLaTargeta=teclado.nextLine();

        teclado.nextLine();
        System.out.println(" por ultimo dijite su puntaje de credito");
        PuntajeDeCredito=teclado.nextInt();


        //proceso
        Integer descuento;

        if (descuento==1){
            double

        }











    }
}