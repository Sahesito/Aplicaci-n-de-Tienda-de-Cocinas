package App;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmcantidadoptima extends JInternalFrame implements ActionListener {
	private JLabel lbl1;
	private JTextField txtcantidad;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmcantidadoptima frame = new frmcantidadoptima();
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
	public frmcantidadoptima() {
		setTitle("Configurar cantidad \u00F3ptima");
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 98);
		getContentPane().setLayout(null);
		
		lbl1 = new JLabel("Cantidad \u00F3ptima de unidades vendidas");
		lbl1.setBounds(10, 11, 219, 14);
		getContentPane().add(lbl1);
		
		txtcantidad = new JTextField();
		txtcantidad.setText(String.valueOf(frmprincipal.cantidadOptima));
		txtcantidad.setBounds(244, 8, 44, 20);
		getContentPane().add(txtcantidad);
		txtcantidad.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(318, 7, 106, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(318, 35, 106, 23);
		getContentPane().add(btnCancelar);

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(arg0);
		}
		if (arg0.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(arg0);
		}
	}
	//Cerrar pestaña
	protected void actionPerformedBtnCancelar(ActionEvent arg0) {
		frmcantidadoptima.this.dispose();
	}
	
	protected void actionPerformedBtnAceptar(ActionEvent arg0) {
		//Cantidad optima
		frmprincipal.cantidadOptima=Integer.parseInt(txtcantidad.getText());
		//Mensaje que aparece despues de editar la cantidad optima
		JOptionPane.showMessageDialog(null, "Cantidad Optima Actualizada");
	}
}
