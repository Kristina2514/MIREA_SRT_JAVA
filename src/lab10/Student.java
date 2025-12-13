package lab10;

public class Student {
    private String Name;
    private String Surname;
    private String Job;
    private int kurs;
    private String grup;
    private double GPA;

    public Student(String Name, String Surname, String Job,
                   int kurs, String grup, double GPA) {
        this.Name = Name;
        this.Surname = Surname;
        this.Job = Job;
        this.kurs = kurs;
        this.grup = grup;
        this.GPA = GPA;
    }

    public String getName() {return Name;}
    public void setName(String Name) {this.Name = Name;}

    public String getSurname() {return Surname;}
    public void setSurname(String Surname) {this.Surname = Surname;}

    public String getJob() {return Job;}
    public void setJob(String Job) {this.Job = Job;}

    public int getkurs() {return kurs;}
    public void setkurs(int kurs) {this.kurs = kurs;}

    public String getgrup() {return grup;}
    public void setgrup(String grup) {this.grup = grup;}

    public double getGPA() {return GPA;}
    public void setGPA(double GPA) {this.GPA = GPA;}

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-15s %-2d %-6s %.2f",
                Name, Surname, Job, kurs, grup, GPA);
    }
}
