package registry2;

public class CourseFullException extends CourseException{
	public CourseFullException(Course course) {
		super("Tele van",course);
	}
}
