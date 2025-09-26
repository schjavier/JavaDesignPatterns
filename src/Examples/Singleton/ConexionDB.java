package Examples.Singleton;

public class ConexionDB {
    private String url = "https://algunlado.com";
    private String contrasenia = "pass123";

    private static ConexionDB conexion;

    private ConexionDB() {}

    static public ConexionDB getInstance()
    {
        if(conexion == null)
        {
             conexion = new ConexionDB();
        }

        return conexion;
    }

    public void guardar(String mensaje)
    {
        System.out.println(mensaje + " guardado....");
    }

    public void verInstancia()
    {
        System.out.println("ID de instancia: " + conexion);
    }

}
