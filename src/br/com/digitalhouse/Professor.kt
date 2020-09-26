package br.com.digitalhouse

//Parte C: criar um diagrama de classes que modele a classe Professor. A princípio,
//um professor possui um nome (String), um sobrenome (String), um tempo de casa (Integer) e um
//código de professor (Integer). Implementar a classe criando os atributos necessários.
//Um professor será igual a outro se seus códigos de professor forem iguais.

class Professor(val nome: String, val sobrenome: String, var tempoDeCasa: Int, val codigoProfessor: Int) {
}