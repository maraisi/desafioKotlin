package br.com.digitalhouse

//Parte D: queremos adicionar duas categorias de professores ao modelo anterior(professor). Os
//professores titulares e os professores adjuntos. Um professor titular tem uma especialidade (String)
//e um professor adjunto tem uma quantidade de horas de monitoria (Integer).

class ProfessorTitular(nome: String, sobrenome: String, tempoDeCasa: Int, codigoProfessor: Int,
                       var especialidade: String) : Professor(nome, sobrenome, tempoDeCasa, codigoProfessor)