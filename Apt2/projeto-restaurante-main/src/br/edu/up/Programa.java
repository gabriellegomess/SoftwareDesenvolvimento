package br.edu.up;

import java.awt.EventQueue;

import br.edu.up.db.BancoDeDados;
import br.edu.up.telas.TelaPrincipal;

public class Programa {

	/**
	 * Inicia o programa.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal(new BancoDeDados());
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}
