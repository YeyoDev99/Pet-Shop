package vista;

import logica.Perro;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

public class VentanaPerro extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public VentanaPerro(Perro perro) {
		setTitle("Pet Shop");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPerro.class.getResource("/imagenes/icono.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombrePerro = new JLabel(perro.getNombre());
		lblNombrePerro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNombrePerro.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombrePerro.setBounds(10, 0, 415, 33);
		contentPane.add(lblNombrePerro);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setForeground(new Color(255, 0, 0));
		btnVolver.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatosMascota DatosMenuPerro = new DatosMascota("perro");
				DatosMenuPerro.setVisible(true);
				DatosMenuPerro.getTxtNombre().setText(perro.getNombre());
				DatosMenuPerro.getTxtEdad().setText(Integer.toString(perro.getEdad()));
				dispose();
			}
		});
		btnVolver.setBounds(165, 227, 99, 23);
		contentPane.add(btnVolver);
		
		JButton btnComerPerro = new JButton("Alimentar");
		btnComerPerro.setForeground(new Color(255, 0, 0));
		btnComerPerro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnComerPerro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlimentarPerro alimentarPerro = new AlimentarPerro(perro);
				alimentarPerro.setVisible(true);
				dispose();
			}
		});
		btnComerPerro.setBounds(34, 193, 99, 23);
		contentPane.add(btnComerPerro);
		
		JButton btnDormirPerro = new JButton("Dormir");
		btnDormirPerro.setForeground(new Color(255, 0, 0));
		btnDormirPerro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnDormirPerro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DormirPerro dormirPerro = new DormirPerro(perro);
				dormirPerro.setVisible(true);
				dispose();
			}
		});
		btnDormirPerro.setBounds(165, 193, 99, 23);
		contentPane.add(btnDormirPerro);
		
		JButton btnInteractuar = new JButton("Interactuar");
		btnInteractuar.setForeground(new Color(255, 0, 0));
		btnInteractuar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnInteractuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InteractuarPerro interactuarPerro = new InteractuarPerro(perro);
				interactuarPerro.setVisible(true);
				dispose();
			}
		});
		btnInteractuar.setBounds(297, 193, 99, 23);
		contentPane.add(btnInteractuar);
		
		JLabel lblEdad = new JLabel(Integer.toString(perro.getEdad()) + " años");
		lblEdad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblEdad.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdad.setBounds(10, 30, 415, 14);
		contentPane.add(lblEdad);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon(VentanaPerro.class.getResource("/imagenes/PerroBase.png")).getImage().getScaledInstance(141, 127, Image.SCALE_DEFAULT)));
		lblNewLabel.setBounds(146, 55, 141, 127);
		contentPane.add(lblNewLabel);
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/fondo.png")).getImage().getScaledInstance(434, 261, Image.SCALE_DEFAULT)));

		lblFondo.setBounds(0, 0, 434, 261);
		contentPane.add(lblFondo);
	}

}
