/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

import java.util.ArrayList;
import java.util.Iterator;
import negocio.AplicacaoVacina;

/**
 *
 * @author letic
 */
public class RepositorioAplicacaoVacinasArrayList implements IRepositorioAplicacaoVacinas {
        
    
    private ArrayList<AplicacaoVacina> aplicacoes = new ArrayList<>();

    public RepositorioAplicacaoVacinasArrayList() {
        this.aplicacoes = new ArrayList<>();
    }
    
    @Override
    public AplicacaoVacina buscaAplicacao(String cpf){
        AplicacaoVacina aplicacao = null;
        for (int i = 0; i < aplicacoes.size(); i++) {
            AplicacaoVacina a = aplicacoes.get(i);
            if(a.getPaciente().getCPF().equals(cpf)){
                return a;                
            }
        }
        return aplicacao;
        
    }
    
   @Override
    public void insereAplicacao(AplicacaoVacina aplicacao){
        aplicacoes.add(aplicacao);
    }
    
    @Override
    public Iterator<AplicacaoVacina> getAplicacoes(){
               return this.aplicacoes.iterator();
    }


    
}
