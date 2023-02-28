package expressaoLabda.progFuncional;

import java.util.Arrays;

public class App {
    //aq n tem transparencia pois está utilizando um valor externo
    public static int globalValue = 3;
  public static void main(String[] args) {
    //Transparência referencial
    /* Uma função possui transparência referencial se seu resultado for sempre o mesmo para os mesmos dados de entrada. Benefícios: simplicidade e previsibilidade. */
    int[] vect = new int[] { 3, 4, 5 };
    changeOddValues(vect);
    System.out.println(Arrays.toString(vect));
  }

  
  public static void changeOddValues(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 != 0) {
        numbers[i] += globalValue;
      }
    }
}
}