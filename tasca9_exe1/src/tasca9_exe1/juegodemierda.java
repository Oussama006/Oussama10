package tasca9_exe1;
import java.util.*;

public class juegodemierda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int aleatorio = (int) (Math.random()*2);
		
		int matriu [][]= new int [3][3];
		
		
		for(int i = 0; i<matriu.length;i++) {
			for(int j = 1; j<matriu[i].length;j++) {
				
				int count =0;
				if((i-1>=0 && i-1<=2) && (j-1>=0 && j-1<=2)){
					count = count+matriu[i-1][j-1];
					count = count+matriu[i-1][j];
					count = count+matriu[i-1][j++];
					count = count+matriu[i][j-1];
					count = count+matriu[i++][j-1];
					count = count+matriu[i][j];
					count = count+matriu[i++][j];
					count = count+matriu[i][j++];
					count = count+matriu[i++][j++];
					
				}
				
				
			}
		}		
	}
}