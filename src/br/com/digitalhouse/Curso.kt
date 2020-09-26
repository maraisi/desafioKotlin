package br.com.digitalhouse

//Parte B: criar um diagrama de classes que modele a classe Curso. A princípio, um curso possui um nome (String)
// e um código de curso (Integer). Implementar a classe criando os atributos necessários.
//Um curso será igual a outro se seus códigos de curso forem iguais.

//Parte E: além de ter um nome e código de curso, um curso possui um professor titular (ProfessorTitular),
//um professor adjunto (ProfessorAdjunto), uma quantidade máxima de alunos (Integer) e uma lista de alunos
//matriculados.


class Curso (
    val nome:String,
    val codigoCurso: Int,
    var professorTitular: ProfessorTitular,
    var professorAdjunto: ProfessorAdjunto,
    var qtdMaxDeAlunos: Int,
    val listaAlunosMatriculados: mutableListOf
) {


}