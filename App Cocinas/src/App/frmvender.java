package App;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JScrollPane;

public class frmvender extends JInternalFrame implements ActionListener {
	
	private JLabel lblNewLabel;
	private JLabel lblPrecios;
	private JLabel lblCantidad;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnVender;
	private JButton btnCerrar;
	private JComboBox cboModelo;
	private JScrollPane scrollPane;
	private JTextArea txtr;
	private int totalVentas = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmvender frame = new frmvender();
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
	public frmvender() {
		
		
        
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(10, 11, 76, 14);
		getContentPane().add(lblNewLabel);
		
		lblPrecios = new JLabel("Precio (S/.)");
		lblPrecios.setBounds(10, 36, 76, 14);
		getContentPane().add(lblPrecios);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 61, 76, 14);
		getContentPane().add(lblCantidad);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionPerformedJComboBoxModelo(e);
            } 
         });   
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
		cboModelo.setBounds(96, 8, 115, 20);
		getContentPane().add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(96, 33, 115, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(96, 58, 115, 20);
		getContentPane().add(txtCantidad);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(319, 7, 89, 23);
		getContentPane().add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(319, 36, 89, 23);
		getContentPane().add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 87, 414, 172);
		getContentPane().add(scrollPane);
		
		txtr = new JTextArea();
		txtr.setEditable(false);
		txtr.setFont(new Font("Courier New", Font.PLAIN, 12));
		scrollPane.setViewportView(txtr);
		
		//Para que los textos aparezcan apenas se inicie el programa
		actionPerformedJComboBoxModelo(null);	
	}
		protected void actionPerformedJComboBoxModelo(ActionEvent e){
		int selectedIndex = cboModelo.getSelectedIndex();
		 
		switch (cboModelo.getSelectedIndex()){
		case 0:
			txtPrecio.setText(String.valueOf(frmprincipal.precio0));break;

		case 1:
			txtPrecio.setText(String.valueOf(frmprincipal.precio1));break;

		case 2:
			txtPrecio.setText(String.valueOf(frmprincipal.precio2));break;

		case 3:
			txtPrecio.setText(String.valueOf(frmprincipal.precio3));break;
	
		default:
			txtPrecio.setText(String.valueOf(frmprincipal.precio4));break;
			}	
		}	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
	}
		//Variables globales
			int c;
			double ip, id, ic, aporte;
			
		protected void actionPerformedBtnVender(ActionEvent e) {
		//Declaracion de variables	
		totalVentas++;
		String obsequio = "";
	    int selectedIndex = cboModelo.getSelectedIndex();
	    c = Integer.parseInt(txtCantidad.getText());
	     frmprincipal.Precio = Double.parseDouble(txtPrecio.getText());
		
	     //Contador para la cantidad de unidades vendidas que iran en frmreportes
	        switch (selectedIndex) {
	            case 0:
	                frmprincipal.cantidad0 += c; break;
	            case 1:
	                frmprincipal.cantidad1 += c; break;
	            case 2:
	                frmprincipal.cantidad2 += c; break;
	            case 3:
	                frmprincipal.cantidad3 += c; break;
	            default:
	                frmprincipal.cantidad4 += c; break;
	        }
	     
	        //Declarar descuento
		
	        if (c >= 1  && c <= 5)
	        id = frmprincipal.Precio * (frmprincipal.porcentaje1/100);
	        else if (c >= 6 && c <= 10)
	    	id = frmprincipal.Precio * (frmprincipal.porcentaje2/100);
	        else if (c >= 11 && c <= 15)
	    	id = frmprincipal.Precio * (frmprincipal.porcentaje3/100);
	        else
	    	id = frmprincipal.Precio * (frmprincipal.porcentaje4/100);
	        
	        //Formulas para vender y reportes
	        ic = frmprincipal.Precio * c;
	        ip = ic-id;
	        aporte = ip * 100 / frmprincipal.cuotaDiaria;
	       
	        // Variables globales para poder utilizar los resultados en frmreportes
	        switch (selectedIndex) {
	        case 0:
	        	frmprincipal.i0 ++;
	        	frmprincipal.ImpDes0 += id;
	            frmprincipal.ImpPag0 += ip;
	            frmprincipal.ImpCom0 += ic;
	            frmprincipal.Aporte0 += aporte; break;
	        case 1:
	        	frmprincipal.i1 ++;
	        	frmprincipal.ImpDes1 += id;
	            frmprincipal.ImpPag1 += ip;
	            frmprincipal.ImpCom1 += ic;
	            frmprincipal.Aporte1 += aporte; break;
	        case 2:
	        	frmprincipal.i2 ++;
	        	frmprincipal.ImpDes2 += id;
	            frmprincipal.ImpPag2 += ip;
	            frmprincipal.ImpCom2 += ic;
	            frmprincipal.Aporte2 += aporte; break;
	        case 3:
	        	frmprincipal.i3 ++;
	        	frmprincipal.ImpDes3 += id;
	            frmprincipal.ImpPag3 += ip;
	            frmprincipal.ImpCom3 += ic;
	            frmprincipal.Aporte3 += aporte; break;
	        default:
	        	frmprincipal.i4 ++;
	        	frmprincipal.ImpDes4 += id;
	            frmprincipal.ImpPag4 += ip;
	            frmprincipal.ImpCom4 += ic;
	            frmprincipal.Aporte4 += aporte; break;
	       }       
	        //Declarar obsequios
	        if (c == 1)
			obsequio = frmprincipal.obsequio1;
	        else if (c >= 2 && c <= 5 )
			obsequio = frmprincipal.obsequio2;
	        else
			obsequio = frmprincipal.obsequio3;
			
//Imprimir	
		txtr.setText("");
		txtr.append("BOLETA DE VENTA"+"\n");
		txtr.append(""+"\n");
		txtr.append("Modelo             : " + cboModelo.getSelectedItem() + "\n");
		txtr.append("Precio             : S/." + frmprincipal.Precio + "\n");
		txtr.append("Cantidad           : " + c + "\n");
		txtr.append("Importe de compra  : S/." + ic + "\n");
		txtr.append("Importe descuento  : S/." + id + "\n");
		txtr.append("Importe pagar      : S/." + ip + "\n");
		txtr.append("Obsequio           : " + obsequio);	
		
		
		if (totalVentas % 5 == 0) {
            // Calcular el importe total general acumulado.
            double itg = frmprincipal.ImpCom0+frmprincipal.ImpCom1+frmprincipal.ImpCom2+frmprincipal.ImpCom3+frmprincipal.ImpCom4;

            // Calcular qué porcentaje del total diario representa el importe total general acumulado hasta el momento.
            double pA = itg*100 / frmprincipal.cuotaDiaria;

            // Mostrar la ventana de mensaje con la información requerida.
            JOptionPane.showMessageDialog(this,
                    "Número de venta actual: " + totalVentas + "\n" +
                    "Importe total general acumulado: S/." + itg + "\n" +
                    "Porcentaje de la cuota diaria: " + pA + "%",
                    "Avance de ventas",
                    JOptionPane.INFORMATION_MESSAGE);
		}
		}
	 
	 //Cerrar pestaña
	 protected void actionPerformedBtnCerrar(ActionEvent e) {
		frmvender.this.dispose();
	}
	 

//SOLO FALTA EL ANUNCIO AYA	
	 //CORREGIR ELSE IF
	 
}