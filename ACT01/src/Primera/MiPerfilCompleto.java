package Primera;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class MiPerfilCompleto {

	private JFrame frmMiPerfil;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField textEdad;
	private JTextField textCorreo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiPerfilCompleto window = new MiPerfilCompleto();
					window.frmMiPerfil.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MiPerfilCompleto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String Nombre = "Jose manuel";
		String Apellidos = "Ponce Cuenca";
		String Edad = "22";
		String Correo = "Josema92@gmail.com";
				
		frmMiPerfil = new JFrame();
		frmMiPerfil.setTitle("Mi Perfil");
		frmMiPerfil.setBounds(100, 100, 288, 301);
		frmMiPerfil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMiPerfil.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 23, 46, 14);
		frmMiPerfil.getContentPane().add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 75, 46, 14);
		frmMiPerfil.getContentPane().add(lblApellidos);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 131, 46, 14);
		frmMiPerfil.getContentPane().add(lblEdad);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(10, 175, 46, 14);
		frmMiPerfil.getContentPane().add(lblCorreo);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setText(Nombre);
		txtNombre.setBounds(10, 44, 86, 20);
		frmMiPerfil.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setEditable(false);
		txtApellidos.setText(Apellidos);
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(10, 100, 86, 20);
		frmMiPerfil.getContentPane().add(txtApellidos);
		
		textEdad = new JTextField();
		textEdad.setEditable(false);
		textEdad.setText(Edad);
		textEdad.setColumns(10);
		textEdad.setBounds(10, 151, 86, 20);
		frmMiPerfil.getContentPane().add(textEdad);
		
		textCorreo = new JTextField();
		textCorreo.setEditable(false);
		textCorreo.setText(Correo);
		textCorreo.setColumns(10);
		textCorreo.setBounds(10, 200, 126, 20);
		frmMiPerfil.getContentPane().add(textCorreo);
		
	
	 
	}
}
