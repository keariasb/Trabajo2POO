public class Rombo {
    int lado;
    int diametroMayor;
    int diametroMenor;


    Rombo(int lado, int diametroMayor, int diametroMenor) {
        this.lado = lado;
        this.diametroMayor = diametroMayor;
        this.diametroMenor = diametroMenor;
    }


    double calcularArea() {
        return (diametroMayor * diametroMenor) / 2.0;
    }


    double calcularPerimetro() {
        return (4*lado);
    }
}
