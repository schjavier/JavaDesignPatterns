package Examples.Singleton;

public class DAOPersona {
    private ConexionDB conexion;

    public DAOPersona() {
        this.conexion = ConexionDB.getInstance();
    }


    public void guardarPersona(Persona persona)
    {
        // simulando que se guarda a la db...
        conexion.guardar("persona");
        conexion.verInstancia();
    }
}
