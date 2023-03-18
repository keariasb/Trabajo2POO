public class Trapecio {
    int baseMayor;
    int baseMenor;
    int altura;


    Trapecio(int baseMayor, int baseMenor, int altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }


    double calcularArea() {
        return ((baseMayor + baseMenor) / 2.0)*altura;
    }


    double calcularPerimetro() {
        return baseMenor + baseMayor + 2*Math.sqrt(Math.pow((baseMayor-baseMenor)/2.0,2) + Math.pow(altura,2)) ;
    }
}
