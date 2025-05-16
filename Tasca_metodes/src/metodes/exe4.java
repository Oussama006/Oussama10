package metodes;

import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introdueix un numero: ");
		int num = in.nextInt();
		
		String romanos = convertir(num);
		System.out.print("El numero amb roma és: " );

		
	}
	public static String convertir(int numero) {
		if(numero <= 0 || numero>3999) {
			return "Error";
		}
		
		int [] num = {1,2,3,4,5,6,7,8,9};
		int [] num2 = {10,20,30,40,50,60,70,80,90};
		int [] num3 = {100,200,300,400,500,600,700,800,900};
		int [] num4 = {1000,2000,3000};
		
		String [] roma = {"I","II","III","IV","V","VI","VII","VIII","IX"};
		String [] roma2 = {"X","XX","XXX","XL","L","LX","LXX","LXXX","LC"};
		String [] roma3 = {"C","CC","CCC","DC","D","DC","DCC","DCCC","MD"};
		String [] roma4 = {"M","MM","MMM"};
		
		String resultado = " ";

		for(int i = 0; i<num.length;i++) {
			while(numero >= num[i]) {
				resultado = resultado + roma;
				numero = numero - num[i];
			}
		}
		return resultado;
	}

}
