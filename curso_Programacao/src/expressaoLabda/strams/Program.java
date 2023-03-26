package expressaoLabda.strams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,4,5,10,7);

        //o map aplica uma função para cada elemento da minha stream
        Stream<Integer> st1 = list.stream().map(x->x*10);

        //toArray coverte a minha stream para vetor
        System.out.println(Arrays.toString(st1.toArray()));

        //Streams de Strings
        Stream<String> st2 = Stream.of("Maria","Alex","Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        //funcao de interacao
        //passar o primero elemento da stream 
        Stream<Integer> st3 = Stream.iterate(0, x->x+2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        //fibo
        //o proximo elemento é a soma dos dois anteriores
        Stream<Long> st4 = Stream.iterate(new Long[]{0L,1L},p-> new Long[]{p[1], p[0]+p[1]}).map(p->p[0]);

        System.out.println(Arrays.toString(st4.limit(10).toArray()));
    }
}
