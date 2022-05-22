/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

import java.util.ArrayList;
import java.util.Iterator;
import negocio.Paciente;

/**
 *
 * @author letic
 */
public class RepositorioPacienteArrayList implements IRepositorioPacientes {
    
    private ArrayList<Paciente> pacientes;
    
    public RepositorioPacienteArrayList(){
        this.pacientes = new ArrayList<Paciente>();
    }
    
    @Override
    public Paciente buscaPaciente(String cpf){
        Paciente paciente = null;
        for (int i = 0; i < pacientes.size(); i++) {
            Paciente p = pacientes.get(i);
            if(p.getCPF().equals(cpf)){
                return p;                
            }
        }
        return paciente;
    }
            
    @Override
    public void inserePaciente (Paciente paciente) {
            this.pacientes.add(paciente);
            }
    
    
    @Override
    public Iterator<Paciente> getPacientes(){
       return this.pacientes.iterator();
    }

   @Override
    public boolean temPaciente(Paciente paciente) {
       for(Paciente paciente2 : this.pacientes){
           return paciente2.getCPF().contentEquals(paciente.getCPF());
       }
       return false;
    }
    
}
   
