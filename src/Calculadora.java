public class Calculadora {
    private int firstNumber;
    private int secondNumber;

    public Calculadora(int a, int b) {
        this.firstNumber = a;
        this.secondNumber = b;
    }

    public void sumar() {
        System.out.println("Resultado suma: " + (firstNumber + secondNumber));
    }

    public void restar() {
        System.out.println("Resultado resta: " + (firstNumber - secondNumber));
    }

    public void sumar(int a, int b) {
        System.out.println("Resultado suma: " + (a + b));
    }

    public void restar(int a, int b) {
        System.out.println("Resultado resta: " + (a - b));
    }

    public void realizarOperacion(int codigoOperacion) {
        switch (codigoOperacion) {
            case 1:
                this.sumar();
                break;

            case 2:
                this.restar();
                break;
        }
    }

    // getters setters
    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

}
