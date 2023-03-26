package expressaoLabda.exercico01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Enter full file path");

        String path="C://temp/in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line!=null) {
                String[]fields =line.split(",");

                list.add(new Product(fields[0],Double.parseDouble(fields[1])));

                line=br.readLine();
            }

            double avg = list.stream().map(p->p.getPrice()).reduce(0.0, (x,y)->x+y)/list.size();

            System.out.println("Average price:"+String.format("%.2f", avg));

            //colocar em ordem decescente utilizano o comparaitor
            Comparator<String> comp = (s1,s2)->s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names=list.stream().filter(p->p.getPrice()<avg).map(p->p.getName()).sorted(comp.reversed()).collect(Collectors.toList());

            names.forEach(System.out::println);
            
        } catch (Exception e) {
            // TODO: handle 
            System.out.println(e.getLocalizedMessage());
        }
    }
}
