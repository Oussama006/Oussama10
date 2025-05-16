package TascaTicket;

public class runcompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LlistaDeLaCompra compra = new LlistaDeLaCompra();

				
		compra.afegir(new LlistaDeLaCompraItem("bóligraf",2, 1));
		compra.afegir(new LlistaDeLaCompraItem("llapis",4, 0.8));
		
		System.out.println(compra.toString());

	}
}