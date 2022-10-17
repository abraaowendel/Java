package entities;

public class Student {
    public double FirstNote;
    public double SecondNote;
    public double ThirdNote;
    public double Total;

    public void Grades() {
        Total = FirstNote + SecondNote + ThirdNote;
    }

    public String PassOrFailed() {

        if (Total > 60)
            return "PASSED";

        return "FAILED\nMISSING " + (60 - Total) + " POINTS";
    }

}
