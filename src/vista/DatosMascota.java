package vista;

import logica.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

public class DatosMascota extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtEdad;
	
	
	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtEdad() {
		return txtEdad;
	}

	public void setTxtEdad(JTextField txtEdad) {
		this.txtEdad = txtEdad;
	}

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public DatosMascota(String mascotaId) {
		setTitle("Pet Shop");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DatosMascota.class.getResource("/imagenes/icono.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 238);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("es momento de identificar a tu " + mascotaId);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(26, 59, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Edad:");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(26, 90, 71, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnVolver.setForeground(new Color(255, 0, 0));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPrincipal principal = new VentanaPrincipal();
				principal.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(172, 165, 105, 23);
		contentPane.add(btnVolver);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(107, 57, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(107, 88, 86, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setForeground(new Color(255, 0, 0));
		btnContinuar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				// pido y valido los datos de la mascota:
				int edad = Integer.parseInt(txtEdad.getText());
				if (txtNombre.getText().isEmpty() | edad < 0){
					throw new Exception();
				}
				if (mascotaId.equals("perro")){
					Perro perro = new Perro(txtNombre.getText(), edad);
					VentanaPerro ventanaMenuPerro = new VentanaPerro(perro);
					ventanaMenuPerro.setVisible(true);
					dispose();
				}
				else if (mascotaId.equals("gato")) {
					Gato gato = new Gato(txtNombre.getText(), edad);
					VentanaGato ventanaMenuGato = new VentanaGato(gato);
					ventanaMenuGato.setVisible(true);
					dispose();
				}
				else {
					Hamster hamster = new Hamster(txtNombre.getText(), edad);
					VentanaHamster ventanaMenuHamster = new VentanaHamster(hamster);
					ventanaMenuHamster.setVisible(true);
					dispose();
				}
				
				}
			catch (Exception er) {
				JOptionPane.showMessageDialog(null, "Por favor inserta datos validos");

				}
				
				
			}
		});
		btnContinuar.setBounds(172, 131, 105, 23);
		contentPane.add(btnContinuar);
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/fondo.png")).getImage().getScaledInstance(434, 261, Image.SCALE_DEFAULT)));

		lblFondo.setBounds(0, 0, 434, 261);
		contentPane.add(lblFondo);
	}
}
