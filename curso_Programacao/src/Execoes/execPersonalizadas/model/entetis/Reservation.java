package Execoes.execPersonalizadas.model.entetis;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private int roomNumber;
    private Date checkIn;
    private Date checkOut;

    //formartar data
    //esta sendo estatico para n gerar mais de um sdf cada vez que for instaciado o bojeto resevation
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(int roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    // calcular a diferença entre datas
    // utilizar do tipo long, retorna um valo long
    public long duration() {
        // calcular a diferença das datas em milisegundo
        long diff = checkOut.getTime() - checkIn.getTime();
        // converter milisegundos para dias
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

    }

    public void updateDates(Date checkIn, Date checkOut){
        this.checkIn=checkIn;
        this.checkOut=checkOut;

    }

    @Override
    public String toString() {
        return "Reservation [roomNumber=" + roomNumber + ", checkIn=" + sdf.format(checkIn) + ", checkOut=" + sdf.format(checkOut) +" "+ duration()+" nights"+ "]";
    }

    

}
