package orientacaoObjeto;

public class Calculator {
    private static double PI =3.14159;

    public static double circumference(double radius){
        return 2.0*PI*radius;

    }

    public static double valume(double radius){
        return 4.0*PI*radius*radius*radius/3.0;
        
    }
}
