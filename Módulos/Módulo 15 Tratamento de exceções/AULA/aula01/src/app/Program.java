package app;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Nº do Quarto: ");
        int number = input.nextInt();
        System.out.print("Data de entrada (DD/MM/YYYY): ");
        Date checkIn = (Date) sdf.parse(input.next());
        System.out.print("Data de saida (DD/MM/YYYY): ");
        Date checkOut = (Date) sdf.parse(input.next());

        if(!checkOut.after(checkIn)){
            System.out.println("Erro ao reservar, Saida é antes da Entrada.");
        }
        else{
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reserva: " + reservation + "\n\n");

            System.out.println("Atualize sua reserva: ");
            System.out.print("Data de entrada (DD/MM/YYYY): ");
            checkIn = (Date) sdf.parse(input.next());
            System.out.print("Data de saida (DD/MM/YYYY): ");
            checkOut = (Date) sdf.parse(input.next());
     

            Date now = new Date();

            if(checkIn.before(now) || checkOut.before(now)){
                System.out.println("Erro ao reservar, somente reservas futuras.");
            }
            else{
                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reserva: " + reservation + "\n\n");
            }
        }

        input.close();

    }
}
