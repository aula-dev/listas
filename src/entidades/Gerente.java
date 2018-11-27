/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import entidades.enums.TipoFuncionario;

/**
 *
 * @author black
 */
public class Gerente extends Funcionario {

    public Gerente(String nome, Integer idade, Double salario, TipoFuncionario tipoFuncionario) {
        super(nome, idade, salario, tipoFuncionario);
    }
    
   
    
}
