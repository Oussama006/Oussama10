package cafeteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Deque;
import java.util.LinkedList;

class Cafeteria {
	private Map<String, Clients> clientt;
	private Deque<Comandes> comanda2;
	
	public Cafeteria() {
		this.clientt = new HashMap<>();
		this.comanda2 = new LinkedList<>();
	}
	
	public void registrarClient(Clients client) {
		if(client == null) {
			System.out.println("Els clients no estan reguistrats.");
		}
		
		clientt.putIfAbsent(client.getDNI(), client);
	}
	
	public void ferComandes(String dniClient, String nomProducte) {
		Clients client = clientt.get(dniClient);
		if(client == null) {
			System.out.println("El client no esta reguistrat amb aquest dni: "+ dniClient);
			return;
		}
		
		Comandes comanda = new Comandes(client, nomProducte);
		
		if(client.esVip()) {
			comanda2.addFirst(comanda);
			System.out.println("La comanda VIP s'ha afegit al primer");
		}else {
			comanda2.addLast(comanda);
			System.out.println("La comanda VIP s'ha afegit al final.");
		}
	}
	
	public void processarComandes() {
		if(!comanda2.isEmpty()) {
			Comandes comandaaa = comanda2.pollFirst();
			System.out.println("Processant: "+ comandaaa);
		}else {
			System.out.println("No hi ha comandes.");
		}
	}
	
	public void mostrarCua() {
		System.out.println("Cua de comandes: ");
		for(Comandes comanda : comanda2) {
			System.out.println("-" + comanda);
		}
	}
	
	public void mostrarInformClien(String dniClient) {
		Clients client = clientt.get(dniClient);
		if(client != null) {
			System.out.println("Informació del client: ");
			System.out.println("- Nom: "+ client.getNom());
			System.out.println("- DNI: "+ client.getDNI());
			System.out.println("- Tipus: "+ client.esVip());
		}
	}
}

