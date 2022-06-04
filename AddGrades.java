
public class AddGrades implements Command {
    private Course course;

    public AddGrades(Course course){
        this.course = course;
    }

    public void execute() {
        course.PostGrades();
    }
}