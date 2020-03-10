package registry2;

public class CourseException extends Exception {
	private Course course;
	
	public CourseException(String message,Course course) {
		super(message);
		this.course = course;
	}
	
	public String getMessage() {
		return  super.getMessage() + "\nkurzus: " +  course.toString();
	}
}
