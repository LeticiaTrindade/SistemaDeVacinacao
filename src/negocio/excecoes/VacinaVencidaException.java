/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.excecoes;

/**
 *
 * @author letic
 */
public class VacinaVencidaException extends Exception {
    
    public VacinaVencidaException() {
        super("Esta vacina está vencida");
    }

    public VacinaVencidaException(String message) {
        super(message);
    }
}
