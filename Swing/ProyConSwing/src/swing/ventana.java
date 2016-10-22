package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana extends JFrame {

	private JPanel contentPane;
	private int cont=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventana() {
		setTitle("Mi primer Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//el comportamiento de la ventana, ej que al darle click al cerrar, cierrre toda la app 
													//disponse_on_close a la ventana sec, se cierra solo esa y no todo
													//do_nothing_on_close le doy cerrar no hace nada
													//setlocationRelativeTo() -> si este metodo no esta, windows le da una posicion por defecto...Se centra la ventana secundaria con respecto a la ppal 
													//-> con null se centra en el escritorio de windows
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 240);// x, y a partir del cual se crea panel
		contentPane.add(panel);
		panel.setLayout(null);
		
		final JLabel lblHolaJava = new JLabel("Hola Java");
		lblHolaJava.setBounds(116, 5, 87, 26);
		lblHolaJava.setBackground(Color.DARK_GRAY);
		lblHolaJava.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblHolaJava.setForeground(Color.PINK);
		lblHolaJava.setVerticalAlignment(SwingConstants.BOTTOM);
		panel.add(lblHolaJava);
		
		JButton btnNewButton = new JButton("Centrar clicks");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				lblHolaJava.setText("" + contador());
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(116, 133, 142, 23);
		panel.add(btnNewButton);
	}
	
	public int contador(){
		return this.cont++;
	}
	
}
