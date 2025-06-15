package App;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmobsequios extends JInternalFrame {
	private JTextField txtobsequio2;
	private JTextField txtobsequio3;
	private JTextField txtobsequio1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmobsequios frame = new frmobsequios();
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
	public frmobsequios() {
		setTitle("Configurar obsequios");
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 128);
		getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("1 unidad");
		lbl1.setBounds(10, 11, 91, 14);
		getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("2 a 5 unidades");
		lbl2.setBounds(10, 39, 91, 14);
		getContentPane().add(lbl2);
		
		JLabel lbl6 = new JLabel("6 a m\u00E1s unidades");
		lbl6.setBounds(10, 67, 91, 14);
		getContentPane().add(lbl6);
		
		txtobsequio2 = new JTextField();
		txtobsequio2.setText(frmprincipal.obsequio2);
		txtobsequio2.setBounds(111, 36, 80, 20);
		getContentPane().add(txtobsequio2);
		txtobsequio2.setColumns(10);
		
		txtobsequio3 = new JTextField();
		txtobsequio3.setText(frmprincipal.obsequio3);
		txtobsequio3.setColumns(10);
		txtobsequio3.setBounds(111, 64, 80, 20);
		getContentPane().add(txtobsequio3);
		
		txtobsequio1 = new JTextField();
		txtobsequio1.setText(frmprincipal.obsequio1);
		txtobsequio1.setColumns(10);
		txtobsequio1.setBounds(111, 8, 80, 20);
		getContentPane().add(txtobsequio1);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnAceptar){
					actionPerformedBtnAceptar(e);
				}
			}
		});
		btnAceptar.setBounds(282, 7, 107, 23);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnCancelar){
					actionPerformedBtnCerrar(e);
				}
			}
			//Cerrar pestaña
			protected void actionPerformedBtnCerrar(ActionEvent e){
				frmobsequios.this.dispose();
			}
		});
		btnCancelar.setBounds(282, 42, 107, 23);
		getContentPane().add(btnCancelar);
	}
	//Mostrar los valores de los obsequios(Variables globales)
	protected void actionPerformedBtnAceptar(ActionEvent e){
		frmprincipal.obsequio1=String.valueOf(txtobsequio1.getText());
		frmprincipal.obsequio2=String.valueOf(txtobsequio2.getText());
		frmprincipal.obsequio3=String.valueOf(txtobsequio3.getText());
		//Mensaje despues de editar los obsequios
		JOptionPane.showMessageDialog(null, "Obsequios Actualizados");
	}
}
