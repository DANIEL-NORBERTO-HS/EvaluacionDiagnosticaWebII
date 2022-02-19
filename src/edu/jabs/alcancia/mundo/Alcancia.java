/*
Author: Daniel Norberto Hernández Santiago
Num. ctrl:18390015
Materia: Desarrollo	Web	II
Semetre: 8vo
 */

package edu.jabs.alcancia.mundo;

/**
 * Clase que representa una alcancía.
 */
public class Alcancia
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Número de monedas de $1 que hay en la alcancía.
     */
    private int numeroMonedas1;

    /**
     * Número de monedas de $2 que hay en la alcancía.
     */
    private int numeroMonedas2;

    /**
     * Número de monedas de $5 que hay en la alcancía.
     */
    private int numeroMonedas5;

    /**
     * Número de monedas de $10 que hay en la alcancía.
     */
    private int numeroMonedas10;
    
      /**
     * Número de Billetes de $20 que hay en la alcancía.
     */
    private int numeroBilletes20;

    /**
     * Número de Billetes de $50 que hay en la alcancía.
     */
    private int numeroBilletes50;

    /**
     * Número de Billetes de $100 que hay en la alcancía.
     */
    private int numeroBilletes100;

    /**
     * Número de Billetes de $200 que hay en la alcancía.
     */
    private int numeroBilletes200;

    /**
     * Número de Billetes de $500 que hay en la alcancía.
     */
    private int numeroBilletes500;

    /**
     * Número de Billetes de $1000 que hay en la alcancía.
     */
    private int numeroBilletes1000;

    /**
     * Estado de la alcancía. <br>
     * 0 indica que no está rota. <br>
     * 1 indica que está rota.
     */
    private int estado;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Construye la alcancía. <br>
     * <b>post: </b> El número de monedas de 1, número de monedas de 2, número de monedas de 5, número de monedas de 10, número de monedas de 20 y el estado fueron
     * incializados en 0.
     */
    public Alcancia( )
    {
        numeroMonedas1 = 0;
        numeroMonedas2 = 0;
        numeroMonedas5 = 0;
        numeroMonedas10 = 0;
        numeroBilletes20 =0;
        numeroBilletes50 =0;
        numeroBilletes100 =0;
        numeroBilletes200 =0;
        numeroBilletes500 =0;
        numeroBilletes1000 =0;
        estado = 0;
    }

    /**
     * Retorna el número de monedas de $1 que hay en la alcancía.
     * @return Número de monedas de $1 en la alcancía.
     */
    public int darNumeroMonedas1( )
    {
        return numeroMonedas1;
    }

    /**
     * Retorna el número de monedas de $2 que hay en la alcancía.
     * @return Número de monedas de $2 en la alcancía.
     */
    public int darNumeroMonedas2( )
    {
        return numeroMonedas2;
    }

    /**
     * Retorna el número de monedas de $5 que hay en la alcancía.
     * @return Número de monedas de $5 en la alcancía.
     */
    public int darNumeroMonedas5( )
    {
        return numeroMonedas5;
    }

    /**
     * Retorna el número de monedas de $10 que hay en la alcancía.
     * @return Número de monedas de $10 en la alcancía.
     */
    public int darNumeroMonedas10( )
    {
        return numeroMonedas10;
    }

    /**
     * Retorna el número de Billetes de $20 que hay en la alcancía.
     * @return Número de Billetes de $20 en la alcancía.
     */
    public int darNumeroBilletes20( )
    {
        return numeroBilletes20;
    }

    /**
     * Retorna el número de Billetes de $50 que hay en la alcancía.
     * @return Número de Billetes de $50 en la alcancía.
     */
    public int darNumeroBilletes50( )
    {
        return numeroBilletes50;
    }

    /**
     * Retorna el número de Billetes de $100 que hay en la alcancía.
     * @return Número de Billetes de $100 en la alcancía.
     */
    public int darNumeroBilletes100( )
    {
        return numeroBilletes100;
    }

    /**
     * Retorna el número de Billetes de $200 que hay en la alcancía.
     * @return Número de Billetes de $200 en la alcancía.
     */
    public int darNumeroBilletes200( )
    {
        return numeroBilletes200;
    }

    /**
     * Retorna el número de Billetes de $500 que hay en la alcancía.
     * @return Número de Billetes de $500 en la alcancía.
     */
    public int darNumeroBilletes500( )
    {
        return numeroBilletes500;
    }

    /**
     * Retorna el número de Billetes de $1000 que hay en la alcancía.
     * @return Número de Billetes de $1000 en la alcancía.
     */
    public int darNumeroBilletes1000( )
    {
        return numeroBilletes1000;
    }

    /**
     * Informa si la alcancía está rota o no.
     * @return Retorna 1 si está rota, 0 en caso contrario.
     */
    public int darEstado( )
    {
        return estado;
    }

    /**
     * Retorna el total de dinero que hay en la alcancía.
     * @return Total de dinero que hay en la alcancía.
     */
    public int calcularTotalDinero( )
    {
        return numeroMonedas1 * 1 + numeroMonedas2 * 2 + numeroMonedas5 * 5 + numeroMonedas10 * 10 + numeroBilletes20*20
        + numeroBilletes50*50 + numeroBilletes100*100 + numeroBilletes200*200 + numeroBilletes500*500 + numeroBilletes1000*1000;
    }

    /**
     * Retorna el estado de la alcancía. <br>
     * <b>pre: </b>La alcancía no está rota.<br>
     * @return Cadena que informa la cantidad de monedas que había en la alcancía y la cantidad total de dinero.
     */
    public String darEstadoAlcancia( )
    {
        int totalDinero = calcularTotalDinero( );

    return "La alcancía tenía: \n " + numeroMonedas1 + " moneda(s) de $1 \n " + numeroMonedas2 + " moneda(s) de $2 \n " + numeroMonedas5 + " moneda(s) de $5 \n " + numeroMonedas10 + " moneda(s) de $10 \n " 
    + numeroBilletes20 + " billete(s) de $20 \n " + numeroBilletes50 + " billete(s) de $50 \n "+ numeroBilletes100 + " billete(s) de $100 \n "+ numeroBilletes200 + " billete(s) de $200 \n "+ numeroBilletes500 + " billete(s) de $500 \n "+ numeroBilletes1000 + " billete(s) de $1000 \n " + "Para un total de $" + totalDinero + " pesos.";
    }

    /**
     * Agrega una moneda de $1 a la alcancía. <br>
     * <b>pre: </b>La alcancía no está rota. <br>
     * <b>post: </b>Aumentó en uno la cantidad de monedas de $1 en la alcancía.
     */
    public void agregarMoneda1( )
    {
        numeroMonedas1 = numeroMonedas1 + 1;
    }

    /**
     * Agrega una moneda de $2 a la alcancía. <br>
     * <b>pre: </b>La alcancía no está rota. <br>
     * <b>post: </b>Aumentó en uno la cantidad de monedas de $2 en la alcancía.
     */
    public void agregarMoneda2( )
    {
        numeroMonedas2 = numeroMonedas2 + 1;
    }

    /**
     * Agrega una moneda de $5 a la alcancía. <br>
     * <b>pre: </b>La alcancía no está rota. <br>
     * <b>post: </b>Aumentó en uno la cantidad de monedas de $5 en la alcancía.
     */
    public void agregarMoneda5( )
    {
        numeroMonedas5 = numeroMonedas5 + 1;
    }

    /**
     * Agrega una moneda de $10 a la alcancía. <br>
     * <b>pre: </b>La alcancía no está rota. <br>
     * <b>post: </b>Aumentó en una la cantidad de monedas de $10 en la alcancía.
     */
    public void agregarMoneda10( )
    {
        numeroMonedas10 = numeroMonedas10 + 1;
    }

 /**
     * Agrega un Billete de $20 a la alcancía. <br>
     * <b>pre: </b>La alcancía no está rota. <br>
     * <b>post: </b>Aumentó en uno la cantidad de Billetes de $20 en la alcancía.
    */
    public void agregarBillete20( )
    {
        numeroBilletes20 = numeroBilletes20 + 1;
    }

    /**
     * Agrega un Billete de $50 a la alcancía. <br>
     * <b>pre: </b>La alcancía no está rota. <br>
     * <b>post: </b>Aumentó en uno la cantidad de Billetes de $50 en la alcancía.
     */
    public void agregarBillete50( )
    {
        numeroBilletes50 = numeroBilletes50 + 1;
    }

    /**
     * Agrega un Billete de $100 a la alcancía. <br>
     * <b>pre: </b>La alcancía no está rota. <br>
     * <b>post: </b>Aumentó en uno la cantidad de Billetes de $100 en la alcancía.
     */
    public void agregarBillete100( )
    {
        numeroBilletes100 = numeroBilletes100 + 1;
    }

    /**
     * Agrega una Billete de $200 a la alcancía. <br>
     * <b>pre: </b>La alcancía no está rota. <br>
     * <b>post: </b>Aumentó en una la cantidad de Billetes de $200 en la alcancía.
     */
    public void agregarBillete200( )
    {
        numeroBilletes200 = numeroBilletes200 + 1;
    }

    /**
     * Agrega una Billete de $500 a la alcancía. <br>
     * <b>pre: </b>La alcancía no está rota. <br>
     * <b>post: </b>Aumentó en uno la cantidad de Billetes de $500 en la alcancía.
     */
    public void agregarBillete500( )
    {
        numeroBilletes500 = numeroBilletes500 + 1;
    }

    /**
     * Agrega una Billete de $1000 a la alcancía. <br>
     * <b>pre: </b>La alcancía no está rota. <br>
     * <b>post: </b>Aumentó en uno la cantidad de Billetes de $1000 en la alcancía.
     */
    public void agregarBillete1000( )
    {
        numeroBilletes1000 = numeroBilletes1000 + 1;
    }

    

    /**
     * Rompe la alcancía. <br>
     * <b>pre: </b>La alcancía no está rota. <br>
     * <b>post: </b>La alcancía está rota.
     */
    public void romperAlcancia( )
    {
        estado = 1;
    }


}

