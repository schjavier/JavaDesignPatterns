package FactoryMethod;

public class ExecuteFactoryMethodExample {
    public ExecuteFactoryMethodExample() {
        SangucheriaRegular sand1 = new SangucheriaRegular();
        SangucheriaVegana sand2 = new SangucheriaVegana();

        IO.println(sand1.armarSanguche(TipoSanguche.TRIPLE));
        IO.println(sand1.armarSanguche(TipoSanguche.DOBLE));
        IO.println(sand2.armarSanguche(TipoSanguche.TRIPLE));
        IO.println(sand2.armarSanguche(TipoSanguche.DOBLE));
    }
}
