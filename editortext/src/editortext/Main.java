package editortext;

class Main {

	public static void main(String[] args) {
		
		editordetext editor = new editordetext();

		editor.escriure("Wachh");
		editor.escriure("Hassan");
		editor.escriure("Agyor");
		
		editor.mostrarText();
		editor.mostrarEstadistiques();
		editor.mostrarParaulesUniques();
		
		editor.desferMet();
		editor.mostrarText();
		editor.mostrarEstadistiques();
		
		editor.referMet();
		editor.mostrarText();
		editor.mostrarEstadistiques();
	}
}