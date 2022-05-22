/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import negocio.excecoes.VacinaJaExisteException;
import dados.IRepositorioAplicacaoVacinas;
import dados.IRepositorioPacientes;
import dados.IRepositorioVacinas;
import dados.RepositorioAplicacaoVacinasArrayList;
import dados.RepositorioPacienteArrayList;
import dados.RepositorioVacinasArrayList;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import negocio.excecoes.PacienteJaExisteException;
import negocio.excecoes.PacienteNaoCadastradoException;
import negocio.excecoes.ResponsavelInvalidoException;
import negocio.excecoes.VacinaNaoCadastradaException;
import negocio.excecoes.VacinaVencidaException;



/**
 *
 * @author sidneynogueira
 */
public class SistemaVacinas {

    
    private IRepositorioVacinas vacinas;
    private IRepositorioAplicacaoVacinas aplicacoes;
    private IRepositorioPacientes pacientes;

    static SistemaVacinas singleton;

    public static SistemaVacinas getInstance() {
        if (singleton == null) {
            singleton = new SistemaVacinas();
        }
        return singleton;
    }

    private SistemaVacinas() {
        this.vacinas = new RepositorioVacinasArrayList();
        this.pacientes = new RepositorioPacienteArrayList();
        this.aplicacoes = new RepositorioAplicacaoVacinasArrayList();
    }

    public void cadastrarPaciente(Paciente paciente) throws PacienteJaExisteException, ResponsavelInvalidoException {
      
       if (this.pacientes.buscaPaciente(paciente.getCPF()) == null) {
           if (paciente.getIdade() >= 18){
               this.pacientes.inserePaciente(paciente);
           }
           else if(paciente instanceof Menor){
               Menor deMenor = (Menor)paciente;
               if(deMenor.getResponsavel()==null || deMenor.getResponsavel().getIdade()<18){
               throw new ResponsavelInvalidoException();}
               else {this.pacientes.inserePaciente(paciente);}
           
       } else {
           throw new PacienteJaExisteException("Paciente '" + paciente.getNome() + "' já esta cadastrado!");
       }
    }
    }
    
        public Iterator<Paciente> todosPacientes() {
        return this.pacientes.getPacientes();
    }
      
    //////////////////////////////////////////////////////////////
    
      public void cadastrarAplicacao(AplicacaoVacina Aplicacao) throws PacienteNaoCadastradoException, VacinaNaoCadastradaException, VacinaVencidaException {
      
          LocalDate agora = LocalDate.now();
          
       if (this.aplicacoes.buscaAplicacao(Aplicacao.getPaciente().getCPF()) != null) {
           System.out.println(Aplicacao.getPaciente().getCPF());
           throw new PacienteNaoCadastradoException();
         
           }
           else if(this.vacinas.recupera(Aplicacao.getVacina().getNome()) == null){
           throw new VacinaNaoCadastradaException();
           }
           else if(Aplicacao.getVacina().getValidade().isBefore(agora)){
               throw new VacinaVencidaException();
           } 
           else {
               this.aplicacoes.insereAplicacao(Aplicacao);
       }
      }
      
        public Iterator<AplicacaoVacina> todasAplicacoes() {
        return this.aplicacoes.getAplicacoes();
    }
 //////////////////////////////////////////////////////////////
        
    public void cadastraVacina(Vacina vacina) throws VacinaJaExisteException {
        if (this.vacinas.recupera(vacina.getNome()) == null) {
            this.vacinas.insere(vacina);
        } else {
            throw new VacinaJaExisteException("Vacina '" + vacina.getNome() + "' já esta cadastrada!");
        }
    }

    public Iterator<Vacina> todasVacinas() {
        return this.vacinas.getVacinas();
    }

    public Vacina[] getVacinasVencem(int ano, int mes) {
        ArrayList<Vacina> vencem = new ArrayList<>();
        for (Iterator<Vacina> iterator = vacinas.getVacinas(); iterator.hasNext();) {
            Vacina v = iterator.next();
            LocalDate validade = v.getValidade();
            if (validade.getYear() == ano && validade.getMonthValue() == mes) {
                vencem.add(v);
            }
        }
        Vacina vencemArray[] = new Vacina[vencem.size()];
        for (int i = 0; i < vencemArray.length; i++) {
            vencemArray[i] = vencem.get(i);
        }

        return vencemArray;
    }

}
