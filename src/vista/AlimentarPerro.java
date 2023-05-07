package vista;

import logica.Perro;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

public class AlimentarPerro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public AlimentarPerro(Perro perro) {
		setTitle("Pet Shop");
		setIconImage(Toolkit.getDefaultToolkit().getImage(AlimentarPerro.class.getResource("/imagenes/icono.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(perro.getNombre() + ": Que delicia de comida!");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(38, 176, 346, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setForeground(new Color(255, 0, 0));
		btnVolver.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPerro ventanaPerro = new VentanaPerro(perro);
				ventanaPerro.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(170, 207, 89, 23);
		contentPane.add(btnVolver);
		
		JLabel lblPerroComiendo = new JLabel("");
		lblPerroComiendo.setIcon(new ImageIcon(new ImageIcon(AlimentarPerro.class.getResource("/imagenes/PerroComiendo.png")).getImage().getScaledInstance(178, 133, Image.SCALE_DEFAULT)));
		lblPerroComiendo.setBounds(120, 40, 178, 133);
		contentPane.add(lblPerroComiendo);
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/fondo.png")).getImage().getScaledInstance(434, 261, Image.SCALE_DEFAULT)));

		lblFondo.setBounds(0, 0, 434, 261);
		contentPane.add(lblFondo);
	}

}
