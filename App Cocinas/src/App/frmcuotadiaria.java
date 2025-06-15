package App;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmcuotadiaria extends JInternalFrame implements ActionListener {
	private JLabel lblNewLabel;
	private JTextField txtcuota;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmcuotadiaria frame = new frmcuotadiaria();
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
	public frmcuotadiaria() {
		setTitle("Configurar cuota diaria");
		setClosable(true);
		setMaximizable(true);
		setBounds(100, 100, 450, 103);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Cuota diaria esperada (S/.)");
		lblNewLabel.setBounds(10, 11, 146, 14);
		getContentPane().add(lblNewLabel);
		
		txtcuota = new JTextField();
		txtcuota.setBounds(194, 8, 86, 20);
		txtcuota.setText(String.valueOf(frmprincipal.cuotaDiaria));
		getContentPane().add(txtcuota);
		txtcuota.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(319, 7, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(319, 41, 89, 23);
		getContentPane().add(btnCancelar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		frmprincipal.cuotaDiaria=Double.parseDouble(txtcuota.getText());
		//Mensaje que sale despues de editar la cuota diaria
		JOptionPane.showMessageDialog(null, "Cuota Diaria actualizada");
	}
	//Cerrar programa
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		frmcuotadiaria.this.dispose();
	}
}
