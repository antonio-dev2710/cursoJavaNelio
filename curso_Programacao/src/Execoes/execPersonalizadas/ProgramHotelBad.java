package Execoes.execPersonalizadas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Execoes.execPersonalizadas.model.entetis.Reservation;

public class ProgramHotelBad {
    // lança a excessao dentro do metodo main sendo propagada no ParseException
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int number = sc.nextInt();

        System.out.println("Check-in date (dd/MM/yyyy) ");

        Date checkIn = sdf.parse(sc.next());

        System.out.println("Check-in date (dd/MM/yyyy) ");

        Date checkOut = sdf.parse(sc.next());
        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);

            System.out.println(reservation);

            System.out.println();
            System.out.println("Enter date to update the reservation: ");

           
            System.out.println("Check-in date (dd/MM/yyyy) ");

            checkIn = sdf.parse(sc.next());

            System.out.println("Check-out date (dd/MM/yyyy) ");
            checkOut = sdf.parse(sc.next());

            String error = reservation.updateDates(checkIn, checkOut);
            if(error!=null){
                System.out.println("Error in reservation: " + error);
            }
            else{
                System.out.println(reservation);
            }
           

        }

        sc.close();
    }
}
