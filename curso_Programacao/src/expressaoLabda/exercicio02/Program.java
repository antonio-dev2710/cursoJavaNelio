package expressaoLabda.exercicio02;

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

        String path="C://temp/in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            List<Dados> list = new ArrayList<>();
            String line =br.readLine();
            while (line!=null) {
                String[] fields =line.split(",");

                list.add(new Dados(fields[0], fields[1], Double.parseDouble(fields[2])));

                line=br.readLine();
                
                
            }
            System.out.println(" Enter Salary: ");
            Double salary=2000.00;
            

            System.out.println("Email of people whose salry is more than 2000.00");

            Comparator<String> comp =(s1,s2)->  s1.compareTo(s2);

            List<String>emails=list.stream().filter(p->p.getSalario()>salary).map(p->p.getEmail()).sorted(comp).collect(Collectors.toList());

           double sum= list.stream().filter(p->p.getName().charAt(0)=='M').map(p->p.getSalario()).reduce(0.0,(x,y)->x+y);

            emails.forEach(System.out::println);

            System.out.println("total only 'M'");
            System.out.println(sum);

            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
