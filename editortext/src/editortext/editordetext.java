package editortext;

import java.util.*;

class editordetext {

	private StringBuilder text;
	private Deque<String> Desfer;
	private Deque<String> Refer;
	private Set<String> paraulesUniques;
	private Map<String,Integer> estaristiques;
	
	public editordetext() {
		this.text = new StringBuilder();
		this.Desfer = new LinkedList<>();
		this.Refer = new LinkedList<>();
		this.paraulesUniques = new HashSet<>();
		this.estaristiques = new HashMap<>();
	}
	
	public void escriure(String paraula) {
		Desfer.push(paraula);
		Refer.clear();
		text.append(paraula).append(" ");
		actualitzarEstadistiques(paraula);
		paraulesUniques.add(paraula);
		
	}
	
	private void actualitzarEstadistiques(String paraula) {
		if(estaristiques.containsKey(paraula)) {
			int cont = estaristiques.get(paraula);
			estaristiques.put(paraula, cont+1);
		}else {
			estaristiques.put(paraula, 1);
		}
	}
	
	private void revertirEstadistiques (String paraula) {
		if(estaristiques.containsKey(paraula)) {
			int cont = estaristiques.get(paraula);
			if(cont > 1) {
				estaristiques.put(paraula, cont -1);
			}else {
				estaristiques.remove(paraula);
				paraulesUniques.remove(paraula);
			}
		}
	}
	
	public void desferMet() {
		if(!Desfer.isEmpty()) {
			String accio = Desfer.pop();
			Refer.push(accio);
			
			int index = text.lastIndexOf(accio);
			if(index != -1) {
				text.delete(index, index + accio.length() +1);
			}
			
			revertirEstadistiques(accio);
			System.out.println("Acció desfeta: "+ accio);
		}
	}
	
	public void referMet() {
		if(!Refer.isEmpty()) {
			String accio = Refer.pop();
			text.append(accio).append(" ");
			Desfer.push(accio);
			
			actualitzarEstadistiques(accio);
			paraulesUniques.add(accio);
			System.out.println("Acció refeta: "+ accio);
		}
	}
	
	public void mostrarText() {
		System.out.println("Text actual: "+ text.toString().trim());
	}
	
	public void mostrarEstadistiques() {
		System.out.println("Estaristicas paraula: ");
		for(String paraula : estaristiques.keySet()) {
			int contador = estaristiques.get(paraula);
			System.out.println("- " + paraula + " = " + contador + " vegades.");
		}
	}
	
	public void mostrarParaulesUniques() {
		System.out.println("Paraula úniques: ");
		for(String p : paraulesUniques) {
			System.out.println("- "+p);
		}
	}
}
