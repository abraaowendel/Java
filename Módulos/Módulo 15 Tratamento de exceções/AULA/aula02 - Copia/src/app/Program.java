package app;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            
            System.out.print("Nº do Quarto: ");
            int number = input.nextInt();
            System.out.print("Data de entrada (DD/MM/YYYY): ");
            Date checkIn = sdf.parse(input.next());
            System.out.print("Data de saida (DD/MM/YYYY): ");
            Date checkOut = sdf.parse(input.next());
           
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reserva: " + reservation + "\n\n");
    
            System.out.println("Atualize sua reserva: ");
            System.out.print("Data de entrada (DD/MM/YYYY): ");
            checkIn = (Date) sdf.parse(input.next());
            System.out.print("Data de saida (DD/MM/YYYY): ");
            checkOut = (Date) sdf.parse(input.next());
        
            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reserva: " + reservation + "\n\n");
        } 
        catch (ParseException e) {
            System.out.println("Data inválida.");
        } 
        catch(IllegalArgumentException e ){
            System.out.println("Erro ao reservar: " + e.getMessage());
        }
        

        input.close();

    }
}
