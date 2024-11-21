public class Student {
    int numberbilet;
    String name;
    String familia;
    int yearseducation;
    double math;
    double economy;
    double Angl;
    double res;

    Student(int numberbilet, String name, String familia, int yearseducation, double math, double economy, double Angl, double res) {
        this.numberbilet = numberbilet;
        this.name = name;
        this.familia = familia;
        this.yearseducation = yearseducation;
        this.math = math;
        this.economy = economy;
        this.Angl = Angl;
        this.res = res;
    }

    Student(String name, String familia, int yearseducation, double math, double economy, double Angl, double res) {
        this(0, name, familia, yearseducation, math, economy, Angl, res);

    }

   
}


