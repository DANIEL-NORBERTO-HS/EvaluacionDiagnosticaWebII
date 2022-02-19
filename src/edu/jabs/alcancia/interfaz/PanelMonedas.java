/*
Autor: Daniel Norberto Hernández Santiago
Num. ctrl:18390015
Materia: Desarrollo	Web	II
Semetre: 8vo
 */

package edu.jabs.alcancia.interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

/**
 * Panel donde se selecciona la denominación de una moneda para agregarla a la alcancía.
 */
public class PanelMonedas extends JPanel implements ActionListener, ItemListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Constante para agregar una moneda a la alcancía.
     */
    private static final String AGREGAR = "agregar";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Ventana principal de la aplicación.
     */
    private InterfazAlcancia principal;

    // -----------------------------------------------------------------
    // Atributos de la Interfaz
    // -----------------------------------------------------------------

    /**
     * Opción para seleccionar monedas de $1.
     */
    private JRadioButton radio1;

    /**
     * Opción para seleccionar monedas de $2.
     */
    private JRadioButton radio2;

    /**
     * Opción para seleccionar monedas de $5.
     */
    private JRadioButton radio5;

    /**
     * Opción para seleccionar monedas de $10.
     */
    private JRadioButton radio10;

    /**
     * Grupo de botones que asegura que solamente se selecciona una moneda a la vez.
     */
    private ButtonGroup grupoBotones;

    /**
     * Botón para agregar una moneda a la alcancía.
     */
    private JButton btnAgregar;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo panel. <br>
     * <b>post: </b>Se construyó el panel y se inicializaron sus componentes.
     * @param pPrincipal Referencia a la clase principal de la interfaz. pPrincipal != null.
     */
    public PanelMonedas( InterfazAlcancia pPrincipal )
    {
        principal = pPrincipal;

        // Inicializa los componentes del panel
        grupoBotones = new ButtonGroup( );

        radio1 = new JRadioButton( "0", new ImageIcon( "./data/1.png" ) );
        grupoBotones.add( radio1 );
        radio1.setVerticalTextPosition( SwingConstants.BOTTOM );
        radio1.setHorizontalTextPosition( SwingConstants.CENTER );
        radio1.addItemListener( this );
        radio1.setBorder( null );
        add( radio1 );

        radio2 = new JRadioButton( "0", new ImageIcon( "./data/2.png" ) );
        grupoBotones.add( radio2 );
        radio2.setVerticalTextPosition( SwingConstants.BOTTOM );
        radio2.setHorizontalTextPosition( SwingConstants.CENTER );
        radio2.addItemListener( this );
        radio2.setBorder( null );
        add( radio2 );

        radio5 = new JRadioButton( "0", new ImageIcon( "./data/5.png" ) );
        grupoBotones.add( radio5 );
        radio5.setVerticalTextPosition( SwingConstants.BOTTOM );
        radio5.setHorizontalTextPosition( SwingConstants.CENTER );
        radio5.addItemListener( this );
        radio5.setBorder( null );
        add( radio5 );

        radio10 = new JRadioButton( "0", new ImageIcon( "./data/10.png" ) );
        grupoBotones.add( radio10 );
        radio10.setVerticalTextPosition( SwingConstants.BOTTOM );
        radio10.setHorizontalTextPosition( SwingConstants.CENTER );
        radio10.addItemListener( this );
        radio10.setBorder( null );
        add( radio10 );


        radio1.setSelected( true );

        btnAgregar = new JButton( "Agregar moneda" );
        btnAgregar.setActionCommand( AGREGAR );
        btnAgregar.addActionListener( this );
        add( btnAgregar );

        setBorder( new TitledBorder( "Monedas" ) );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Cambia la cantidad de monedas que hay de una cierta cantidad.
     * @param pDenominacion Denominación de la moneda. pDenominacion>0.
     * @param pCantidad Cantidad de esas monedas que hay. pCantidad>0.
     */
    public void cambiarCantidad( int pDenominacion, int pCantidad )
    {
        if( pDenominacion == 1 )
        {
            radio1.setText( "" + pCantidad );
        }
        else if( pDenominacion == 2 )
        {
            radio2.setText( "" + pCantidad );
        }
        else if( pDenominacion == 5 )
        {
            radio5.setText( "" + pCantidad );
        }
        else if( pDenominacion == 10 )
        {
            radio10.setText( "" + pCantidad );
        }
    }

    /**
     * Ejecuta la acción según el botón sobre el que se haya hecho click.
     * @param pEvento Evento de click sobre un botón. pEvento != null.
     */
    public void actionPerformed( ActionEvent pEvento )
    {
        String comando = pEvento.getActionCommand( );

        if( AGREGAR.equals( comando ) )
        {
            int denominacion = 0;
            if(  radio1.isSelected( ) )
            {
                denominacion = 1;
            }
            else if( radio2.isSelected( ) )
            {
                denominacion = 2;
            }
            else if( radio5.isSelected( ) )
            {
                denominacion = 5;
            }
            else if( radio10.isSelected( ) )
            {
                denominacion = 10;
            }

            principal.agregarMoneda( denominacion );
        }
    }

    /**
     * Método se llama cuando se selecciona alguno de los botones que indican las denominaciones. <br>
     * El método se encarga de dibujar un borde alrededor de la denominación seleccionada.
     * @param pEvento Evento de la selección de una denominación. pEvento!=null.
     */
    public void itemStateChanged( ItemEvent pEvento )
    {
        JRadioButton boton = ( JRadioButton )pEvento.getItem( );

        if( pEvento.getStateChange( ) == ItemEvent.SELECTED )
        {
            boton.setBorder( new BevelBorder( BevelBorder.LOWERED, Color.BLACK, Color.GRAY, Color.LIGHT_GRAY, Color.GRAY ) );
            boton.setBorderPainted( true );
        }
        else
        {
            boton.setBorder( null );
        }
        validate( );
    }

}