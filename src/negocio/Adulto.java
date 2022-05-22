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
public class Adulto extends Paciente {
    
    private String endereco;

    
    
    public Adulto (String nome, LocalDate nascimento, String cpf, String endereco){
        super(nome, nascimento,cpf);
        this.endereco = endereco;
    }

    
     public Adulto (String nome, LocalDate nascimento, String cpf){
        super(nome, nascimento,cpf);
    }

    @Override
    public String toString() {
        return "Nome: "+ getNome() + "\nData de nascimento: "+getNascimento()+"\nCPF: "+getCPF()+"\nEndereço: "+getEndereco()+"\nIdade: "+getIdade()+"\n";
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public String setEndereco(String endereco) {
        return this.endereco = endereco;
    }

}
