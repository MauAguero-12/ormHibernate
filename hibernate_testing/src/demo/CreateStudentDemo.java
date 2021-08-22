package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import entities.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		System.out.println("1");
		
		Configuration conf = new Configuration().configure("hibernate.cfg.xml");
		
		System.out.println("2");
		
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
		
		System.out.println("3");
		
		SessionFactory factory = conf.addAnnotatedClass(Student.class).buildSessionFactory(builder.build());
		
		Session session = factory.getCurrentSession();
		
		try {
			//crear estudiante
			Student tempStudent = new Student(1, "Rodrigo", "Nuñez", "vsurak@gmail.com");
			
			//iniciar transaccion
			session.beginTransaction();
			
			//guardar el estudiante
			session.save(tempStudent);
			
			//commit
			session.getTransaction().commit();
			System.out.println("Estudiante añadido");
		}
		finally {
			factory.close();
		}
	}

}




