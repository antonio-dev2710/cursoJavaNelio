package orientacaoObjeto;

public class Triangulo {

    private double a, b ,c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    //metodo calcular a area
    public double calcularArea(double lA,double lB,double lC){
        double p;
        double area;
        p= (lA+lB+lC)/2.0;
        area= Math.sqrt(p*(p-lA)*(p-lB)*(p-lC));
        return area;
    }

    
}
