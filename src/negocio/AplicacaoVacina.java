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
public class AplicacaoVacina {
    private Vacina vacina;
    private LocalDate dataDeAplicacao;
    private Paciente paciente;
    
    public AplicacaoVacina(Vacina vacina, LocalDate dataDeAplicacao, Paciente paciente){
        this.vacina = vacina;
        this.dataDeAplicacao = dataDeAplicacao;
        this.paciente = paciente;
    }
    
    public Vacina getVacina(){
        return this.vacina;
    }
    
    public Vacina setVacina(Vacina vacina){
        return this.vacina = vacina;
    }
    
      public LocalDate getDataDeAplicacao(){
        return this.dataDeAplicacao;
    }
    
    public LocalDate setDataDeAplicacao(LocalDate dataDeAplicacao){
        return this.dataDeAplicacao = dataDeAplicacao;
    }
    
    public Paciente getPaciente(){
        return this.paciente;
    }
    
    public Paciente setPaciente(Paciente paciente){
        return this.paciente = paciente;
    }

    
    public String toString(){
        return "Nome da vacina: "+getVacina()+"\nData de aplicação: "+getDataDeAplicacao()+"\nNome do Paciente: "+getPaciente()+"\n";
    }
    
}
