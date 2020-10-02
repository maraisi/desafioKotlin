package br.com.digitalhouse

import br.com.digitalhouse.Professor as Professor

//Parte G: Criar um diagrama de classes que modele a classe DigitalHouseManager. A princípio, DigitalHouseManager
// tem uma lista de alunos, uma lista de professores, uma lista de cursos e uma lista de matrículas.

//Parte I: Criar um método na classe DigitalHouseManager que permita registrar um curso. O método recebe como
//parâmetros o nome do curso, o código e a quantidade máxima de alunos admitidos. O método deve criar um curso
//com os dados correspondentes e adicioná-lo à lista de cursos. fun registrarCurso(nome: String, codigoCurso: Integer,
// quantidadeMaximaDeAlunos: Integer )


class DigitalHouseManager {

    val listaDeAlunos: MutableList<Aluno> = mutableListOf()
    var listaDeProfessores: MutableList<Professor> = mutableListOf()
    val listaDeCursos: MutableList<Curso> = mutableListOf()
    val listaDeMatriculas: MutableList<Matricula> = mutableListOf()

//--------------REGISTRAR CURSO---------------------------

    fun registrarCurso(nome: String, codigoCursoDH: Int, quantidadeMaximaDeAlunos: Int){
        listaDeCursos.add(Curso(nome, codigoCursoDH, quantidadeMaximaDeAlunos))

        //Para ver se o curso foi adicionado na lista de cursos da Digital House
        for(curso in listaDeCursos){
            if(curso.codigoCurso.equals(codigoCursoDH)){
                println("\nAdicionado à lista de cursos da Digital House   • Nome do curso: ${curso.nome}\n" +
                        "                                                • Código do curso: ${curso.codigoCurso}\n" +
                        "                                                • Quantidade Máxima: ${curso.qtdMaximaDeAlunos}\n")
                return
            }
        }

    }
//----------EXCLUIR CURSO------------------------

    fun excluirCurso(codigoCursoDH: Int){
        for(curso in listaDeCursos){
            if(curso.codigoCurso.equals(codigoCursoDH)){
                println("O curso de ${curso.nome} foi removido da lista de cursos da Digital House.\n")
                listaDeCursos.remove(curso)
                return

            }
        }
        println("Esse curso não existe.\n")
    }

//----------REGISTRAR PROFESSOR ADJUNTO--------------------------

    fun registrarProfessorAdjunto(nome: String,
                                  sobrenome: String,
                                  tempoDeCasa: Int,
                                  codigoProfessorDH: Int,
                                  qtdHorasMonitoria: Int) {

        listaDeProfessores.add(ProfessorAdjunto(nome, sobrenome, tempoDeCasa, codigoProfessorDH, qtdHorasMonitoria))

        //Para ver se o professor adjunto foi adicionado na lista de professores da Digital House
        for(prof:Professor in listaDeProfessores){
            if(prof.codigoProfessor.equals(codigoProfessorDH)){
                println("\nAdicionado à lista de professores.......... Professor Adjunto: ${prof.nome} ${prof.sobrenome}\n" +
                        "                                            Código do professor: ${prof.codigoProfessor}\n"
                )

                return
            }
        }


    }

//------------PROFESSOR TITULAR--------------------

    fun registrarProfessorTitular(nome: String,
                                  sobrenome: String,
                                  tempoDeCasa: Int,
                                  codigoProfessorDH: Int,
                                  especialidade: String) {

        listaDeProfessores.add(ProfessorTitular(nome, sobrenome, tempoDeCasa, codigoProfessorDH, especialidade))

        //Para ver se o professor titular foi adicionado na lista de professores da Digital House
        for(prof in listaDeProfessores){
            if(prof.codigoProfessor.equals(codigoProfessorDH)){
                println("\nAdicionado à lista de professores.......... Professor Titular: ${prof.nome} ${prof.sobrenome}\n" +
                        "                                            Código do professor: ${prof.codigoProfessor}\n"
                )
                return
            }
        }


    }

//-------------EXCLUIR PROFESSOR--------------------


    fun excluirProfessor(codigoProfessorDH: Int){

        for(professor in listaDeProfessores){
            if(professor.codigoProfessor.equals(codigoProfessorDH)){
                println("O professor ${professor.nome} foi removido da lista de professores.\n")
                listaDeProfessores.remove(professor)
                return
            }

        }
        return println("Esse professor não existe")

    }

//--------REGISTRAR ALUNO-------------------

    fun registrarAluno(nome: String, sobrenome: String, codigoAlunoDH: Int) {

        listaDeAlunos.add(Aluno(nome, sobrenome, codigoAlunoDH))

        //Para ver se o aluno foi adicionado na lista de alunos
        for (aluno in listaDeAlunos) {
            if (aluno.codigoAluno.equals(codigoAlunoDH)) {
                return println("${aluno.nome} ${aluno.sobrenome} foi registrado(a) como aluno(a) da Digital House.\n")

            }
        }
    }

//------MATRICULAR ALUNO-----------------------------

    fun matricularAluno(codigoAlunoDH: Int, codigoCursoDH: Int){
        for(curso in listaDeCursos){
            if (curso.codigoCurso.equals(codigoCursoDH)){

                for (aluno in listaDeAlunos){
                    if (aluno.codigoAluno.equals(codigoAlunoDH)){
                        println("\nMATRICULA............ Aluno: ${aluno.nome} ${aluno.sobrenome}\n" +
                                "                      Curso solicitado: ${curso.nome}")
                        if(curso.adicionarUmAluno(aluno)){
                            listaDeMatriculas.add(Matricula(aluno, curso))
                            return println("                      Existem vagas no curso e a matrícula foi realizada com sucesso.\n")


                        }
                        return println("                      A matrícula não foi realizada pois não há vagas para o curso.\n")


                    }
                }

            }
        }

    }

//-----------ALOCAR PROFESSORES A UM CURSO-------------------

    fun alocarProfessores(codigoCursoDH: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {

        for (curso in listaDeCursos){
            if(curso.codigoCurso.equals(codigoCursoDH)){
                for (professor in listaDeProfessores){
                    if(professor.codigoProfessor.equals(codigoProfessorTitular)){
                        curso.professorTitular = professor as ProfessorTitular
                        println("\nProfessor titular alocado ao curso de ${curso.nome}: ${curso.professorTitular.nome} ${curso.professorTitular.sobrenome}")

                    }
                    if (professor.codigoProfessor.equals(codigoProfessorAdjunto)){
                        curso.professorAdjunto = professor as ProfessorAdjunto
                        println("Professor adjunto alocado ao curso de ${curso.nome}: ${curso.professorAdjunto.nome} ${curso.professorAdjunto.sobrenome}\n")

                    }
                }

            }
        }
    }


}
