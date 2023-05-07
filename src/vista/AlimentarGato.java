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

public class AlimentarGato extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public AlimentarGato(Gato gato) {
		setTitle("Pet Shop");
		setIconImage(Toolkit.getDefaultToolkit().getImage(AlimentarGato.class.getResource("/imagenes/icono.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(gato.getNombre() + ": No esta mal");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(33, 182, 346, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setForeground(new Color(255, 0, 0));
		btnVolver.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaGato ventanaGato = new VentanaGato(gato);
				ventanaGato.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(170, 207, 89, 23);
		contentPane.add(btnVolver);
		
		JLabel lblPerroComiendo = new JLabel("");
		lblPerroComiendo.setIcon(new ImageIcon(new ImageIcon(AlimentarPerro.class.getResource("/imagenes/GatoComiendo.jpg")).getImage().getScaledInstance(178, 133, Image.SCALE_DEFAULT)));
		lblPerroComiendo.setBounds(120, 40, 178, 133);
		contentPane.add(lblPerroComiendo);
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/fondo.png")).getImage().getScaledInstance(434, 261, Image.SCALE_DEFAULT)));

		lblFondo.setBounds(0, 0, 434, 261);
		contentPane.add(lblFondo);
	}

}
