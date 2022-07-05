public class Main {

    public static void main(String[] args) {
        suma(10, 20, 30);

        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();

        System.out.println(miCoche.puertas);
    }

    public static void suma(int a, int b, int c) {
        int resultado;

        resultado = a + b + c;

        System.out.println(resultado);
    }



static class Coche {
    public int puertas = 0;

    public void AgregarPuertas(){
        this.puertas++;
    }

    public void QuitarPuertas(){
        this.puertas--;
    }

        } }