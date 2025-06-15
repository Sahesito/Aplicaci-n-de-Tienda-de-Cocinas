package App;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmprincipal extends JFrame implements ActionListener {

	//Administra los JInternalFrame que se van a ejecutar aquí
	private JDesktopPane escritorio;
	private JMenuItem mntmSalir;
	private JMenuItem mntmGenerar;
	private JMenuItem mntmCantidad;
	private JMenuItem mntmCuota;
	private JMenuItem mntmVender;
	// Datos mínimos de la primera cocina
	public static String modelo0 = "Mabe EMP6120PG0";
	public static double precio0 = 949.0;
	public static double fondo0 = 58.6;
	public static double ancho0 = 60.0;
	public static double alto0 = 91.0;
	public static int quemadores0 = 4;
	//Total de la primera cocina
	public static int cantidad0=0;
	public static double ImpPag0=0;
	public static double ImpDes0=0;
	public static double ImpCom0=0;
	public static double Aporte0=0;
	public static int i0=0;
	// Datos mínimos de la segunda cocina
	public static String modelo1 = "Indurama Parma";
	public static double precio1 = 1089.0;
	public static double ancho1 = 80.0;
	public static double alto1 = 94.0;
	public static double fondo1 = 67.5;
	public static int quemadores1 = 6;
	//Total de la segunda cocina
	public static int cantidad1=0;
	public static double ImpPag1=0;
	public static double ImpDes1=0;
	public static double ImpCom1=0;
	public static double Aporte1=0;
	public static int i1=0;
	// Datos mínimos de la tercera cocina
	public static String modelo2 = "Sole COSOL027";
	public static double precio2 = 850.0;
	public static double ancho2 = 60.0;
	public static double alto2 = 90.0;
	public static double fondo2 = 50.0;
	public static int quemadores2 = 4;
	//Total de la tercera cocina
	public static int cantidad2=0;
	public static double ImpPag2=0;
	public static double ImpDes2=0;
	public static double ImpCom2=0;
	public static double Aporte2=0;
	public static int i2=0;
	// Datos mínimos de la cuarta cocina
	public static String modelo3 = "Coldex CX602";
	public static double precio3 = 629.0;
	public static double ancho3 = 61.6;
	public static double alto3 = 95.0;
	public static double fondo3 = 51.5;
	public static int quemadores3 = 5;
	//Total de la cuarta cocina
	public static int cantidad3=0;
	public static double ImpPag3=0;
	public static double ImpDes3=0;
	public static double ImpCom3=0;
	public static double Aporte3=0;
	public static int i3=0;
	// Datos mínimos de la quinta cocina
	public static String modelo4 = "Reco Dakota";
	public static double precio4 = 849.0;
	public static double ancho4 = 75.4;
	public static double alto4 = 94.5;
	public static double fondo4 = 66.0;
	public static int quemadores4 = 5;
	//Total de la quinta cocina
	public static int cantidad4=0;
	public static double ImpPag4=0;
	public static double ImpDes4=0;
	public static double ImpCom4=0;
	public static double Aporte4=0;
	public static int i4=0;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequios
	public static String obsequio1 = "Cafetera";
	public static String obsequio2 = "Licuadora";
	public static String obsequio3 = "Extractor";
	// Cantidad óptima de unidades vendidas
	public static int cantidadOptima = 30;
	// Cuota diaria
	public static double cuotaDiaria = 75000;
	//Para el frmvender
	public static double Precio;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmprincipal frame = new frmprincipal();
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
	public frmprincipal() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedMntmSalir(arg0);
			}
		});
		mnArchivo.add(mntmSalir);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar cocina");
		mntmConsultar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        actionPerformedMntmConsulta(e);
				
			}
		});
		mnMantenimiento.add(mntmConsultar);
		
		JMenuItem mntmModificar = new JMenuItem("Modificar cocina");
		mntmModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmModificar(e);
			}
		});
		mnMantenimiento.add(mntmModificar);
		
		JMenuItem mntmListar = new JMenuItem("Listar cocinas");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        actionPerformedMntmListar(e);
			}
		});
		mnMantenimiento.add(mntmListar);
		
		JMenu mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerar = new JMenuItem("Generar reportes");
		mntmGenerar.addActionListener(this);
		mnVentas.add(mntmGenerar);
		
		JMenu mnConfiguracion = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracion);
		
		JMenuItem mntmDescuentos = new JMenuItem("Configurar descuentos");
		mntmDescuentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmDescuentos(e);
			}
		});
		mnConfiguracion.add(mntmDescuentos);
		
		JMenuItem mntmObsequios = new JMenuItem("Configurar obsequios");
		mntmObsequios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmObsequios(e);
			}
		});
		mnConfiguracion.add(mntmObsequios);
		
		mntmCantidad = new JMenuItem("Configurar cantidad \u00F3ptima");
		mntmCantidad.addActionListener(this);
		mnConfiguracion.add(mntmCantidad);
		
		mntmCuota = new JMenuItem("Configurar cuota diaria");
		mntmCuota.addActionListener(this);
		mnConfiguracion.add(mntmCuota);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmTienda = new JMenuItem("Acerca de Tienda");
		mntmTienda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmTienda(e);
			}
		});
		mnAyuda.add(mntmTienda);
		//Configurar escritorio
		escritorio=new JDesktopPane();
		this.setContentPane(escritorio);	
	}
	public void ActionPerformed(ActionEvent e) {
		if(e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent e) {
		//Sentencia para salir del JFrame
		this.dispose();
	}
	protected void actionPerformedMntmTienda(ActionEvent e){
		//Para abrir y ver el JInternalFrame
		//1.instanciar el internal frmtienda con el nombre de f
		//2.f se agrega al escritorio (JDesktopPane creado en frame)
		//3.visualizar a f
		frmtienda f=new frmtienda();
		escritorio.add(f);
		f.setVisible(true);
	}
	protected void actionPerformedMntmConsulta(ActionEvent e){
	    frmconsultar f=new frmconsultar();
	    escritorio.add(f);
	    f.setVisible(true);    
	}
	protected void actionPerformedMntmListar(ActionEvent e){
		frmlistar f=new frmlistar();
		escritorio.add(f);
		f.setVisible(true);
	}
	protected void actionPerformedMntmDescuentos(ActionEvent e){
		frmdescuentos f=new frmdescuentos();
		escritorio.add(f);
		f.setVisible(true);
	}
	protected void actionPerformedMntmModificar(ActionEvent e){
		frmmodificar f=new frmmodificar();
		escritorio.add(f);
		f.setVisible(true);
	}
	protected void actionPerformedMntmObsequios(ActionEvent e){
		frmobsequios f=new frmobsequios();
		escritorio.add(f);
		f.setVisible(true);
	}	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmGenerar) {
			actionPerformedMntmGenerar(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmCuota) {
			actionPerformedMntmCuota(e);
		}
		if (e.getSource() == mntmCantidad) {
			actionPerformedMntmCantidad(e);
		}
	}
	protected void actionPerformedMntmCantidad(ActionEvent e) {
		frmcantidadoptima f=new frmcantidadoptima();
		escritorio.add(f);
		f.setVisible(true);
	}
	protected void actionPerformedMntmCuota(ActionEvent e) {
		frmcuotadiaria f=new frmcuotadiaria();
		escritorio.add(f);
		f.setVisible(true);
	}
	protected void actionPerformedMntmVender(ActionEvent e) {
		frmvender f=new frmvender();
		escritorio.add(f);
		f.setVisible(true);
	}
	
	protected void actionPerformedMntmGenerar(ActionEvent e) {
		frmreportes f=new frmreportes();
		escritorio.add(f);
		f.setVisible(true);
	}
}


	
