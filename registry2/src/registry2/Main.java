package registry2;
import java.util.ArrayList;

public class Main {
	static public void main(String[] args) {
		
		/*// 1. példa, Person
		Student s1 = new Student("Gipsz Jakab", "1A2B3C", 1996);
		Teacher t1 = new Teacher("Rend Elek", "Q1W2E3", 1973);
		//Person  p1 = new Person("Nagy Károly", "XXX111", 1998);

		Person p2 = s1;
		Person p3 = t1;

		System.out.println(s1); //Gipsz Jakab (1A2B3C), 1996, 0.0, 0
		System.out.println(t1); //Rend Elek (Q1W2E3), 1973, assis...
		//System.out.println(p1); //Nagy Károly (XXX111), 1998
		System.out.println(p2); //Gipsz Jakab (1A2B3C), 1996, 0.0, 0
		System.out.println(p3); //Rend Elek (Q1W2E3), 1973, assis...

		// 2. példa, kivételek
		Course c = new Course("Zabhegyezés", "BMEVIIIZZ00", 24);
		Teacher t = new Teacher("Vastagh Béla", "VSTGBL", 1975);
		c.setTeacher(t);
		try {
		  c.addStudent(new Student("Lutz Ernő", "LTZRN0",1996));
		  c.addStudent(new Student("Szőke Barna", "BRN123",1996));
		  c.addStudent(new Student("Hervadt Virág", "HRVDTV",1995));
		}  catch (CourseFullException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}/*catch (NeptunNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} */
		
		
		
		Painter a1 = new Painter("Painter", "ghj123", 2000);
		Singer a2 = new Singer("Singer", "qwe123", 2001);
		Writer a3 = new Writer("Writer", "iop123", 2002);

		ArrayList<Artist> list=new ArrayList<Artist>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).toString());
		}
	}
}
