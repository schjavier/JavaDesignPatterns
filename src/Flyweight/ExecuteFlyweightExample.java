package Flyweight;

public class ExecuteFlyweightExample {
    public ExecuteFlyweightExample() {
        ArbolFactory fabricaArboles = new ArbolFactory();

        // En lugar de crear árboles nuevos, simplemente toma del cache de árboles los que existan
        // Y a través de la interfaz se le pasan los datos extrínsecos

        DataArbol arbol1 = fabricaArboles.getArbol("platano");
        arbol1.obtenerInfo(15, 'n');

        DataArbol arbol2 = fabricaArboles.getArbol("gingko");
        arbol2.obtenerInfo(20, 'o');

        DataArbol arbol3 = fabricaArboles.getArbol("arce rojo");
        arbol3.obtenerInfo(8, 'e');
    }
}
