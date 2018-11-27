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
public class Funcionario {
    protected String nome;
    protected Integer idade;
    protected Double salario;
    protected TipoFuncionario tipoFuncionario;

    public Funcionario(String nome, Integer idade, Double salario, TipoFuncionario tipoFuncionario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.tipoFuncionario = tipoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }
    
    
       
}
