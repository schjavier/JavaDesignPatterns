package Examples.Singleton;

public class DAOCurso {
    private ConexionDB conexion;

    public DAOCurso() {
        this.conexion = ConexionDB.getInstance();
    }


    public void guardarCurso(Curso curso)
    {
        // simulando que se guarda a la db...
        conexion.guardar("curso");
        conexion.verInstancia();
    }
}
