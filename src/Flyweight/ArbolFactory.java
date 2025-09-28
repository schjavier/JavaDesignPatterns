package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
    private Map<String, DataArbol> arbolCache = new HashMap<>();

    // Revisa que exista el arbol ingresado en el caché
    // Si existe, lo devuelve
    // Sino, lo crea y luego lo devuelve

    public DataArbol getArbol(String key) {
        if (arbolCache.containsKey(key)) {
            return arbolCache.get(key);
        } else {
            DataArbol arbol;
            if (key.equalsIgnoreCase("platano") || key.equals("plátano")) {
                arbol = new Arbol(TipoArbol.PLATANO,Color.VERDE);
            } else if (key.equalsIgnoreCase("gingko")) {
                arbol = new Arbol(TipoArbol.GINGKO,Color.AMARILLO);
            } else if (key.equalsIgnoreCase("arce rojo")) {
                arbol = new Arbol(TipoArbol.ARCE_ROJO,Color.ROJO);
            } else {
                throw new IllegalArgumentException("Tipo de arbol no soportado: " + key);
            }
            arbolCache.put(key,arbol);
            return arbol;
        }
    }
}
