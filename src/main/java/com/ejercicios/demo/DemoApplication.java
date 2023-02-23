package com.ejercicios.demo;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {
//1. Escriba un programa que solicite a un usuario dos números por teclado y calcule su suma, resta, producto y división.
public static int suma (int numero1, int numero2){
	int sumaNumero = numero1 + numero2;
	return sumaNumero;
	}
public static int resta (int numero1, int numero2){
	int restaNumero = numero1 - numero2;
	return restaNumero;
	}
public static int multi (int numero1, int numero2){
	int multiNumero = numero1 * numero2;
	return multiNumero;
	}
public static int div (int numero1, int numero2){
	int divNumero = numero1 / numero2;
	return divNumero;
	}

//2. Escriba un programa que permita calcular el área de un rectángulo. 
//¿Cómo modificaría su programa para que ahora calcule el área de un cuadrado de 
//igual medida al ancho del rectángulo anterior?

public static double areaTotal (double largo, double ancho){
	double area = largo * ancho;
	return area; 
}


//3.Escriba un programa que, dada una cantidad de dinero en pesos chilenos 
//ingresada por teclado, calcule la cantidad de dólares que se pueden comprar
    
    
public static int pesosTotales(int pesoChileno, int valorUSD){
	int cantidadComprable = pesoChileno / 790;
    return cantidadComprable;
}

//4. Escriba un algoritmo que permita calcular la edad de una persona según su año de nacimiento
public static int calculoEdad (int anioActual, int anioNacimiento){
	int edad = anioActual - anioNacimiento;
  return edad;
}

//5. Escriba un programa que solicite al usuario 4 notas y calcule su promedio

public static Double sumaNotass (Double nota1, Double nota2, Double nota3, Double nota4){
	Double sumaNotas = (nota1 + nota2 + nota3 + nota4)/4;
	return sumaNotas;
}



	public static void main(String[] args) {
	// ejercico 1
	System.out.println("ingrese el primer numero");
	Scanner totalNumeros = new Scanner (System.in);
    int entradaNum = Integer.parseInt(totalNumeros.nextLine());
	System.out.println("ingrese el segundo numero");
	Scanner totalNumeros2 = new Scanner (System.in);
    int entradaNum2 = Integer.parseInt(totalNumeros2.nextLine());

	System.out.println("La suma de estos numeros es: " + suma(entradaNum, entradaNum2) );
	System.out.println("La resta de estos numeros es: " + resta(entradaNum, entradaNum2) );
	System.out.println("el producto de estos numeros es: " + multi(entradaNum, entradaNum2) );
	System.out.println("el cociente de estos numeros es: " + div(entradaNum, entradaNum2) );

	//ejercicio 2
    System.out.println("Ingrese el largo: ");
	Scanner medidaLargo = new Scanner (System.in);
	int largo = Integer.parseInt(medidaLargo.nextLine());
	System.out.println("Ingrese el ancho: ");
	Scanner medidaAncho = new Scanner (System.in);
    int ancho = Integer.parseInt(medidaLargo.nextLine());


	System.out.println("el area de esta figura es: " + areaTotal(largo, ancho));
	System.out.println("el area de este cuadrado segun el ancho del rectangulo es: " + areaTotal(ancho, ancho));
	
	//Ejercicio 3
	System.out.println("ingrese cantidad de dinero en pesos chilenos: ");
	Scanner cantidadTotal = new Scanner(System.in);
	int dinero = Integer.parseInt(cantidadTotal.nextLine());
    
	System.out.println("la cantidad de dolares que se puede comprar es de: " + (dinero));

	//Ejercicio 4

    System.out.println("ingrese año actual: ");
	Scanner ingresoAnioActual = new Scanner (System.in);
	int fechaAct = Integer.parseInt(ingresoAnioActual.nextLine());

	System.out.println("ingrese año de nacimiento");
	Scanner ingresoAnioNac = new Scanner (System.in);
	int fechaNacimiento = Integer.parseInt(ingresoAnioNac.nextLine());

	System.out.println("tu edad es: " + calculoEdad(fechaAct, fechaNacimiento));

	//Ejercicio 5
	
	System.out.print("ingrese nota nº 1: ");
	Scanner teclado = new Scanner (System.in);
	int primeraNota = Integer.parseInt(teclado.nextLine());

    System.out.print("ingrese nota nº 2: ");
	Scanner teclado2 = new Scanner (System.in);
	int segundaNota = Integer.parseInt(teclado2.nextLine());

	System.out.print("ingrese nota nº 3: ");
	Scanner teclado3 = new Scanner (System.in);
	int tercerNota = Integer.parseInt(teclado3.nextLine());

	System.out.print("ingrese nota nº 4: ");
	Scanner teclado4 = new Scanner (System.in);
	int cuartaNota = Integer.parseInt(teclado4.nextLine());

	}
}
