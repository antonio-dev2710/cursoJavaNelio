package Execoes.execPersonalizadas.model.expet;

public class DomainException extends RuntimeException {
    //RuntimeException o compilador não obriga a tratar
    //Exception obriga a realizar o tratamento

    //Instanciar a minha versão personalizada passando uma msg pra Domiain ficandoa armazenado dentro da função
    public DomainException(String msg){
        super(msg);
    }


}
