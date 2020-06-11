/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CAROL
 */package PadrãoBuilder;
 
public class Paciente {
    
    private String nome;
    private String dt_Nascimento;
    private String telefone;private String endereco;
    public String getNome() { return nome;
    } 
    
    
    public void setNome(String nome) { 
        this.nome = nome; 
    }
    public String getDt_Nascimento() {
        return dt_Nascimento; 
    } 
    public void setDt_Nascimento(String dt_Nascimento) { 
        this.dt_Nascimento = dt_Nascimento;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone; 
    } 
    public String getEndereco() { 
        return endereco; 
    } public void setEndereco(String endereco) {
        this.endereco = endereco; } 	
}
    
    
