package Exer_04.entities;

public class Aluno {

    public String name;

    public Double grade1;
    public Double grade2;
    public Double grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }
    public double missingPoint() {
        if (finalGrade() < 60) {
            return 60.0 - finalGrade();
        }
        else {
            return 0.0;
        }
    }

}
