package com.myspringproject.MyJavaApp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


        /* Instead of doing
        Vehicle obj = new Car();
        obj.drive();

        With Spring we linked the XML file inject the object which is better for performance as were only editing and saving the XML file
        Changing the java source code requires us to recompile and build the code again

        You can inject and object from the outside
         */
        Vehicle obj = (Vehicle) context.getBean("vehicle");
        obj.drive(); //Vroom Vroom

        Vehicle obj1 = (Vehicle) context.getBean("car");
        obj1.drive();// Vroom Vroom

        //-------------------------------------------------------------- Constructor Injector

        Tire tire = (Tire) context.getBean("tire");
        System.out.println(tire);

        tire.setBrand("Montana");
        tire.setCircumference(12);
        System.out.println(tire);

        //--------------------------------------------------------------  Autowired Annotation

        Engine engine = (Engine) context.getBean("engine");

        System.out.println(engine);
    }
}
