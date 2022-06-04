
public class AddEx implements Command {
    private Course course;

    public AddEx(Course course){
        this.course = course;
    }

    public void execute() {
        course.AddExam(String ExamName, String ExamBody);
    }
}