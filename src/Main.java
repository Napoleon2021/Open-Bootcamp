public class main {
    public static void main(String[] args) {
    // instanciar Objeto Coche
    Coche coche = new Coche();
        System.out.println(coche.velocidadActual);
    coche.acelerar();
        System.out.println(coche.velocidadActual);

    }
}

class Coche {
    int nroPuertas;
    int velocidadMax;
    float velocidadActual;


    public void acelerar() {
        velocidadActual += 15;
    }

}
