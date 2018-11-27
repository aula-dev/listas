/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingStyle;
import entidades.Diretor;
import entidades.Funcionario;
import entidades.Gerente;
import entidades.enums.TipoFuncionario;
import static entidades.enums.TipoFuncionario.DIRETOR;
import static entidades.enums.TipoFuncionario.FUNCIONARIO;
import static entidades.enums.TipoFuncionario.GERENTE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author black
 */
public class Principal {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("José", 23, 5000.0, FUNCIONARIO);
        Funcionario f2 = new Funcionario("Maria", 23, 6000.0, FUNCIONARIO);
        Diretor f3 = new Diretor("Pedro", 23, 7000.0, DIRETOR);
        Gerente f4 = new Gerente("João", 23, 8000.0, GERENTE);
        Gerente f5 = new Gerente("Marta", 23, 9000.0, GERENTE);
        
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.addAll(Arrays.asList(f1, f2, f3, f4, f5));
        
//        for (Funcionario listaFunc : listaFuncionarios) {
//                    System.out.println("\nNome: " + listaFunc.getNome() 
//                    + "\nSalario: " + listaFunc.getSalario());
//        }
        
//        List listaDiretor = listaFuncionarios.stream().filter(x -> x.getTipoFuncionario() == DIRETOR).collect(Collectors.toList());
//        for (Funcionario listaFunc : listaFuncionarios) {
//            if (listaFunc.getTipoFuncionario().equals(GERENTE)) {
//                System.out.println("\nNome: " + listaFunc.getNome() 
//                    + "\nSalario: " + listaFunc.getSalario()
//                    + "\nTipo funcionario: " + listaFunc.getTipoFuncionario());
//            }            
//        }
        
        
//        List<Funcionario> listaDiretor = listaFuncionarios.stream().filter(x -> x.getClass() == Diretor.class).collect(Collectors.toList());
//        System.out.println("LISTA DIRETOR");
//        for (Funcionario listaDir : listaDiretor) {
//            System.out.println("\nNome: " + listaDir.getNome() 
//                    + "\nSalario: " + listaDir.getSalario()
//                    + "\nTipo funcionario: " + listaDir.getTipoFuncionario());
//        }
        
       // List<Funcionario> listaDiretor = listaFuncionarios.stream().filter(x -> x.getClass() == Diretor.class).collect(Collectors.toList());
        System.out.println("LISTA DIRETOR");
        for (Funcionario listaDir : listaFuncionarios) {
            if (listaDir.getClass() == Gerente.class) {
                System.out.println("\nNome: " + listaDir.getNome() 
                    + "\nSalario: " + listaDir.getSalario()
                    + "\nTipo funcionario: " + listaDir.getTipoFuncionario());
            }
        }
    }
    
}
