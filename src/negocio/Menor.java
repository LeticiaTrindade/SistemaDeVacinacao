/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.time.LocalDate;
/**
 *
 * @author letic
 */
public class Menor extends Paciente{
    private Adulto responsavel;

    
    public Menor(String nome, LocalDate nascimento, String cpf, Adulto responsavel){
        super(nome, nascimento,cpf);
        this.responsavel = responsavel;
    }
   
        
    @Override
    public String toString() {
        return "Nome: "+ getNome() + "\nData de nascimento: "+getNascimento()+"\nCPF: "+getCPF()+"\nIdade: "+getIdade()+"\n"+"\nResponsável: "+getResponsavel();
    }
    
     public Adulto getResponsavel() {
        return this.responsavel;
    }
    
    public Adulto setResponsavel(Adulto responsavel) {
        return this.responsavel = responsavel;
    }
}
 