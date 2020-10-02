package br.com.digitalhouse

//Parte A: Criar um diagrama de classes que modele a classe Aluno. A princípio, um aluno possui um nome (String),
//um sobrenome (String) e um código de aluno (Integer). Implementar a classe criando os atributos necessários.
//Criar um construtor para o aluno que tome como parâmetro um nome, um sobrenome e um código de aluno.
//Um aluno será igual a outro se seus códigos de aluno forem iguais (usar o equals para codigoAluno)

class Aluno(val nome: String, val sobrenome: String, var codigoAluno: Int){

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Aluno) {
            return false
        }
        return this.codigoAluno == other.codigoAluno
    }


}