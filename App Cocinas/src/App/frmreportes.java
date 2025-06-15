package App;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class frmreportes extends JInternalFrame implements ActionListener {
    private JLabel lblNewLabel;
    private JButton btnCerrar;
    private JScrollPane scrollPane;
    private JTextArea txtr;
    private JComboBox cboReportes;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmreportes frame = new frmreportes();
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
    public frmreportes() {
        setTitle("Generar Reportes");
        setMaximizable(true);
        setClosable(true);
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(null);
        
        lblNewLabel = new JLabel("Tipo de reporte");
        lblNewLabel.setBounds(10, 11, 86, 14);
        getContentPane().add(lblNewLabel);
        
        cboReportes = new JComboBox();
        cboReportes.addActionListener(this);
        cboReportes.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Ventas en relaci\u00F3n a la venta \u00F3ptima", "Precios en relaci\u00F3n al precio promedio", "Promedios, menores y mayores"}));
        cboReportes.setBounds(106, 8, 193, 20);
        getContentPane().add(cboReportes);
        
        btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(this);
        btnCerrar.setBounds(335, 7, 89, 23);
        getContentPane().add(btnCerrar);
        
        scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(10, 36, 414, 223);
        getContentPane().add(scrollPane);
        
        txtr = new JTextArea();
        txtr.setFont(new Font("Courier New", Font.PLAIN, 13));
        txtr.setEditable(false);
        scrollPane.setViewportView(txtr);
        
        // Llamar al método para mostrar el texto inicial
        actionPerformedJComboBoxReportes(null);
    }

    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == cboReportes) {
            actionPerformedJComboBoxReportes(arg0);
        }
        if (arg0.getSource() == btnCerrar) {
            actionPerformedBtnCerrar(arg0);
        }
    }

    // Cerrar pestaña
    protected void actionPerformedBtnCerrar(ActionEvent arg0) {
        frmreportes.this.dispose();
    }
  //Declaración de variables para las ventas en relacion a la venta optima
    int uv0, uv1, uv2, uv3, uv4;
	String ruv0, ruv1 , ruv2, ruv3, ruv4;
	String rpc0, rpc1, rpc2, rpc3, rpc4;
	
	protected void actionPerformedJComboBoxReportes(ActionEvent e){
		int selectedIndex = cboReportes.getSelectedIndex();

		//Imprimir los mensajes
		
		switch (cboReportes.getSelectedIndex()){
		
		case 0: txtr.setText("VENTAS POR MODELO" + "\n");
				txtr.append("Modelo                        : " + frmprincipal.modelo0 + "\n");
				txtr.append("Cantidad de ventas            : " + frmprincipal.i0 + "\n");
				txtr.append("Cantidad de unidades vendidas : " + frmprincipal.cantidad0 + "\n");
				txtr.append("Importe total vendido         : " + frmprincipal.ImpPag0 + "\n");
				txtr.append("Aporte a la cuota diaria      : " + frmprincipal.Aporte0+"%" + "\n");
				txtr.append("" + "\n");
				txtr.append("Modelo                        : " + frmprincipal.modelo1 + "\n");
				txtr.append("Cantidad de ventas            : " + frmprincipal.i1 +"\n");
				txtr.append("Cantidad de unidades vendidas : " + frmprincipal.cantidad1 +"\n");
				txtr.append("Importe total vendido         : " + frmprincipal.ImpPag1 + "\n");
				txtr.append("Aporte a la cuota diaria      : " + frmprincipal.Aporte1+"%" + "\n");
				txtr.append("" + "\n");
				txtr.append("Modelo                        : " + frmprincipal.modelo2 + "\n");
				txtr.append("Cantidad de ventas            : " + frmprincipal.i2 + "\n");
				txtr.append("Cantidad de unidades vendidas : " + frmprincipal.cantidad2 + "\n");
				txtr.append("Importe total vendido         : " + frmprincipal.ImpPag2 + "\n");
				txtr.append("Aporte a la cuota diaria      : " + frmprincipal.Aporte2+"%" + "\n");
				txtr.append("" + "\n");
				txtr.append("Modelo                        : " + frmprincipal.modelo3 + "\n");
				txtr.append("Cantidad de ventas            : " + frmprincipal.i3 +"\n");
				txtr.append("Cantidad de unidades vendidas : " + frmprincipal.cantidad3 + "\n");
				txtr.append("Importe total vendido         : " + frmprincipal.ImpPag3 + "\n");
				txtr.append("Aporte a la cuota diaria      : " + frmprincipal.Aporte3+"%" +"\n");
				txtr.append("" + "\n");
				txtr.append("Modelo                        : " + frmprincipal.modelo4 + "\n");
				txtr.append("Cantidad de ventas            : " + frmprincipal.i4 + "\n");
				txtr.append("Cantidad de unidades vendidas : " + frmprincipal.cantidad4 + "\n");
				txtr.append("Importe total vendido         : " + frmprincipal.ImpPag4 + "\n");
				txtr.append("Aporte a la cuota diaria      : " + frmprincipal.Aporte4+"%" + "\n");break;
		
		case 1: 
			// Unidades Vendidas
		    uv0 = frmprincipal.cantidadOptima - frmprincipal.cantidad0;
		    uv1 = frmprincipal.cantidadOptima - frmprincipal.cantidad1;
		    uv2 = frmprincipal.cantidadOptima - frmprincipal.cantidad2;
		    uv3 = frmprincipal.cantidadOptima - frmprincipal.cantidad3;
		    uv4 = frmprincipal.cantidadOptima - frmprincipal.cantidad4;

		    // Observación si son mayores, menores o iguales
		    // Primera cocina
		    if (uv0 > 0)
		        ruv0 = "Mayor al promedio";
		    else if (uv0 < 0)
		        ruv0 = "Menor al promedio";
		    else
		        ruv0 = "Igual al promedio";
		    
		    //Segunda cocina
		    if (uv1 > 0)
		        ruv1 = "Mayor al promedio";
		    else if (uv1 < 0)
		        ruv1 = "Menor al promedio";
		    else
		        ruv1 = "Igual al promedio";
		    
		    //Tercera cocina
		    if (uv2 > 0)
		        ruv2 = "Mayor al promedio";
		    else if (uv2 < 0)
		        ruv2 = "Menor al promedio";
		    else
		        ruv2 = "Igual al promedio";
		    
		    //Cuarta cocina
		    if (uv3 > 0)
		        ruv3 = "Mayor al promedio";
		    else if (uv3 < 0)
		        ruv3 = "Menor al promedio";
		    else
		        ruv3 = "Igual al promedio";
		    
		    //Quinta cocina
		    if (uv4 > 0)
		        ruv4 = "Mayor al promedio";
		    else if (uv4 < 0)
		        ruv4 = "Menor al promedio";
		    else
		        ruv4 = "Igual al promedio";

		    //Imprimir
				txtr.setText("VENTAS EN RELACIÓN A LA VENTA ÓPTIMA" + "\n");
				txtr.append("" + "\n");
				txtr.append("Modelo                         : " + frmprincipal.modelo0 + "\n" );
				txtr.append("Cantidad de unidades vendidas  : " + frmprincipal.cantidad0 + "(" + uv0 + " " + ruv0 + ")");
				txtr.append("" + "\n");
				txtr.append("Modelo                         : " + frmprincipal.modelo1 + "\n" );
				txtr.append("Cantidad de unidades vendidas  : " + frmprincipal.cantidad1 + "(" + uv1 + " " + ruv1 + ")");
				txtr.append("" + "\n");
				txtr.append("Modelo                         : " + frmprincipal.modelo2 + "\n" );
				txtr.append("Cantidad de unidades vendidas  : " + frmprincipal.cantidad2 + "(" + uv2 + " " +ruv2 + ")");
				txtr.append("" + "\n");
				txtr.append("Modelo                         : " + frmprincipal.modelo3 + "\n" );
				txtr.append("Cantidad de unidades vendidas  : " + frmprincipal.cantidad3 + "(" + uv3 + " " + ruv3 + ")");
				txtr.append("" + "\n");
				txtr.append("Modelo                         : " + frmprincipal.modelo4 + "\n" );
				txtr.append("Cantidad de unidades vendidas  : " + frmprincipal.cantidad4 + "(" + uv4 + " " + ruv4 + ")"); break;
		
		case 2: // Precios mayor, igual o menor al promedio
		    // Asignación de variables para cada cocina
		    if (frmprincipal.precio0 > 873)
		        rpc0 = "Mayor al promedio";
		    else if (frmprincipal.precio0 < 873)
		        rpc0 = "Menor al promedio";
		    else if (frmprincipal.precio0 == 873)
		        rpc0 = "Igual al promedio";
		    else
		        rpc0 = "";

		    if (frmprincipal.precio1 > 873)
		        rpc1 = "Mayor al promedio";
		    else if (frmprincipal.precio1 < 873)
		        rpc1 = "Menor al promedio";
		    else if (frmprincipal.precio1 == 873)
		        rpc1 = "Igual al promedio";
		    else
		        rpc1 = "";

		    if (frmprincipal.precio2 > 873)
		        rpc2 = "Mayor al promedio";
		    else if (frmprincipal.precio2 < 873)
		        rpc2 = "Menor al promedio";
		    else if (frmprincipal.precio2 == 873)
		        rpc2 = "Igual al promedio";
		    else
		        rpc2 = "";

		    if (frmprincipal.precio3 > 873)
		        rpc3 = "Mayor al promedio";
		    else if (frmprincipal.precio3 < 873)
		        rpc3 = "Menor al promedio";
		    else if (frmprincipal.precio3 == 873)
		        rpc3 = "Igual al promedio";
		    else
		        rpc3 = "";

		    if (frmprincipal.precio4 > 873)
		        rpc4 = "Mayor al promedio";
		    else if (frmprincipal.precio4 < 873)
		        rpc4 = "Menor al promedio";
		    else if (frmprincipal.precio4 == 873)
		        rpc4 = "Igual al promedio";
		    else
		        rpc4 = "";

		    // Mostrar los resultados en el JTextArea
		    txtr.setText("PRECIOS EN RELACIÓN AL PRECIO PROMEDIO" + "\n");
		    txtr.append("Modelo             :" + frmprincipal.modelo0 + "\n");
		    txtr.append("Precio             : S/." + frmprincipal.precio0 + "(" + rpc0 + ")" + "\n");
		    txtr.append("" + "\n");
		    txtr.append("Modelo             :" + frmprincipal.modelo1 + "\n");
		    txtr.append("Precio             : S/." + frmprincipal.precio1 + "(" + rpc1 + ")" + "\n");
		    txtr.append("" + "\n");
		    txtr.append("Modelo             :" + frmprincipal.modelo2 + "\n");
		    txtr.append("Precio             : S/." + frmprincipal.precio2 + "(" + rpc2 + ")" + "\n");
		    txtr.append("" + "\n");
		    txtr.append("Modelo             :" + frmprincipal.modelo3 + "\n");
		    txtr.append("Precio             : S/." + frmprincipal.precio3 + "(" + rpc3 + ")" + "\n");
		    txtr.append("" + "\n");
		    txtr.append("Modelo             :" + frmprincipal.modelo4 + "\n");
		    txtr.append("Precio             : S/." + frmprincipal.precio4 + "(" + rpc4 + ")");
		    break;
				
		case 3: txtr.setText("PROMEDIOS, MENORES Y MAYORES" + "");
				txtr.append("" + "\n");
				txtr.append("Precio promedio : S/. 873.2" + "\n");
				txtr.append("Precio menor    : S/. 629.0" + "\n");
				txtr.append("Precio mayor    : S/. 1089.0" + "\n");
				txtr.append("" + "\n");
				txtr.append("Ancho promedio  : 67.4 cm" + "\n");
				txtr.append("Ancho menor     : 60.0 cm" + "\n");
				txtr.append("Ancho mayor     : 80.0 cm" + "\n"); break;
		}
	}		
}		
//CORREGIR OBSERVACIONES
