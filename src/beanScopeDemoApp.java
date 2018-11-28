

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if these are the same beans
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nPointing to the same object?  " + result); // true
		
		// print out memory locations
		System.out.println("\nMemory location for theCoach: " + theCoach + "\n");
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		// close the context
		context.close();
	}

}





