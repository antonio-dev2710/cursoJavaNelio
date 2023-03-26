package expressaoLabda.pipelines;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,10,7);
                                    //aplicao intermediaria
        Stream<Integer> st1 = list.stream().map(x->x*10);
                                        //aplicacao terminal
        System.out.println(Arrays.toString(st1.toArray()));

        //o reduce pega o elemento inicial que é o elemento neutro da operação e depois uma função q recebe dois argumentos e gera o resultado
        int sum = list.stream().reduce(0, (x,y)-> x+y);

        System.out.println(sum);

        List<Integer> newList = list.stream().filter(x->x%2==0).map(x->x*10).collect(Collectors.toList());

        System.out.println(Arrays.toString(newList.toArray()));
    }
}
