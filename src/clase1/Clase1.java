package clase1;
import java.util.Scanner;
public class Clase1 {

    public static void main(String[] args) {
        		int a=1;
		int b=10;
		int c=1;
		//declaración de un Scanner para mas tarde.
		Scanner leer = new Scanner(System.in);
		
		
		//a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”.
		while (a<=b) {
			System.out.print(" "+a);
			a=a+1;
		}
		System.out.println("");
		
		
		//b. A lo anterior, solo muestre los números pares.
		//Llamamos al metodo "par" para mostrar la cadena de numeros pares
		par(c);
		System.out.println("");

		
		//c.A lo anterior, con una variable extra, elija si se deben mostrar los números pares o impares
		System.out.println("Ingrese 1 para mostar solo los numeros Pares y 2 para los impares.");
		c=leer.nextInt();
		while (c<1 || c>2 ) {
			System.out.println("Ingrese un numero dentro del rango especificado.");
			c=leer.nextInt();
		}
		//Llamando al metodo "par" para mostrar la cadena de numeros pares o impares.
		par(c);
		System.out.println("");
		
		
		//d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
		for(int i=10; i>=1;i=i-2) {
			System.out.print(" "+i);
			
		}
                System.out.println("");
                System.out.println("determinar si una persona pertenece al segmento de ingresos altos");
                //2. “determinar si una persona pertenece al segmento de ingresos altos”
		
		/*Poseer una embarcación, una aeronave de lujo o ser titular de activos
		societarios que demuestren capacidad económica plena.” */
		String [] arreglo = new String[3];
		arreglo[0]="Embarcación";
		arreglo[1]="Aeronave";
		arreglo[2]="activos societarios";
		int respuesta;
		int conta=0;
		System.out.println("Responda con 1 (forma afirmativa) o 2(forma negativa), gracias.");
		for (int i=0; i<=2;i++) {
			System.out.println("Usted posee "+ arreglo[i]+"?");
			respuesta=leer.nextInt();
			while (respuesta<1 || respuesta>2) {
				System.out.println("ERROR: Responda con 1 (forma afirmativa) o 2(forma negativa), gracias.");
				respuesta=leer.nextInt();
			}
			if(respuesta == 1) {
				conta=conta+1;
			}
			System.out.println("Respuesta almacenada exitosamente.");
		}
		if(conta>1) {
			System.out.println("Usted pertenece al segmento de ingresos altos, felicitaciones.");
		}else {
			System.out.println("usted no pertenece al segmento de ingresos altos");
		}
    }
    public static void par(int bandera) {
		for(int i=1;i<=10;i++) {
			if (i%2 == 0 && bandera==1) {
				System.out.print(" "+i);
			}else if(i%2!=0 && bandera==2) {
				System.out.print(" "+i);
			}
		}
	}
    
}
