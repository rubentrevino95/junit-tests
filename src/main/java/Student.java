import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    static int counter;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }
    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

//  ADD GRADE
    public void addGrade(int grade) {
        grades.add(grade);
    }

//  AVERAGE
    public double getGradeAverage() {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum/grades.size();
    }

    //  CONSTRUCTOR
    public Student(long id, String name) {
        this.id = id;
        counter++;
        this.name = name;
        this.grades = new ArrayList<>();
        id = counter;
    }





    // adds the given grade to the grades property
    // returns the average of the students grades
    //  MAIN
    public static void main(String[] args) {
        Student student1 = new Student(1,"John");
        student1.addGrade(100);
        student1.addGrade(100);
        student1.addGrade(95);
        student1.addGrade(100);
        System.out.println(student1.getGradeAverage());
    }
}
