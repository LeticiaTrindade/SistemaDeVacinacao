/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package negocio;

import java.time.LocalDate;
import util.Util;

/**
 *
 * @author letic
 */
public abstract class Paciente {
    
    private String nome;
    private LocalDate nascimento;
    private String cpf;

    //Construtor
    public Paciente(String nome, LocalDate nascimento, String cpf){
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
    }
    
    public int getIdade(){
        LocalDate agora = LocalDate.now();
        return Util.diferencaAnos(getNascimento(), agora);
    }
    
    //Gets e sets
    
    public String getNome(){
        return this.nome;
    }
    
    public String setNome(String nome){
       return this.nome = nome;
    }
    
    public LocalDate getNascimento(){
        return this.nascimento;
    }
    
    public LocalDate setNascimento(LocalDate nascimento){
        return this.nascimento = nascimento;
    }
    
    public  String getCPF(){
        return this.cpf;
    }
    
    public String setCPF(String cpf){
        return this.cpf = cpf;
    }
        
    //Equals
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Paciente && getCPF()==this.cpf){
            return true;
        }
    else {return false;}
       
    //toString
    
    }
    @Override
    public String toString(){
        return "Nome: "+ getNome() + "\n Data de nascimento: "+getNascimento()+"\n CPF: "+getCPF();
    }
    
       
}
