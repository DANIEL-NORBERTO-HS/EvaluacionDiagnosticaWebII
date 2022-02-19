/*
Autor: Daniel Norberto Hernández Santiago
Num. ctrl:18390015
Materia: Desarrollo	Web	II
Semetre: 8vo
 */

package edu.jabs.alcancia.interfaz;

import java.awt.BorderLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Panel en el que se encuentran los botones para romper la alcancía y crear una nueva.
 */
public class PanelBotones extends JPanel implements ActionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Constante para romper la alcancía.
     */
    private static final String ROMPER = "romper";

    /**
     * Constante para crear una nueva alcancía.
     */
    private static final String NUEVA = "nueva";

    

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
     * Botón usado para romper la alcancía.
     */
    private JButton btnRomper;

    /**
     * Botón usado para crear una nueva alcancía.
     */
    private JButton btnNueva;

   

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo panel .<br>
     * <b>post: </b>Se construyó el panel y se inicializaron sus componentes.
     * @param pPrincipal Referencia a la clase principal de la interfaz. pPrincipal != null
     */
    public PanelBotones( InterfazAlcancia pPrincipal )
    {
        principal = pPrincipal;

        setLayout( new BorderLayout( ) );

        // Inicializa los componentes del panel
        JPanel panelInternoRomper = new JPanel( );
        btnRomper = new JButton( new ImageIcon( "./data/martillo.png" ) );
        btnRomper.setActionCommand( ROMPER );
        btnRomper.setMargin( new Insets( 1, 1, 1, 1 ) );
        btnRomper.addActionListener( this );
        btnRomper.setOpaque( false );
        btnRomper.setContentAreaFilled( false );

        panelInternoRomper.add( btnRomper );
        panelInternoRomper.setBorder( new TitledBorder( "Romper alcancía" ) );
        add( panelInternoRomper, BorderLayout.CENTER );

        JPanel panelInternoBotones = new JPanel( );

        btnNueva = new JButton( "Nueva alcancía" );
        btnNueva.setActionCommand( NUEVA );
        btnNueva.addActionListener( this );
        panelInternoBotones.add( btnNueva );

    

        add( panelInternoBotones, BorderLayout.SOUTH );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Ejecuta la acción según el botón sobre el que se haya hecho click.
     * @param pEvento Evento de click sobre un botón. pEvento != null.
     */
    public void actionPerformed( ActionEvent pEvento )
    {
        String comando = pEvento.getActionCommand( );

        if( NUEVA.equals( comando ) )
        {
            principal.nuevaAlcancia( );
        }
        else if( ROMPER.equals( comando ) )
        {
            principal.romperAlcancia( );
        }

    }

}

