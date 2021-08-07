package Clases;

import java.util.Scanner;

public class producto_clase {

    public static String nom_producto1;
    public static int cantidad1;
    public static float precio1;
    public static float kgs1;

    public void llenar_informacion1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nombre del Producto: ");
        nom_producto1 = s.nextLine();
        System.out.println("Cantidad de Producto: ");
        cantidad1 = s.nextInt();
        System.out.println("Precio del Producto: ");
        precio1 = s.nextFloat();
        System.out.println("Ingrese cantidad de KGS: ");
        kgs1 = s.nextFloat();
    }

    public static String nom_producto2;
    public static int cantidad2;
    public static float precio2;
    public static float kgs2;

    public void llenar_informacion2() {

        Scanner s = new Scanner(System.in);
        System.out.println("Nombre del Producto 2: ");
        nom_producto2 = s.nextLine();
        System.out.println("Cantidad de Producto 2: ");
        cantidad2 = s.nextInt();
        System.out.println("Precio del Producto 2: ");
        precio2 = s.nextFloat();
        System.out.println("Ingrese cantidad de KGS: ");
        kgs2 = s.nextFloat();
    }

    public static String nom_producto3;
    public static int cantidad3;
    public static float precio3;
    public static float kgs3;

    public void llenar_informacion3() {

        Scanner s = new Scanner(System.in);
        System.out.println("Nombre del Producto 3: ");
        nom_producto3 = s.nextLine();
        System.out.println("Cantidad de Producto 3: ");
        cantidad3 = s.nextInt();
        System.out.println("Precio del Producto 3: ");
        precio3 = s.nextFloat();
        System.out.println("Ingrese cantidad de KGS: ");
        kgs3 = s.nextFloat();
    }

    public static String nom_producto4;
    public static int cantidad4;
    public static float precio4;
    public static float kgs4;

    public void llenar_informacion4() {

        Scanner s = new Scanner(System.in);
        System.out.println("Nombre del Producto 4: ");
        nom_producto4 = s.nextLine();
        System.out.println("Cantidad de Producto 4: ");
        cantidad4 = s.nextInt();
        System.out.println("Precio del Producto 4: ");
        precio4 = s.nextFloat();
        System.out.println("Ingrese cantidad de KGS: ");
        kgs4 = s.nextFloat();
    }

    public static float seguro;
    public static float impuestos;
    public static float acarreo;
    public static float com_bancaria;
    public static float flete;

    public void llenar_informacion_gastos() {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese precio del Seguro Local: ");
        seguro = s.nextFloat();
        System.out.println("Ingrese precio del Flete: ");
        flete = s.nextFloat();
        System.out.println("Ingrese precio de Impuestos: ");
        impuestos = s.nextFloat();
        System.out.println("Ingrese precio de Acarreo: ");
        acarreo = s.nextFloat();
        System.out.println("Ingrese precio de Comisiones Bancarias: ");
        com_bancaria = s.nextFloat();
    }
}







//import java.io.IOException;
//public void limpiar_pantalla()throws IOException, InterruptedException{
//Scanner s = new Scanner(System.in);
//System.out.println("Teclea \"s\" y luego presiona la tecla [Enter] para continuar... ");
//s.next().charAt(0);
//new ProcessBuilder("cmd", "/s", "cls").inheritIO().start().waitFor();
    //}

