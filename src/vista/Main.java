/*
 * AUTOR: YADER IBRALDO QUIROGA TORRES
 * FECHA: 6-5-2023
 * PROGRAMA: PET SHOP
 */

package vista;

import java.awt.EventQueue;
// defino el main que se encargara de iniciar el programa:
public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
