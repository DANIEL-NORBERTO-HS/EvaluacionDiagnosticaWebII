/*
Author: Daniel Norberto Hernández Santiago
Num. ctrl:18390015
Materia: Desarrollo	Web	II
Semetre: 8vo
 */

package edu.jabs.alcancia.interfaz;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel con la imagen del banner.
 */
public class PanelImagen extends JPanel
{
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel.<br>
     * <b>post: </b> Panel quedó inicializado.
     */
    public PanelImagen( )
    {
        JLabel imagen = new JLabel( );
        ImageIcon icono = new ImageIcon( "data/Encabezado.png" );
        imagen = new JLabel( "" );
        imagen.setIcon( icono );
        add( imagen );
    }

}

