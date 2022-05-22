/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.excecoes;

/**
 *
 * @author letic
 */
public class ResponsavelInvalidoException extends Exception {
    
    public ResponsavelInvalidoException() {
        super("É necessário um maior de idade para o menor!");
    }

    public ResponsavelInvalidoException(String message) {
        super(message);
    }
}
