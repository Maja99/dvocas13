package zadatak1.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JTextField;

import zadatak1.poslovna_logika.TekstDemo;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class TekstEditorGUI {

	private JFrame frmeditor;
	private JTextField textFieldUnosImena;
	private JTextArea textAreaEditor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TekstEditorGUI window = new TekstEditorGUI();
					window.frmeditor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TekstEditorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmeditor = new JFrame();
		frmeditor.setTitle("Editor 2");
		frmeditor.setBounds(100, 100, 696, 480);
		frmeditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmeditor.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		frmeditor.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		textAreaEditor = new JTextArea();
		scrollPane.setViewportView(textAreaEditor);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(120, 36));
		frmeditor.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblImeFajla = new JLabel("Ime fajla");
		lblImeFajla.setPreferredSize(new Dimension(100, 16));
		panel.add(lblImeFajla);
		
		textFieldUnosImena = new JTextField();
		panel.add(textFieldUnosImena);
		textFieldUnosImena.setColumns(10);
		
		JButton btnUcitaj = new JButton("Ucitaj");
		btnUcitaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TekstDemo td = new TekstDemo();
				String ime = textFieldUnosImena.getText();
				try {
					String tekst = td.ucitajTekst(ime);
					textAreaEditor.setText(tekst);
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		});
		btnUcitaj.setPreferredSize(new Dimension(100, 26));
		panel.add(btnUcitaj);
		
		JButton btnObrisi = new JButton("Obrisi");
		btnObrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaEditor.setText(null);
			}
		});
		btnObrisi.setPreferredSize(new Dimension(100, 26));
		panel.add(btnObrisi);
		
		JButton btnSacuvaj = new JButton("Sacuvaj");
		btnSacuvaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TekstDemo td = new TekstDemo();
				String tekst = textAreaEditor.getText();
				String ime = textFieldUnosImena.getText();
				try {
					td.upisiTekst(ime, tekst);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
		});
		btnSacuvaj.setPreferredSize(new Dimension(100, 26));
		panel.add(btnSacuvaj);
		
		JButton btnIzadji = new JButton("Izadji");
		btnIzadji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
		
		JButton btnZameni = new JButton("Zameni");
		btnZameni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZameniDialog dialog = new ZameniDialog(TekstEditorGUI.this);
				dialog.setVisible(true);
			}
		});
		btnZameni.setPreferredSize(new Dimension(100, 23));
		panel.add(btnZameni);
		btnIzadji.setPreferredSize(new Dimension(100, 26));
		panel.add(btnIzadji);
	}

	public void zameniString(String staSeMenja, String zamena) {
		String tekst = textAreaEditor.getText();
		String noviTekst = tekst.replaceAll(staSeMenja, zamena);
		textAreaEditor.setText(noviTekst);
	}

}
