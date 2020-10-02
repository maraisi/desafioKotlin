package br.com.digitalhouse

//Parte G: Criar um diagrama de classes que modele a classe DigitalHouseManager. A princípio, DigitalHouseManager
// tem uma lista de alunos, uma lista de professores, uma lista de cursos e uma lista de matrículas.

class DigitalHouseManager {

    val listaDeAlunos: MutableList<Aluno> = mutableListOf()
    var listaDeProfessores: MutableList<Professor> = mutableListOf()
    val listaDeCursos: MutableList<Curso> = mutableListOf()
    val listaDeMatriculas: MutableList<Matricula> = mutableListOf()

//--------------REGISTRAR CURSO---------------------------

    fun registrarCurso(nome: String, codigoCursoDH: Int, quantidadeMaximaDeAlunos: Int){


    }
//----------EXCLUIR CURSO------------------------

    fun excluirCurso(codigoCursoDH: Int){
    }

//----------REGISTRAR PROFESSOR ADJUNTO--------------------------

    fun registrarProfessorAdjunto(nome: String,
                                  sobrenome: String,
                                  tempoDeCasa: Int,
                                  codigoProfessorDH: Int,
                                  qtdHorasMonitoria: Int) {

    }

//------------PROFESSOR TITULAR--------------------

    fun registrarProfessorTitular(nome: String,
                                  sobrenome: String,
                                  tempoDeCasa: Int,
                                  codigoProfessorDH: Int,
                                  especialidade: String) {




    }

//-------------EXCLUIR PROFESSOR--------------------


    fun excluirProfessor(codigoProfessorDH: Int){


    }

//--------REGISTRAR ALUNO-------------------

    fun registrarAluno(nome: String, sobrenome: String, codigoAlunoDH: Int) {
    }

//------MATRICULAR ALUNO-----------------------------

    fun matricularAluno(codigoAlunoDH: Int, codigoCursoDH: Int){
    }

//-----------ALOCAR PROFESSORES A UM CURSO-------------------

    fun alocarProfessores(codigoCursoDH: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {

    }
}