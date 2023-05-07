package vista;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setTitle("Pet Shop");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/imagenes/icono.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¡Bienvenido a Pet Shop!");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 20);
		contentPane.add(lblNewLabel);
		// defino el boton para salir
		JButton btnSalir = new JButton("Salir");
		btnSalir.setForeground(new Color(255, 0, 0));
		btnSalir.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(179, 204, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnPerro = new JButton("");
		btnPerro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatosMascota DatosMenuPerro = new DatosMascota("perro");
				DatosMenuPerro.setVisible(true);
				dispose();
			}
		});
		ImageIcon imageIcon = new ImageIcon((new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/perro.png")).getImage().getScaledInstance(103, 108, Image.SCALE_DEFAULT)));
		btnPerro.setIcon(imageIcon);
		btnPerro.setBounds(169, 75, 103, 108);
		contentPane.add(btnPerro);
		
		JLabel lblNewLabel_1 = new JLabel("Elije tu mascota:");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(10, 42, 177, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnGato = new JButton("");
		btnGato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatosMascota DatosMenuGato = new DatosMascota("gato");
				DatosMenuGato.setVisible(true);
				dispose();
			}
		});
		btnGato.setIcon(new ImageIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/gato.png")).getImage().getScaledInstance(103, 108, Image.SCALE_DEFAULT)));
		btnGato.setBounds(37, 75, 103, 108);
		contentPane.add(btnGato);
		
		JButton btnHamster = new JButton("");
		btnHamster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatosMascota DatosMenuHamster = new DatosMascota("hamster");
				DatosMenuHamster.setVisible(true);
				dispose();
			}
		});
		// integro el icono del programa:
		btnHamster.setIcon(new ImageIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/Hamster.png")).getImage().getScaledInstance(103, 108, Image.SCALE_DEFAULT)));

		btnHamster.setBounds(300, 75, 103, 108);
		contentPane.add(btnHamster);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/fondo.png")).getImage().getScaledInstance(434, 261, Image.SCALE_DEFAULT)));

		lblFondo.setBounds(0, 0, 434, 261);
		contentPane.add(lblFondo);
	}

}
