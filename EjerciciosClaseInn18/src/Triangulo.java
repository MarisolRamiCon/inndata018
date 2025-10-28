public class Triangulo implements Figura {
    //Atributos o caracteristicas de la clase
    double base, altura;
    //Metodo constructor es el que inicializa los atributos
    public Triangulo(double base, double altura){
        this.base= base;
        this.altura=altura;
    }



    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5,10);
        System.out.println("El area del triangulo es " + triangulo.calcularArea());
    }

    @Override
    public Double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public Double calcularPerimetro() {
        return 0.0;
    }
}
