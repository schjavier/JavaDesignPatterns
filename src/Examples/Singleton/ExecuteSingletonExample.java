package Examples.Singleton;

import Examples.Example;


public class ExecuteSingletonExample implements Example {
    public void execute() {

        Curso curso = new Curso("Metodologias 2","Metodo2");
        DAOCurso daoCurso = new DAOCurso();
        daoCurso.guardarCurso(curso);

        Persona persona = new Persona("Julian","Alonso");
        DAOPersona daoPersona = new DAOPersona();
        daoPersona.guardarPersona(persona);


    }

    @Override
    public String getExampleName() {
        return "Singleton";
    }
}