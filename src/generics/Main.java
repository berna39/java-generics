package generics;

import generics.models.Student;
import generics.models.Teacher;
import generics.service.Printer;
import generics.service.StudentPrinter;
import generics.service.TeacherPrinter;

public class Main {
	public static void main(String[] args) {

		StudentPrinter studentPrinter = new StudentPrinter(new Student("Shango", 20, "CS"));
		studentPrinter.print();

		TeacherPrinter teacherPrinter = new TeacherPrinter(new Teacher("Lucien", 40, "Math"));
		teacherPrinter.print();

		/*
		* 	now as StudentPrinter and TeacherPrinter are quite similar, we can create a Printer service
		*  	that can Handle both types Student and Teacher
		*/

		Printer<Teacher> printer = new Printer<>(new Teacher("Ghost", 34, "Android"));
		printer.print(); // bingo
		Printer<Student> printerStud = new Printer<>(new Student("Johnny", 24, "RO"));
		printerStud.print(); // bingo

		/*
		* 	now as we've seen that the printer service works well, now let's try to call the sayHello method 
		*	from both classes
		*	
		*   I shoould first update the Printer service and add T extends Person so that I may access to the sayhello method
		*/

		Printer<?> p = new Printer<>(new Student("GloDi", 24, "CS")); // here I use a wildcart ?
		p.printHello();

		/*
		* 	as we love distributed systems :), let's serialize our Printer service
		*	we've updated the Printer class setting Printer<T extends Person & Serializable>
		*/
	}
}
