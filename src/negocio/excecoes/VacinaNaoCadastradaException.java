/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.excecoes;

/**
 *
 * @author letic
 */
public class VacinaNaoCadastradaException extends Exception {
    
    public VacinaNaoCadastradaException() {
        super("Esta vacina não está cadastrada no sistema!");
    }

    public VacinaNaoCadastradaException(String message) {
        super(message);
    }
}
