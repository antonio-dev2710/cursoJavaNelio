package comportamentoMemoria;

public class Ex {

  public static void main(String[] args) {
    //o compilador verifica se a variavel foi ou n iniciada
    //tipo primitiovo instaciado na memoria stack e tipo referencia(classe)
    //no heap
    int p =10;
    //calsse-garbage coletar verifica o heap e desaloca os objetos que n estão sendo utilizados
    //tipo primitio-São desalocado imediatamente quando o escopo de execução é finalizado
    System.out.println(p);
  }
}
