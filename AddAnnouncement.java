
public class AddAnnouncement implements Command {
    private Course course;

    public AddAnnouncement(Course course){
        this.course = course;
    }

    public void execute() {
        course.PostAnnouncement();
    }
}
