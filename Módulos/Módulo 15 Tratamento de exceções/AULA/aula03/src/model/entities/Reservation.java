package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Erro: Saida deve ser em data posterior a entrada.");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long durantion() {
        long diff = checkOut.getTime() - checkIn.getTime();
        System.out.println(diff + " MILISEGUNDOS");
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) throws DomainException {

        Date now = new Date();

        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Erro ao reservar, somente reservas futuras.");
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Erro: Saida deve ser em data posterior a entrada.");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Quarto " + roomNumber + ", ");
        sb.append("Entrada: " + sdf.format(checkIn) + ", ");
        sb.append("Saida: " + sdf.format(checkOut) + ", ");
        sb.append("Duração: " + durantion() + " noites.");
        return sb.toString();
    }
}
