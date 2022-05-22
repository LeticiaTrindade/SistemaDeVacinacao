/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import negocio.excecoes.VacinaJaExisteException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Iterator;
import negocio.excecoes.ResponsavelInvalidoException;
import negocio.excecoes.PacienteJaExisteException;
import negocio.excecoes.PacienteNaoCadastradoException;
import negocio.excecoes.VacinaNaoCadastradaException;
import negocio.excecoes.VacinaVencidaException;

/**
 *
 * @author sidneynogueira
 */
public class TesteSistema {
    
    public static void listaVacinas(Iterator<Vacina> vacinas){
        while(vacinas.hasNext()) {
            Vacina v = vacinas.next();
            System.out.println(v);
        }
    }
    
    public static void listaVacinas(Vacina[] vacinas){
        for (Vacina vacina : vacinas) {
            System.out.println(vacina);
        }
    }
    
    public static void listaPacientes(Iterator<Paciente> pacientes){
        while(pacientes.hasNext()) {
            Paciente p = pacientes.next();
            System.out.println(p);
        }
    }
    
    public static void listaPacientes(Paciente[] pacientes){
        for (Paciente paciente : pacientes) {
            System.out.println(paciente);
        }
    }
    
    public static void listaAplicacoes(Iterator<AplicacaoVacina> aplicacoes){
        while(aplicacoes.hasNext()) {
            AplicacaoVacina a = aplicacoes.next();
            System.out.println(a);
        }
    }
    
    public static void listaAplicacoes(AplicacaoVacina[] aplicacoes){
        for (AplicacaoVacina aplicacao : aplicacoes) {
            System.out.println(aplicacao);
        }
    }
    public static void main(String[] args) throws VacinaJaExisteException, PacienteJaExisteException, ResponsavelInvalidoException,PacienteNaoCadastradoException,VacinaVencidaException,VacinaNaoCadastradaException  {
        SistemaVacinas sistema = SistemaVacinas.getInstance();
        
                System.out.println("\n\nTestes vacinas!");

        Vacina coronavac = new Vacina("Coronavac",LocalDate.of(2022, Month.AUGUST, 10),50.6);
        Vacina jansem = new Vacina("Jansem",LocalDate.of(2022, Month.APRIL, 20),80);
        sistema.cadastraVacina(coronavac);
        sistema.cadastraVacina(jansem);
        listaVacinas(sistema.todasVacinas());
        listaVacinas(sistema.getVacinasVencem(2022, 8));
        
        //Teste pacientes
        System.out.println("\n\nTestes pacientes!");

        Adulto leticia = new Adulto ("Letícia", LocalDate.of(1999, Month.APRIL, 10), "1234-5", "Paulista");
        Menor luan = new Menor ("luan", LocalDate.of(2007, Month.APRIL, 10), "1234-6", leticia);
        Adulto amanda = new Adulto ("Amanda", LocalDate.of(1999, Month.APRIL, 10), "1234-7", "Olinda");
        Menor alef = new Menor ("Alef", LocalDate.of(2010, Month.APRIL, 10), "1234-5", amanda);
        sistema.cadastrarPaciente(leticia);
        sistema.cadastrarPaciente(luan);
        sistema.cadastrarPaciente(alef);
        sistema.cadastrarPaciente(amanda);
        listaPacientes(sistema.todosPacientes());
        
        System.out.println("\n\nTestes aplicacoes!");

        AplicacaoVacina primeiraDose = new AplicacaoVacina(coronavac, LocalDate.of(2020, Month.AUGUST, 20), leticia);
        AplicacaoVacina segundaDose = new AplicacaoVacina(jansem, LocalDate.of(2022, Month.APRIL, 24), luan);
        sistema.cadastrarAplicacao(primeiraDose);
        try{sistema.cadastrarAplicacao(segundaDose);}
        catch(VacinaVencidaException e){System.out.println("*****A vacina está vencida e não é possivel aplicar******\n");}

        listaAplicacoes(sistema.todasAplicacoes());
       

    }
 
}
