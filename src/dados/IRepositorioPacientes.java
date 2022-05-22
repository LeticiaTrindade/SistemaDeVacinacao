/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dados;

import java.util.Iterator;
import negocio.Paciente;


/**
 *
 * @author letic
 */
public interface IRepositorioPacientes {
    
    public Paciente buscaPaciente(String cpf);
    
    public void inserePaciente (Paciente paciente);
    
    public Iterator<Paciente> getPacientes();  

    public boolean temPaciente(Paciente paciente);
    
}
