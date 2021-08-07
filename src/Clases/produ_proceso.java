package Clases;

import java.util.Scanner;

public class produ_proceso {

    public float sum1, sum2, sum3, sum4, sumtot;

    public void primer_paso() {
        sum1 = producto_clase.precio1 * producto_clase.cantidad1;
        sum2 = producto_clase.precio2 * producto_clase.cantidad2;
        sum3 = producto_clase.precio3 * producto_clase.cantidad3;
        sum4 = producto_clase.precio4 * producto_clase.cantidad4;
        sumtot = sum1 + sum2 + sum3 + sum4;
        
        System.out.println(producto_clase.nom_producto1 + " Precio:" + producto_clase.precio1 + " Por " + "Cantidad:" + producto_clase.cantidad1 + " =" + sum1);
        System.out.println(producto_clase.nom_producto2 + " Precio:" + producto_clase.precio2 + " Por " + "Cantidad:" + producto_clase.cantidad2 + " =" + sum2);
        System.out.println(producto_clase.nom_producto3 + " Precio:" + producto_clase.precio3 + " Por " + "Cantidad:" + producto_clase.cantidad3 + " =" + sum3);
        System.out.println(producto_clase.nom_producto4 + " Precio:" + producto_clase.precio4 + " Por " + "Cantidad:" + producto_clase.cantidad4 + " =" + sum4);
        System.out.println("Valor Total: " + sumtot);
    }
    public float suma2;

    public void segundo_paso() {
        suma2 = producto_clase.seguro + producto_clase.impuestos + producto_clase.com_bancaria;
        System.out.println("Seguro\t\t\t" + producto_clase.seguro);
        System.out.println("Impuestos\t\t" + producto_clase.impuestos);
        System.out.println("Comisiones Bancarias\t" + producto_clase.com_bancaria);
        System.out.println("Total \ndel Gasto al Valor\t" + suma2);
    }

    public float suma3;

    public void tercer_paso() {
        suma3 = suma2 / sumtot;
        System.out.println("Gasto al Valor: " + suma2 + " Dividido " + sumtot + " = Coeficiente Del Gasto: " + suma3);
    }
    public float sum4tot1, sum4tot2, sum4tot3, sum4tot4;

    public void cuarto_paso() {
        sum4tot1 = producto_clase.precio1 * suma3;
        sum4tot2 = producto_clase.precio2 * suma3;
        sum4tot3 = producto_clase.precio3 * suma3;
        sum4tot4 = producto_clase.precio4 * suma3;
        System.out.println("Valor por Unidad: " + producto_clase.precio1 + " X " + "Gasto al Valor" + suma3 + " = " + sum4tot1);
        System.out.println("Valor por Unidad: " + producto_clase.precio2 + " X " + "Gasto al Valor" + suma3 + " = " + sum4tot2);
        System.out.println("Valor por Unidad: " + producto_clase.precio3 + " X " + "Gasto al Valor" + suma3 + " = " + sum4tot3);
        System.out.println("Valor por Unidad: " + producto_clase.precio4 + " X " + "Gasto al Valor" + suma3 + " = " + sum4tot4);
    }
    public float sum5tot1, sum5tot2, sum5tot3, sum5tot4, sumtot5;

    public void quinto_paso() {

        sum5tot1 = producto_clase.cantidad1 * producto_clase.kgs1;
        sum5tot2 = producto_clase.cantidad2 * producto_clase.kgs2;
        sum5tot3 = producto_clase.cantidad3 * producto_clase.kgs3;
        sum5tot4 = producto_clase.cantidad4 * producto_clase.kgs4;
        sumtot5 = sum5tot1 + sum5tot2 + sum5tot3 + sum5tot4;
        System.out.println(producto_clase.nom_producto1 + ":" + producto_clase.kgs1 + "Kgs." + " X " + producto_clase.cantidad1 + " =" + sum5tot1);
        System.out.println(producto_clase.nom_producto2 + ":" + producto_clase.kgs2 + "Kgs." + " X " + producto_clase.cantidad2 + " =" + sum5tot2);
        System.out.println(producto_clase.nom_producto3 + ":" + producto_clase.kgs3 + "Kgs." + " X " + producto_clase.cantidad3 + " =" + sum5tot3);
        System.out.println(producto_clase.nom_producto4 + ":" + producto_clase.kgs4 + "Kgs." + " X " + producto_clase.cantidad4 + " =" + sum5tot4);
        System.out.println("El Peso Total de la Mercaderia es de: " + sumtot5);
    }
    public float suma6;

    public void sexto_paso() {
        suma6 = producto_clase.flete + producto_clase.acarreo;
        System.out.println("Fletes: \t\t" + producto_clase.flete);
        System.out.println("Acarreo; \t\t" + producto_clase.acarreo);
        System.out.println("Total: \t\t" + suma6);
    }
    public float suma7;

    public void septimo_paso() {

        suma7 = suma6 / sumtot5;
        System.out.println(suma6 + "/" + sumtot5 + " = " + suma7);
    }
    public float sum8tot1, sum8tot2, sum8tot3, sum8tot4;

    public void octavo_paso() {

        sum8tot1 = producto_clase.kgs1 * suma7;
        sum8tot2 = producto_clase.kgs2 * suma7;
        sum8tot3 = producto_clase.kgs3 * suma7;
        sum8tot4 = producto_clase.kgs4 * suma7;
        System.out.println(producto_clase.kgs1 + "Kgs. " + " X " + suma7 + " = " + sum8tot1);
        System.out.println(producto_clase.kgs2 + "Kgs. " + " X " + suma7 + " = " + sum8tot2);
        System.out.println(producto_clase.kgs3 + "Kgs. " + " X " + suma7 + " = " + sum8tot3);
        System.out.println(producto_clase.kgs4 + "Kgs. " + " X " + suma7 + " = " + sum8tot4);
    }
    public float sum9tot1, sum9tot2, sum9tot3, sum9tot4, sum1tot9, sum2tot9, sum3tot9, sum4tot9, sumTotal;

    public void noveno_paso() {
        sum9tot1 = producto_clase.precio1 + sum4tot1 + sum8tot1;
        sum9tot2 = producto_clase.precio2 + sum4tot2 + sum8tot2;
        sum9tot3 = producto_clase.precio3 + sum4tot3 + sum8tot3;
        sum9tot4 = producto_clase.precio4 + sum4tot4 + sum8tot4;
        sum1tot9 = producto_clase.cantidad1 * sum9tot1;
        sum2tot9 = producto_clase.cantidad2 * sum9tot2;
        sum3tot9 = producto_clase.cantidad3 * sum9tot3;
        sum4tot9 = producto_clase.cantidad4 * sum9tot4;
        sumTotal = sum1tot9 + sum2tot9 + sum3tot9 + sum4tot9;
        System.out.println(producto_clase.cantidad1 + "\t" + producto_clase.nom_producto1 + "\t" + producto_clase.precio1 + "\t" + sum4tot1 + "\t" + sum8tot1 + "\t" + sum9tot1 + "\t" + sum1tot9);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(producto_clase.cantidad2 + "\t" + producto_clase.nom_producto2 + "\t" + producto_clase.precio2 + "\t" + sum4tot2 + "\t" + sum8tot2 + "\t" + sum9tot2 + "\t" + sum2tot9);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(producto_clase.cantidad3 + "\t" + producto_clase.nom_producto3 + "\t" + producto_clase.precio3 + "\t" + sum4tot3 + "\t" + sum8tot3 + "\t" + sum9tot3 + "\t" + sum3tot9);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(producto_clase.cantidad4 + "\t" + producto_clase.nom_producto4 + "\t" + producto_clase.precio4 + "\t" + sum4tot4 + "\t" + sum8tot4 + "\t" + sum9tot4 + "\t" + sum4tot9);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("\t Gran Total \t\t\t\t\t" + sumTotal);
    }
    public float suma10;

    public void decimo_paso() {

        suma10 = sumtot + suma2 + suma6;
        System.out.println("Total Factura: \t\t" + sumtot);
        System.out.println("Total Gastos al valor: \t\t" + suma2);
        System.out.println("Total Gasto al Peso: \t\t" + suma6);
        System.out.println("Gran Total: \t\t" + suma10);
    }
}
