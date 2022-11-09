package app;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Nº do Quarto: ");
            int number = input.nextInt();
            System.out.print("Data de entrada (DD/MM/YYYY): ");
            Date checkIn = (Date) sdf.parse(input.next());
            System.out.print("Data de saida (DD/MM/YYYY): ");
            Date checkOut = (Date) sdf.parse(input.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reserva: " + reservation + "\n\n");
            System.out.println("Atualize sua reserva: ");
            System.out.print("Data de entrada (DD/MM/YYYY): ");
            checkIn = (Date) sdf.parse(input.next());
            System.out.print("Data de saida (DD/MM/YYYY): ");
            checkOut = (Date) sdf.parse(input.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reserva: " + reservation + "\n\n");

        } catch (DomainException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        }catch(ParseException e){
            System.out.println("Data inválida.");
        }
        catch(RuntimeException e){
        System.out.println("Unexpected error");}

        input.close();
    }
}
