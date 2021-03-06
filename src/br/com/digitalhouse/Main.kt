package br.com.digitalhouse

fun main() {
    var digitalhouse = DigitalHouseManager()

//---------- Registrar dois professores titulares e dois professores adjuntos. (Inventar todos os seus valores)--------------

    digitalhouse.registrarProfessorTitular("Andre", "Almeida", 0, 20201472, "Mobile")
    digitalhouse.registrarProfessorTitular("Fabiana", "Peixoto", 2, 20180073, "Back-end")

    digitalhouse.registrarProfessorAdjunto("Rosana", "Barbosa", 1, 20192234, 4)
    digitalhouse.registrarProfessorAdjunto("Leonardo", "Silva", 0, 20201151, 6)

//---------- Registrar alunos--------------------------------------------------------------------------

    digitalhouse.registrarAluno("Eduardo", "Rodrigues", 335)
    digitalhouse.registrarAluno("Marlene", "da Silva", 501)
    digitalhouse.registrarAluno("Carlos", "Henrique", 112)
    digitalhouse.registrarAluno("Adriana", "França", 489)
    digitalhouse.registrarAluno("Otavio", "Miranda", 664)
    digitalhouse.registrarAluno("Luana", "de Castro", 942)

//-------Registrar dois curso-------------------------------------------------------------------

    digitalhouse.registrarCurso("Full Stack", 20001, 3)
    digitalhouse.registrarCurso("Android", 20002, 2)

//----------Alocar um professor titular e um adjunto para cada curso------------------------

    digitalhouse.alocarProfessores(20001, 20180073, 20201151)
    digitalhouse.alocarProfessores(20002, 20201472, 20192234)

//--------Matricular dois alunos no curso de Full Stack-------------------------------

    digitalhouse.matricularAluno(335, 20001)
    digitalhouse.matricularAluno(501, 20001)


//---------Matricular três alunos no curso de Android-------------------------

    digitalhouse.matricularAluno(112, 20002)
    digitalhouse.matricularAluno(489, 20002)
    digitalhouse.matricularAluno(942, 20002)

}