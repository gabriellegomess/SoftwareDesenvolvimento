package br.edu.up.telas;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.edu.up.db.BancoDeDados;
import br.edu.up.modelos.Pessoa;

public class TelaPrincipal {

	public JFrame frame;
	private JTable table;
	private BancoDeDados db;

	/**
	 * Create the application.
	 */
	public TelaPrincipal(BancoDeDados db) {
		this.db = db;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	    DefaultTableModel model = new DefaultTableModel();
	    table = new JTable(model);
	    

	    model.addColumn("Nome");
	    model.addColumn("CPF");
		for(Pessoa pessoa : db.getPessoas()) {
			model.addRow(new Object[] {pessoa.getNome(), pessoa.getCPF()});
		}
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 11, 400, 241);
		frame.getContentPane().add(scrollPane);

	}
}
