package FactoryMethod;

public class SangucheriaRegular implements Sangucheria {
    @Override
    public Sanguche armarSanguche(TipoSanguche tipoSanguche) {
        return new SangucheRegular(tipoSanguche);
    }
}
