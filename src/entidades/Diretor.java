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
public class Diretor extends Funcionario {

    public Diretor(String nome, Integer idade, Double salario, TipoFuncionario tipoFuncionario) {
        super(nome, idade, salario, tipoFuncionario);
    }
    
    
    
}
