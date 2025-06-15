package App;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmdescuentos extends JInternalFrame {
	private JTextField txtporcentaje1;
	private JTextField txtporcentaje2;
	private JTextField txtporcentaje3;
	private JTextField txtporcentaje4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmdescuentos frame = new frmdescuentos();
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
	public frmdescuentos() {
		setTitle("Configurar procentajes de descuento");
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 146);
		getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("1 a 5 unidades");
		lbl1.setBounds(10, 11, 125, 14);
		getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("6 a 10 unidades");
		lbl2.setBounds(10, 38, 125, 14);
		getContentPane().add(lbl2);
		
		JLabel lbl3 = new JLabel("11 a 15 unidades");
		lbl3.setBounds(10, 63, 125, 14);
		getContentPane().add(lbl3);
		
		JLabel lbl4 = new JLabel("M\u00E1s de 15 unidades");
		lbl4.setBounds(10, 88, 125, 14);
		getContentPane().add(lbl4);
		
		txtporcentaje1 = new JTextField();
		txtporcentaje1.setText(String.valueOf(frmprincipal.porcentaje1));
		txtporcentaje1.setBounds(145, 8, 86, 20);
		getContentPane().add(txtporcentaje1);
		
		txtporcentaje2 = new JTextField();
		txtporcentaje2.setText(String.valueOf(frmprincipal.porcentaje2));
		txtporcentaje2.setBounds(145, 35, 86, 20);
		getContentPane().add(txtporcentaje2);
		
		txtporcentaje3 = new JTextField();
		txtporcentaje3.setText(String.valueOf(frmprincipal.porcentaje3));
		txtporcentaje3.setBounds(145, 60, 86, 20);
		getContentPane().add(txtporcentaje3);
		
		txtporcentaje4 = new JTextField();
		txtporcentaje4.setText(String.valueOf(frmprincipal.porcentaje4));
		txtporcentaje4.setBounds(145, 85, 86, 20);
		getContentPane().add(txtporcentaje4);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnCancelar){
					actionPerformedBtnCerrar(e);
				}
			}
		});
		
		btnCancelar.setBounds(302, 34, 99, 23);
		getContentPane().add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnAceptar){
					actionPerformedBtnAceptar(e);
				}
			}
		});
		btnAceptar.setBounds(302, 7, 99, 23);
		getContentPane().add(btnAceptar);
		
		JLabel lblNewLabel = new JLabel("%");
		lblNewLabel.setBounds(241, 11, 11, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("%");
		label.setBounds(241, 38, 11, 14);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("%");
		label_1.setBounds(241, 63, 11, 14);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("%");
		label_2.setBounds(241, 88, 11, 14);
		getContentPane().add(label_2);

	}
	protected void actionPerformedBtnAceptar(ActionEvent e){
		//Modificar los datos de cada porcentaje, variables globales
		frmprincipal.porcentaje1=Double.parseDouble(txtporcentaje1.getText());
		frmprincipal.porcentaje2=Double.parseDouble(txtporcentaje2.getText());
		frmprincipal.porcentaje3=Double.parseDouble(txtporcentaje3.getText());
		frmprincipal.porcentaje4=Double.parseDouble(txtporcentaje4.getText());
		
		//Mensaje
		JOptionPane.showMessageDialog(null, "Porcentajes Actualizados");
	}
	//Cerrar programa
	protected void actionPerformedBtnCerrar(ActionEvent e){
		frmdescuentos.this.dispose();
	}
}
