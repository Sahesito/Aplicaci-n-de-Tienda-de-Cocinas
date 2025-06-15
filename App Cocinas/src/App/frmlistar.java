package App;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class frmlistar extends JInternalFrame {
	private JTextArea txtSalida;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmlistar frame = new frmlistar();
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
	public frmlistar() {
		setTitle("Listado de cocinas");
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 11, 414, 204);
		getContentPane().add(scrollPane);
		
		txtSalida = new JTextArea();
		txtSalida.setFont(new Font("Courier New", Font.PLAIN, 12));
		txtSalida.setEditable(false);
		scrollPane.setViewportView(txtSalida);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnCerrar){
					actionPerformedBtnCerrar(e);
				}
			}
			//Cerrar pestaña
			protected void actionPerformedBtnCerrar(ActionEvent e){
				frmlistar.this.dispose();
			}
		});
		btnCerrar.setBounds(99, 226, 107, 23);
		getContentPane().add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			
			//Listado de cocinas
			public void actionPerformed(ActionEvent e) {
				txtSalida.setText("");
				txtSalida.append("LISTADO DE COCINAS"+"\n");
				txtSalida.append("                                              "+"\n");
				txtSalida.append("Modelo      : "+frmprincipal.modelo0+"\n");
				txtSalida.append("Precio      : "+frmprincipal.precio0+"\n");
				txtSalida.append("Profundidad : "+frmprincipal.fondo0+"\n");
				txtSalida.append("Ancho       : "+frmprincipal.ancho0+"\n");
				txtSalida.append("Alto        : "+frmprincipal.alto0+"\n");
				txtSalida.append("Quemadores  : "+frmprincipal.quemadores0+"\n");
				txtSalida.append("                                              "+"\n");
				txtSalida.append("Modelo      : "+frmprincipal.modelo1+"\n");
				txtSalida.append("Precio      : "+frmprincipal.precio1+"\n");
				txtSalida.append("Profundidad : "+frmprincipal.fondo1+"\n");
				txtSalida.append("Ancho       : "+frmprincipal.ancho1+"\n");
				txtSalida.append("Alto        : "+frmprincipal.alto1+"\n");
				txtSalida.append("Quemadores  : "+frmprincipal.quemadores1+"\n");
				txtSalida.append("                                              "+"\n");
				txtSalida.append("Modelo      : "+frmprincipal.modelo2+"\n");
				txtSalida.append("Precio      : "+frmprincipal.precio2+"\n");
				txtSalida.append("Profundidad : "+frmprincipal.fondo2+"\n");
				txtSalida.append("Ancho       : "+frmprincipal.ancho2+"\n");
				txtSalida.append("Alto        : "+frmprincipal.alto2+"\n");
				txtSalida.append("Quemadores  : "+frmprincipal.quemadores2+"\n");
				txtSalida.append("                                              "+"\n");
				txtSalida.append("Modelo      : "+frmprincipal.modelo3+"\n");
				txtSalida.append("Precio      : "+frmprincipal.precio3+"\n");
				txtSalida.append("Profundidad : "+frmprincipal.fondo3+"\n");
				txtSalida.append("Ancho       : "+frmprincipal.ancho3+"\n");
				txtSalida.append("Alto        : "+frmprincipal.alto3+"\n");
				txtSalida.append("Quemadores  : "+frmprincipal.quemadores3+"\n");
				txtSalida.append("                                              "+"\n");
				txtSalida.append("Modelo      : "+frmprincipal.modelo4+"\n");
				txtSalida.append("Precio      : "+frmprincipal.precio4+"\n");
				txtSalida.append("Profundidad : "+frmprincipal.fondo4+"\n");
				txtSalida.append("Ancho       : "+frmprincipal.ancho4+"\n");
				txtSalida.append("Alto        : "+frmprincipal.alto4+"\n");
				txtSalida.append("Quemadores  : "+frmprincipal.quemadores4+"\n");
			}
		});
		btnListar.setBounds(223, 226, 107, 23);
		getContentPane().add(btnListar);
	}
}
