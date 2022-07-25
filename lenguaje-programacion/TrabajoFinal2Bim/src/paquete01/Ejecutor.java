/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;
import paquete02.*;
import paquete03.*;

/**
 *
 * @author jpvpv
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean opInvalida = false;
        int op = 1;
        EnlacePlanPostPagoMegas c1 = new EnlacePlanPostPagoMegas();
        EnlacePlanPostPagoMinutos c2 = new EnlacePlanPostPagoMinutos();
        EnlacePlanPostPagoMinutosMegas c3 = new EnlacePlanPostPagoMinutosMegas();
        EnlacePlanPostPagoMinutosMegasEconomico c4 = new EnlacePlanPostPagoMinutosMegasEconomico();
        sc.useLocale(Locale.US);

        while (op != 0) {
            do {
                System.out.println("==PLAN TELEFONICO==");
                System.out.println("Elija una opcion:");
                System.out.println("1) Ingresar un Plan Post Pago Minutos");
                System.out.println("2) Ingresar un Plan Post Pago Megas");
                System.out.println("3) Ingresar un Plan Post Pago Megas Minutos");
                System.out.println("4) Ingresar un Plan Post Pago Megas Minutos Economico");
                System.out.println("0) Salir");
                op = sc.nextInt();
                sc.nextLine();
                if ( op < 0 || op > 4 ) {
                    opInvalida = true;
                } else {
                    opInvalida = false;
                }
                if (opInvalida) {
                    System.out.println("ERROR, INGRESE UNA OPCION VALIDA");
                }
            } while (opInvalida);
            

            if (op != 0) {
                System.out.println("Datos Generales");
                System.out.println("----------------------------------------");
                System.out.println("Ingrse lo nombres del propietario:");
                String nombre = sc.nextLine();
                System.out.println("Ingrese la cedula del propietario");
                String cedula = sc.nextLine();
                System.out.println("Ingrese la ciudad del propietario");
                String ciudad = sc.nextLine();
                System.out.println("Ingrese la marca del celular");
                String marca = sc.nextLine();
                System.out.println("Ingrese el modelo del celular");
                String modelo = sc.nextLine();
                System.out.println("----------------------------------------");

                switch (op) {

                    case 1:
                        System.out.println("Datos del Plan");
                        System.out.println("----------------------------------------");
                        System.out.println("Ingrese el numero de minutos nacionales del plan");
                        double nacionales = sc.nextDouble();
                        System.out.println("Ingrese el costo de los minutos nacionales");
                        double costoNacionales = sc.nextDouble();
                        System.out.println("Ingrese el numero de minutos internacionales del plan");
                        double internacionales = sc.nextDouble();
                        System.out.println("Ingrese el costo de los minutos internacionales ");
                        double costoInternacionales = sc.nextDouble();
                        System.out.println("----------------------------------------");
                        PlanPostPagoMinutos p1 = new PlanPostPagoMinutos(
                                nacionales,
                                costoNacionales,
                                internacionales,
                                costoInternacionales,
                                nombre,
                                cedula,
                                ciudad,
                                marca,
                                modelo
                        );
                        c1.insertarPlan(p1);
                        break;
                    case 2:
                        System.out.println("Datos del Plan");
                        System.out.println("----------------------------------------");
                        System.out.println("Ingrese el numero de megas (en gigas)del plan");
                        double megas2 = sc.nextDouble();
                        System.out.println("Ingrese el costo por Giga");
                        double costoGiga2 = sc.nextDouble();
                        System.out.println("Ingrese la tarifa base del plan");
                        double tarifaBase = sc.nextDouble();
                        System.out.println("----------------------------------------");
                        PlanPostPagoMegas p2 = new PlanPostPagoMegas(
                                megas2,
                                costoGiga2,
                                tarifaBase,
                                nombre,
                                cedula,
                                ciudad,
                                marca,
                                modelo
                        );
                        c2.insertarPlan(p2);
                        break;

                    case 3:
                        System.out.println("Datos del Plan");
                        System.out.println("----------------------------------------");
                        System.out.println("Ingrese el numero de minutos del plan");
                        double minutos3 = sc.nextDouble();
                        System.out.println("Ingrese el costo por minuto");
                        double costoMinuto3 = sc.nextDouble();
                        System.out.println("Ingrese el numero de megas (en gigas)del plan");
                        double megas3 = sc.nextDouble();
                        System.out.println("Ingrese el costo por Giga");
                        double costoGiga3 = sc.nextDouble();
                        System.out.println("----------------------------------------");
                        PlanPostPagoMinutosMegas p3 = new PlanPostPagoMinutosMegas(
                                minutos3,
                                costoMinuto3,
                                megas3,
                                costoGiga3,
                                nombre,
                                cedula,
                                ciudad,
                                marca,
                                modelo
                        );
                        c3.insertarPlan(p3);
                        break;

                    case 4:
                        System.out.println("Datos del Plan");
                        System.out.println("----------------------------------------");
                        System.out.println("Ingrese el numero de minutos del plan");
                        double minutos4 = sc.nextDouble();
                        System.out.println("Ingrese el costo por minuto");
                        double costoMinuto4 = sc.nextDouble();
                        System.out.println("Ingrese el numero de megas (en gigas)del plan");
                        double megas4 = sc.nextDouble();
                        System.out.println("Ingrese el costo por Giga");
                        double costoGiga4 = sc.nextDouble();
                        System.out.println("----------------------------------------");
                        PlanPostPagoMinutosMegasEconomico p4 = new PlanPostPagoMinutosMegasEconomico(
                                minutos4,
                                costoMinuto4,
                                megas4,
                                costoGiga4,
                                nombre,
                                cedula,
                                ciudad,
                                marca,
                                modelo
                        );
                        c4.insertarPlan(p4);
                        break;

                    default:
                        break;
                }
                do {
                    System.out.println("Desea ingresar otro plan telefonico?");
                    System.out.println("1) Si");
                    System.out.println("0) Salir");
                    op = sc.nextInt();
                    sc.nextLine();
                    if (op < 0 || op > 1) {
                        opInvalida = true;
                    } else {
                        opInvalida = false;
                    }
                    if (opInvalida) {
                        System.out.println("ERROR, INGRESE UNA OPCION VALIDA");
                    }
                } while (opInvalida);
                
                
            }

        }
        System.out.println("PLANES POST PAGO MINUTOS");
        for (int i = 0; i < c1.obtenerDataPlan().size(); i++) {
            System.out.printf("%s", c1.obtenerDataPlan().get(i));
        }
        System.out.println("PLANES POST PAGO MEGAS");
        for (int i = 0; i < c2.obtenerDataPlan().size(); i++) {
            System.out.printf("%s", c2.obtenerDataPlan().get(i));
        }
        System.out.println("PLANES POST PAGO MINUTOS MEGAS");
        for (int i = 0; i < c3.obtenerDataPlan().size(); i++) {
            System.out.printf("%s", c3.obtenerDataPlan().get(i));
        }
        System.out.println("PLANES POST PAGO MINUTOS MEGAS ECONOMICOS");
        for (int i = 0; i < c4.obtenerDataPlan().size(); i++) {
            System.out.printf("%s", c4.obtenerDataPlan().get(i));
        }

    }

}
