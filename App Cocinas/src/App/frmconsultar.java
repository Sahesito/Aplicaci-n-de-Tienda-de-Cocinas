package App;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class frmconsultar extends JInternalFrame {
	private JComboBox cboModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmconsultar frame = new frmconsultar();
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
	public frmconsultar() {
		setTitle("Consultar cocina");
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 232);
		getContentPane().setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 33, 87, 14);
		getContentPane().add(lblModelo);
		
		JLabel lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 58, 87, 14);
		getContentPane().add(lblPrecio);
		
		JLabel lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 83, 87, 14);
		getContentPane().add(lblAncho);
		
		JLabel lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(10, 108, 87, 14);
		getContentPane().add(lblAlto);
		
		JLabel lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setBounds(10, 133, 87, 14);
		getContentPane().add(lblFondo);
		
		JLabel lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setBounds(10, 158, 87, 14);
		getContentPane().add(lblQuemadores);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionPerformedJComboBoxModelo(e);
				} 
		});
		//En esta sección vamos a agregar los modelos que estan en frmprincipal
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
		cboModelo.setBounds(93, 30, 137, 20);
		getContentPane().add(cboModelo);
		
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(93, 55, 137, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setColumns(10);
		txtAncho.setBounds(93, 80, 137, 20);
		getContentPane().add(txtAncho);
		
		txtAlto = new JTextField();
		txtAlto.setEditable(false);
		txtAlto.setColumns(10);
		txtAlto.setBounds(93, 105, 137, 20);
		getContentPane().add(txtAlto);
		
		txtFondo = new JTextField();
		txtFondo.setEditable(false);
		txtFondo.setColumns(10);
		txtFondo.setBounds(93, 130, 137, 20);
		getContentPane().add(txtFondo);
		
		txtQuemadores = new JTextField();
		txtQuemadores.setEditable(false);
		txtQuemadores.setColumns(10);
		txtQuemadores.setBounds(93, 155, 137, 20);
		getContentPane().add(txtQuemadores);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnCerrar){
					actionPerformedBtnCerrar(e);
				}
			}
			protected void actionPerformedBtnCerrar(ActionEvent e){
				frmconsultar.this.dispose();
			}
		});
		btnCerrar.setBounds(309, 29, 102, 23);
		getContentPane().add(btnCerrar);
		
		//Para que al abrir se muestre la información de la primera cocina
		actionPerformedJComboBoxModelo(null);
	}
	
	protected void actionPerformedJComboBoxModelo(ActionEvent e){
		int selectedIndex = cboModelo.getSelectedIndex();
		 
		switch (cboModelo.getSelectedIndex()){
		case 0:
			txtPrecio.setText(String.valueOf(frmprincipal.precio0));
			txtAncho.setText(String.valueOf(frmprincipal.ancho0));
			txtAlto.setText(String.valueOf(frmprincipal.alto0));
			txtFondo.setText(String.valueOf(frmprincipal.fondo0));
			txtQuemadores.setText(String.valueOf(frmprincipal.quemadores0)); break;
		case 1:
			txtPrecio.setText(String.valueOf(frmprincipal.precio1));
			txtAncho.setText(String.valueOf(frmprincipal.ancho1));
			txtAlto.setText(String.valueOf(frmprincipal.alto1));
			txtFondo.setText(String.valueOf(frmprincipal.fondo1));
			txtQuemadores.setText(String.valueOf(frmprincipal.quemadores1)); break;
		case 2:
			txtPrecio.setText(String.valueOf(frmprincipal.precio2));
			txtAncho.setText(String.valueOf(frmprincipal.ancho2));
			txtAlto.setText(String.valueOf(frmprincipal.alto2));
			txtFondo.setText(String.valueOf(frmprincipal.fondo2));
			txtQuemadores.setText(String.valueOf(frmprincipal.quemadores2)); break;
		case 3:
			txtPrecio.setText(String.valueOf(frmprincipal.precio3));
			txtAncho.setText(String.valueOf(frmprincipal.ancho3));
			txtAlto.setText(String.valueOf(frmprincipal.alto3));
			txtFondo.setText(String.valueOf(frmprincipal.fondo3));
			txtQuemadores.setText(String.valueOf(frmprincipal.quemadores3)); break;
		default:
			txtPrecio.setText(String.valueOf(frmprincipal.precio4));
			txtAncho.setText(String.valueOf(frmprincipal.ancho4));
			txtAlto.setText(String.valueOf(frmprincipal.alto4));
			txtFondo.setText(String.valueOf(frmprincipal.fondo4));
			txtQuemadores.setText(String.valueOf(frmprincipal.quemadores4)); break;
		}
		}
}
