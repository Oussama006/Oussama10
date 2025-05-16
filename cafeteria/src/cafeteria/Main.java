package cafeteria;

public class Main {

	public static void main(String[] args) {
		
		Cafeteria cafe = new Cafeteria();
		
		cafe.registrarClient(new Clients("12345678A", "Anna", false));
		cafe.registrarClient(new Clients("87654321B", "Jordi", true));
		cafe.registrarClient(new Clients("11223344C", "Wesh", false));
		
		cafe.ferComandes("12345678A", "Cafè amb llet");
		cafe.ferComandes("87654321B", "Cafè sol");
		cafe.ferComandes("11223344C", "Té verd");
		cafe.ferComandes("00000000Z", "Capuccino");

		cafe.mostrarCua();
		
		System.out.println(" ");
		cafe.processarComandes();
		cafe.processarComandes();
		cafe.processarComandes();
		cafe.processarComandes();
		
		cafe.mostrarInformClien("12345678A");
		cafe.mostrarInformClien("00000000Z");
	}
}