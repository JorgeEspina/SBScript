package org.esvux.sbscript.interprete;

import org.esvux.sbscript.ast.Constantes;

/**
 *
 * @author esvux
 */
public class Resultado {

    private String valor;
    private int tipo;
    private boolean retorno;

    public Resultado() {
        this.valor = "";
        this.tipo = Constantes.T_ERROR;
        this.retorno = false;
    }    
    
    public Resultado(String valor, int tipo) {
        this.valor = valor;
        this.tipo = tipo;
        this.retorno = false;
    }

    public void marcarComoRetorno() {
        this.retorno = true;
    }
    
    public boolean esRetorno() {
        return this.retorno;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}