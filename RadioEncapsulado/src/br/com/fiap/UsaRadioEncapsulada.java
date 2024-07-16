package br.com.fiap;

public class UsaRadioEncapsulada {

	public static void main(String[] args) {
		
		RadioEncapsulada radio = new RadioEncapsulada();
		
		radio.setEstacao(89.1f);
		radio.setVolume(5);
		radio.aumentarVolume();
		radio.aumentarVolume();
		radio.setEstacao(92.5f);
		radio.mostrar();
	}

}
