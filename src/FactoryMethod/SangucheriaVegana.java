package FactoryMethod;

public class SangucheriaVegana implements Sangucheria{
    @Override
    public Sanguche armarSanguche(TipoSanguche tipoSanguche) {
        return new SangucheVegano(tipoSanguche);
    }
}
