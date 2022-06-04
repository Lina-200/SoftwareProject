
public class AddAssign implements Command {
    private Course course;

    public AddAssign(Course course){
        this.course = course;
    }

    public void execute() {
        course.AddAssignment(String assignName, String assignBody);
    }
}