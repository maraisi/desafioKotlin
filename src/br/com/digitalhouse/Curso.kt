package br.com.digitalhouse

//Parte B: criar um diagrama de classes que modele a classe Curso. A princípio, um curso possui um nome (String)
// e um código de curso (Integer). Implementar a classe criando os atributos necessários.
//Um curso será igual a outro se seus códigos de curso forem iguais.(***usar o equals***)

//Parte E: além de ter um nome e código de curso, um curso possui um professor titular (ProfessorTitular),
//um professor adjunto (ProfessorAdjunto), uma quantidade máxima de alunos (Integer) e uma lista de alunos
//matriculados.

//Parte H: Criar um método na classe Curso que permita adicionar um aluno à lista. O método retornará true se o aluno
//puder ser adicionado ou false caso não haja vagas disponíveis. ● fun adicionarUmAluno(umAluno: Aluno): Boolean

//Criar um método na classe Curso que permita excluir um aluno da lista de alunos do curso.
//● fun excluirAluno(umAluno: Aluno)


class Curso (val nome:String,
             val codigoCurso: Int,
             var qtdMaximaDeAlunos: Int){

    val listaAlunosMatriculados: MutableList<Aluno> = mutableListOf()
    var professorTitular: ProfessorTitular = ProfessorTitular("","",0,0,"")
    var professorAdjunto: ProfessorAdjunto = ProfessorAdjunto("","",0,0,0)

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Curso) {
            return false
        }
        return this.codigoCurso == other.codigoCurso
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {

        if (listaAlunosMatriculados.size < qtdMaximaDeAlunos) {
            listaAlunosMatriculados.add(umAluno)
            return true
        }
        return false

    }

    fun excluirAluno(umAluno: Aluno) {
        listaAlunosMatriculados.remove(umAluno)

    }

}
