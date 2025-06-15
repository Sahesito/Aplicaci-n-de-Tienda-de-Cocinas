package App;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmtienda extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmtienda frame = new frmtienda();
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
	public frmtienda() {
		setTitle("Acerca de Tienda");
		setClosable(true);
		setMaximizable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tienda 1.0");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(158, 37, 119, 32);
		getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 80, 414, 2);
		getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Autor:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(179, 93, 65, 14);
		getContentPane().add(lblNewLabel_1);
		
		
		JLabel lblErwinMarchani = new JLabel("Erwin Marchan");
		lblErwinMarchani.setBounds(169, 123, 188, 14);
		getContentPane().add(lblErwinMarchani);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnCerrar){
					actionPerformedBtnCerrar(e);
				}
			}
			protected void actionPerformedBtnCerrar(ActionEvent e){
				frmtienda.this.dispose();
			}
		});
		btnCerrar.setBounds(170, 236, 89, 23);
		getContentPane().add(btnCerrar);
		
		
	}
}
