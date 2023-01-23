package Execoes.execPersonalizadas.programExcp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Execoes.execPersonalizadas.model.entetis.Reservation;
import Execoes.execPersonalizadas.model.expet.DomainException;

public class ProgramHotelBad {
    // lança a excessao dentro do metodo main sendo propagada no ParseException
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int number = sc.nextInt();

        System.out.println("Check-in date (dd/MM/yyyy) ");
        Date checkIn = sdf.parse(sc.next());

        System.out.println("Check-in date (dd/MM/yyyy) ");
        Date checkOut = sdf.parse(sc.next());

        Reservation reservation = new Reservation(number, checkIn, checkOut);

        System.out.println(reservation);

        System.out.println();
        System.out.println("Enter date to update the reservation: ");

        System.out.println("Check-in date (dd/MM/yyyy) ");

        checkIn = sdf.parse(sc.next());

        System.out.println("Check-out date (dd/MM/yyyy) ");
        checkOut = sdf.parse(sc.next());

        
            reservation.updateDates(checkIn, checkOut);
         

        System.out.println(reservation);
        }

        catch(ParseException e){
            System.out.println("Invalid date format");


        }
        catch (DomainException e) {
            // TODO Auto-generated catch block
            //getMessage captura a messagem do lançamento da exceção
            System.out.println("Error in reservation: "+e.getMessage());
            
        }
        //qualquer outra excessoa inesperada 
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }

        

        sc.close();
    }
}
