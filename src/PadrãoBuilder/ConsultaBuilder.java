/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadrãoBuilder;

/**
 *
 * @author CAROL
 */
interface ConsultaBuilder {
    
void cadastrarMedico(String nome, String especialidade);	
void cadastrarPaciente(String nome, String dt_Nascimento);	
void agendarConsulta(String data, String hora);	
Consulta finalizarConsulta();	
}
    

