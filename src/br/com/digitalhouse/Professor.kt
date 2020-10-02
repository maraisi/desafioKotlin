package br.com.digitalhouse

//Parte C: criar um diagrama de classes que modele a classe Professor. A princípio,
//um professor possui um nome (String), um sobrenome (String), um tempo de casa (Integer) e um
//código de professor (Integer). Implementar a classe criando os atributos necessários.
//Um professor será igual a outro se seus códigos de professor forem iguais. (***usar equals***)

//Parte D: As duas novas classes, professor titular e professor adjunto, herdam a classe professor.


open class Professor(var nome: String, var sobrenome: String, var tempoDeCasa: Int, var codigoProfessor: Int){

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Professor) {
            return false
        }
        return this.codigoProfessor == other.codigoProfessor
    }

}