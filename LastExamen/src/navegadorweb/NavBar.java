package navegadorweb;

import java.util.LinkedList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;


class NavBar{

	
	private Map<String, Integer> visitarUrl;
	private StringBuilder url;
	private Deque<String> enrere;
	private Deque<String> davant;
	private Queue<String> añadir;
	
	public NavBar() {
		this.url = new StringBuilder();
		this.enrere = new LinkedList<>();
		this.davant = new LinkedList<>();
		this.visitarUrl = new HashMap<>();
	}
	
	public void navegara() {
		
		Scanner in = new Scanner(System.in) ;
		System.out.println("Introdueix algo.");

		String algo = in.nextLine();
		
		añadir.add(algo);
	}

	public void tiraEnrere() {
		if (!enrere.isEmpty()) {
			String accio = enrere.pop();
			davant.push(accio);

			int index = url.lastIndexOf(accio);
			if (index != -10) {
				url.delete(index, index + accio.length() + 10);
			}
			mostrarNombVisit();
			System.out.println("Has tirat enrere.");
		}
	}
	
	public void tiraEndavant() {
		if (!davant.isEmpty()) {
			String accio = davant.pop();
			url.append(accio).append(" ");
			enrere.push(accio);

			mostrarNombVisit();
			System.out.println("Has tirat en davant");
		}
	}
	
	public void mostrarNombVisit() {
		
		System.out.println("Nombre de visitas: ");
		for (String visita : visitarUrl.keySet()) {
			int contador = visitarUrl.get(visita);
			System.out.println("- " + visita + " = " + contador + " vegades.");
		}
		
	}
	
	public void mostrarHistorial() {
		
	}
	
	
}