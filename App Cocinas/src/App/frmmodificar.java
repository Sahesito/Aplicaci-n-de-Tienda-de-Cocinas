package App;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class frmmodificar extends JInternalFrame {
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;
	private JComboBox cboModelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmmodificar frame = new frmmodificar();
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
	public frmmodificar() {
		setClosable(true);
		setMaximizable(true);
		setTitle("Modificar Cocina");
		setBounds(100, 100, 450, 210);
		getContentPane().setLayout(null);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnCerrar){
					actionPerformedBtnCerrar(e);
				}
				
			}
			protected void actionPerformedBtnCerrar(ActionEvent e){
				frmmodificar.this.dispose();
			}	
			
		});
		btnCerrar.setBounds(309, 11, 102, 23);
		getContentPane().add(btnCerrar);
		
		cboModelo = new JComboBox();
		cboModelo = new JComboBox();
		cboModelo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionPerformedJComboBoxModelo(e);
            } 
         });    
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
		cboModelo.setBounds(93, 12, 137, 20);
		getContentPane().add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(93, 37, 137, 20);
		getContentPane().add(txtPrecio);
		
		txtAncho = new JTextField();
		txtAncho.setColumns(10);
		txtAncho.setBounds(93, 62, 137, 20);
		getContentPane().add(txtAncho);
		
		txtAlto = new JTextField();
		txtAlto.setColumns(10);
		txtAlto.setBounds(93, 87, 137, 20);
		getContentPane().add(txtAlto);
		
		txtFondo = new JTextField();
		txtFondo.setColumns(10);
		txtFondo.setBounds(93, 112, 137, 20);
		getContentPane().add(txtFondo);
		
		txtQuemadores = new JTextField();
		txtQuemadores.setColumns(10);
		txtQuemadores.setBounds(93, 137, 137, 20);
		getContentPane().add(txtQuemadores);
		
		JLabel label = new JLabel("Quemadores");
		label.setBounds(10, 140, 87, 14);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Fondo (cm)");
		label_1.setBounds(10, 115, 87, 14);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Alto (cm)");
		label_2.setBounds(10, 90, 87, 14);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Ancho (cm)");
		label_3.setBounds(10, 65, 87, 14);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Precio (S/)");
		label_4.setBounds(10, 40, 87, 14);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Modelo");
		label_5.setBounds(10, 15, 87, 14);
		getContentPane().add(label_5);
		
		JButton btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnGrabar){
					actionPerformedBtnGrabar(e);
				}
				
			}
			
		});
		btnGrabar.setBounds(309, 45, 102, 23);
		getContentPane().add(btnGrabar);
		//Codigo para que aparezcan los textos apenas inicie el programa
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
	//Para editar los modelos
	protected void actionPerformedBtnGrabar(ActionEvent e){
	    int selectedIndex = cboModelo.getSelectedIndex();

	    switch (selectedIndex){
	        case 0:
	            frmprincipal.precio0=Double.parseDouble(txtPrecio.getText());
	            frmprincipal.ancho0=Double.parseDouble(txtAncho.getText());
	            frmprincipal.alto0=Double.parseDouble(txtAlto.getText());
	            frmprincipal.fondo0=Double.parseDouble(txtFondo.getText());
	            frmprincipal.quemadores0=Integer.parseInt(txtQuemadores.getText());
	            break;
	        case 1:
	            frmprincipal.precio1=Double.parseDouble(txtPrecio.getText());
	            frmprincipal.ancho1=Double.parseDouble(txtAncho.getText());
	            frmprincipal.alto1=Double.parseDouble(txtAlto.getText());
	            frmprincipal.fondo1=Double.parseDouble(txtFondo.getText());
	            frmprincipal.quemadores1=Integer.parseInt(txtQuemadores.getText());
	            break;
	        case 2:
	            frmprincipal.precio2=Double.parseDouble(txtPrecio.getText());
	            frmprincipal.ancho2=Double.parseDouble(txtAncho.getText());
	            frmprincipal.alto2=Double.parseDouble(txtAlto.getText());
	            frmprincipal.fondo2=Double.parseDouble(txtFondo.getText());
	            frmprincipal.quemadores2=Integer.parseInt(txtQuemadores.getText());
	            break;
	        case 3:
	            frmprincipal.precio3=Double.parseDouble(txtPrecio.getText());
	            frmprincipal.ancho3=Double.parseDouble(txtAncho.getText());
	            frmprincipal.alto3=Double.parseDouble(txtAlto.getText());
	            frmprincipal.fondo3=Double.parseDouble(txtFondo.getText());
	            frmprincipal.quemadores3=Integer.parseInt(txtQuemadores.getText());
	            break;
	        case 4:
	            frmprincipal.precio4=Double.parseDouble(txtPrecio.getText());
	            frmprincipal.ancho4=Double.parseDouble(txtAncho.getText());
	            frmprincipal.alto4=Double.parseDouble(txtAlto.getText());
	            frmprincipal.fondo4=Double.parseDouble(txtFondo.getText());
	            frmprincipal.quemadores4=Integer.parseInt(txtQuemadores.getText());
	            break;
	    }
		//Mensaje
		JOptionPane.showMessageDialog(null, "Valores Actualizados");
	}
}
		

