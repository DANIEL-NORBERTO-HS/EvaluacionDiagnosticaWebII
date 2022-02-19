/*
Author: Daniel Norberto Hernández Santiago
Num. ctrl:18390015
Materia: Desarrollo	Web	II
Semetre: 8vo
Evaluacion Diagnostica
 */
package edu.jabs.alcancia.interfaz;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

import edu.jabs.alcancia.mundo.Alcancia;

/**
 * Clase principal de la interfaz.
 */
public class InterfazAlcancia extends JFrame
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Clase principal del mundo.
     */
    private Alcancia alcancia;

    // -----------------------------------------------------------------
    // Atributos de la Interfaz
    // -----------------------------------------------------------------

    /**
     * Panel con la imagen.
     */
    private PanelImagen panelImagen;

    /**
     * Panel donde se muestra el estado actual de la alcancía.
     */
    private PanelAlcancia panelAlcancia;

    /**
     * Panel con los botones de las acciones de la aplicación.
     */
    private PanelBotones panelBotones;

    /**
     * Panel donde se seleccionan y agregan las monedas.
     */
    private PanelMonedas panelMonedas;
   
    /**
     * Panel donde se seleccionan y agregan las monedas.
     */
    private PanelBilletes panelBilletes;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye la interfaz de la aplicación y la inicializa con una alcancía vacía. <br>
     * <b>post: </b> Se inicializó la ventana principal de la aplicación con sus páneles.
     */
    public InterfazAlcancia( )
    {
        setTitle( "Alcancía" );
        setSize( 1650,1080 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        alcancia = new Alcancia( );

        panelImagen = new PanelImagen( );
        getContentPane( ).add( panelImagen, BorderLayout.NORTH );

        JPanel panelCentral = new JPanel( );
        panelCentral.setLayout( new BorderLayout( ) );

        panelMonedas = new PanelMonedas( this );
        panelCentral.add( panelMonedas, BorderLayout.SOUTH );

        panelBilletes = new PanelBilletes( this );
        panelCentral.add( panelBilletes, BorderLayout.NORTH );

        panelAlcancia = new PanelAlcancia( );
        panelCentral.add( panelAlcancia, BorderLayout.CENTER );

        panelBotones = new PanelBotones( this );
        panelCentral.add( panelBotones, BorderLayout.EAST );

        getContentPane( ).add( panelCentral, BorderLayout.CENTER );

        setLocationRelativeTo( null );
        setResizable( false );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Agrega una moneda a la alcancía siempre y cuando no esté rota. <br>
     * <b>post: </b>Se agregó la cantidad indicada a la alcancía o se presentó un mensaje de error si estaba rota.
     * @param pDenominacion Denominación de la moneda que se va a agregar a la alcancía. pDenominacion >0.
     */
    public void agregarMoneda( int pDenominacion )
    {
        if( alcancia.darEstado( ) == 0 )
        {
            if( pDenominacion == 1 )
            {
                alcancia.agregarMoneda1( );
                panelMonedas.cambiarCantidad( 1, alcancia.darNumeroMonedas1( ) );
            }
            else if( pDenominacion == 2 )
            {
                alcancia.agregarMoneda2( );
                panelMonedas.cambiarCantidad( 2, alcancia.darNumeroMonedas2( ) );
            }
            else if( pDenominacion == 5 )
            {
                alcancia.agregarMoneda5( );
                panelMonedas.cambiarCantidad( 5, alcancia.darNumeroMonedas5( ) );
            }
            else if( pDenominacion == 10 )
            {
                alcancia.agregarMoneda10( );
                panelMonedas.cambiarCantidad( 10, alcancia.darNumeroMonedas10( ) );
            }

            panelAlcancia.cambiarMensaje( "Se agregaron $" + pDenominacion + " a la alcancía.\nEn la alcancía hay $" + alcancia.calcularTotalDinero( ) + " pesos." );
        }
        else
        {
            JOptionPane.showMessageDialog( this, "No se pueden agregar monedas a una alcancía rota.", "Agregar moneda", JOptionPane.ERROR_MESSAGE );
        }
    }

    /**
     * Agrega un billete a la alcancía siempre y cuando no esté rota. <br>
     * <b>post: </b>Se agregó la cantidad indicada a la alcancía o se presentó un mensaje de error si estaba rota.
     * @param pDenominacion Denominación de la moneda que se va a agregar a la alcancía. pDenominacion >0.
     */
    public void agregarBillete( int pDenominacion )
    {
        if( alcancia.darEstado( ) == 0 )
        {
            if( pDenominacion == 20 )
            {
                alcancia.agregarBillete20( );
                panelBilletes.cambiarCantidad( 20, alcancia.darNumeroBilletes20( ) );
            }
            else if( pDenominacion == 50 )
            {
                alcancia.agregarBillete50();
                panelBilletes.cambiarCantidad( 50, alcancia.darNumeroBilletes50( ) );
            }
            else if( pDenominacion == 100 )
            {
                alcancia.agregarBillete100();
                panelBilletes.cambiarCantidad( 100, alcancia.darNumeroBilletes100( ) );
            }
            else if( pDenominacion == 200 )
            {
                alcancia.agregarBillete200();
                panelBilletes.cambiarCantidad( 200, alcancia.darNumeroBilletes200( ) );
            }
            else if( pDenominacion == 500 )
            {
                alcancia.agregarBillete500();
                panelBilletes.cambiarCantidad( 500, alcancia.darNumeroBilletes500( ) );
            }
            else if( pDenominacion == 1000 )
            {
                alcancia.agregarBillete1000();
                panelBilletes.cambiarCantidad( 1000, alcancia.darNumeroBilletes1000( ) );
            }
            panelAlcancia.cambiarMensaje( "Se agregaron $" + pDenominacion + " a la alcancía.\nEn la alcancía hay $" + alcancia.calcularTotalDinero( ) + " pesos." );
        }
        else
        {
            JOptionPane.showMessageDialog( this, "No se pueden agregar billetes a una alcancía rota.", "Agregar billete", JOptionPane.ERROR_MESSAGE );
        }
    }

    /**
     * Crea una nueva alcancía. <br>
     * <b>post: </b> Se creó una alcancia nueva.
     */
    public void nuevaAlcancia( )
    {
        alcancia = new Alcancia( );

        panelAlcancia.cambiarImagenAlcancia( false );
        panelAlcancia.cambiarMensaje( "La alcancía está vacía." );

        panelMonedas.cambiarCantidad( 1, alcancia.darNumeroMonedas1( ) );
        panelMonedas.cambiarCantidad( 2, alcancia.darNumeroMonedas2( ) );
        panelMonedas.cambiarCantidad( 5, alcancia.darNumeroMonedas5( ) );
        panelMonedas.cambiarCantidad( 10, alcancia.darNumeroMonedas10( ) );

        panelBilletes.cambiarCantidad( 20, alcancia.darNumeroBilletes20( ) );
        panelBilletes.cambiarCantidad( 50, alcancia.darNumeroBilletes50( ) );
        panelBilletes.cambiarCantidad( 100, alcancia.darNumeroBilletes100( ) );
        panelBilletes.cambiarCantidad( 200, alcancia.darNumeroBilletes200( ) );
        panelBilletes.cambiarCantidad( 500, alcancia.darNumeroBilletes500( ) );
        panelBilletes.cambiarCantidad( 1000, alcancia.darNumeroBilletes1000( ) );
       
    }

    /**
     * Rompe la alcancía y actualiza la información mostrada. <br>
     * <b>post: </b>La alcancía está rota.
     */
    public void romperAlcancia( )
    {
        String mensaje = alcancia.darEstadoAlcancia( );
        alcancia.romperAlcancia( );

        panelAlcancia.cambiarImagenAlcancia( true );
        panelAlcancia.cambiarMensaje( "La alcancía está rota." );
        JOptionPane.showMessageDialog( this, mensaje, "Romper alcancía", JOptionPane.INFORMATION_MESSAGE );
    }

    

    // -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    /**
     * Ejecuta la aplicación.
     * @param pArgs Parámetros de la ejecución. No son necesarios.
     */
    public static void main( String[] pArgs )
    {
        try
        {
            // Unifica la interfaz para Mac y para Windows.
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );

            InterfazAlcancia ia = new InterfazAlcancia( );
            ia.setVisible( true );
        }
        catch( Exception e )
        {
            e.printStackTrace( );
        }
    }
}
