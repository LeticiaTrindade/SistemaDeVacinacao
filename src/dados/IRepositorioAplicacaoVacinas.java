/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dados;

import java.util.Iterator;
import negocio.AplicacaoVacina;

/**
 *
 * @author letic
 */
public interface IRepositorioAplicacaoVacinas {
    
    AplicacaoVacina buscaAplicacao(String cpf);
    
    void insereAplicacao(AplicacaoVacina aplicacao);
    
    public Iterator<AplicacaoVacina> getAplicacoes();
   
    
}
