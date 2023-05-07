package vista;

import logica.*;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

public class VentanaGato extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public VentanaGato(Gato gato) {
		setTitle("Pet Shop");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaGato.class.getResource("/imagenes/icono.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreGato = new JLabel(gato.getNombre());
		lblNombreGato.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNombreGato.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreGato.setBounds(10, 0, 415, 33);
		contentPane.add(lblNombreGato);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setForeground(new Color(255, 0, 0));
		btnVolver.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatosMascota DatosMenuGato = new DatosMascota("gato");
				DatosMenuGato.setVisible(true);
				DatosMenuGato.getTxtNombre().setText(gato.getNombre());
				DatosMenuGato.getTxtEdad().setText(Integer.toString(gato.getEdad()));
				dispose();
			}
		});
		btnVolver.setBounds(165, 227, 99, 23);
		contentPane.add(btnVolver);
		
		JButton btnComerGato = new JButton("Alimentar");
		btnComerGato.setForeground(new Color(255, 0, 0));
		btnComerGato.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnComerGato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlimentarGato alimentarGato = new AlimentarGato(gato);
				alimentarGato.setVisible(true);
				dispose();
			}
		});
		btnComerGato.setBounds(34, 193, 99, 23);
		contentPane.add(btnComerGato);
		
		JButton btnDormirGato = new JButton("Dormir");
		btnDormirGato.setForeground(new Color(255, 0, 0));
		btnDormirGato.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnDormirGato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DormirGato dormirGato = new DormirGato(gato);
				dormirGato.setVisible(true);
				dispose();
			}
		});
		btnDormirGato.setBounds(165, 193, 99, 23);
		contentPane.add(btnDormirGato);
		
		JButton btnInteractuarGato = new JButton("Interactuar");
		btnInteractuarGato.setForeground(new Color(255, 0, 0));
		btnInteractuarGato.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnInteractuarGato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InteractuarGato interactuarGato = new InteractuarGato(gato);
				interactuarGato.setVisible(true);
				dispose();
			}
		});
		btnInteractuarGato.setBounds(297, 193, 99, 23);
		contentPane.add(btnInteractuarGato);
		
		JLabel lblEdad = new JLabel(Integer.toString(gato.getEdad()) + " años");
		lblEdad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblEdad.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdad.setBounds(10, 30, 415, 14);
		contentPane.add(lblEdad);
		
		JLabel lblGato = new JLabel("");
		lblGato.setIcon(new ImageIcon(new ImageIcon(VentanaPerro.class.getResource("/imagenes/gatoSala.png")).getImage().getScaledInstance(141, 127, Image.SCALE_DEFAULT)));
		lblGato.setBounds(146, 55, 141, 127);
		contentPane.add(lblGato);
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/fondo.png")).getImage().getScaledInstance(434, 261, Image.SCALE_DEFAULT)));

		lblFondo.setBounds(0, 0, 434, 261);
		contentPane.add(lblFondo);
 }
}