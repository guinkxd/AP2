package sistemaacademico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Turmas
* Objetivo...: Representar uma turma da instituição de ensino.
* Observacoes:
*/
public class Turmas extends Coisa {
    int                             capacidade;
    int                             ano;
    int                             semestre;
    int                             curso;
    private ArrayList <Turmas>  turmasCad;
//    int codigo, String nomeAbreviado, String nomeCompleto, int capacidade, int ano, int semestre, int curso
    public Turmas(ArrayList<Turmas> turmasCad) {
//    	this.codigo = codigo;
//    	this.nomeAbreviado = nomeAbreviado;
//    	this.nomeCompleto = nomeCompleto;
//    	this.capacidade = capacidade;
//    	this.ano = ano;
//    	this.semestre = semestre;
//    	this.curso = curso;
    	this.turmasCad = turmasCad;
    }

    public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	@Override
    public void cadastrar() {
		turmasCad.add(this);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consultar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    //
    // A equipe responsável deverá verificar se há necessidade de outros
    // atributos e métodos para inseri-los.
    //
    // Obs.: Não há equipe responsável por esta parte...
    
}
