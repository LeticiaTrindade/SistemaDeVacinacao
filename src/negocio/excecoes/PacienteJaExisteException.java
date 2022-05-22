/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.excecoes;

/**
 *
 * @author letic
 */
public class PacienteJaExisteException extends Exception {
    
    public PacienteJaExisteException() {
        super("Este CPF já está cadastrado!");
    }

    public PacienteJaExisteException(String message) {
        super(message);
    }
}
