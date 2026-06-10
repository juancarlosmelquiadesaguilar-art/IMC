
public class NewClass {
    public double CalculaIndice(double pesoo, double alturaa) {

        double ind = pesoo / (alturaa * alturaa);

        return ind;
    }

    public String CalculaInterpretacion(double ind) {

        if (ind < 18.5) {
            return "Bajo de peso";
        }
        else if (ind < 25) {
            return "Peso normal";
        }
        else if (ind < 30) {
            return "Sobrepeso";
        }
        else {
            return "Obesidad";
        }
    }
}
