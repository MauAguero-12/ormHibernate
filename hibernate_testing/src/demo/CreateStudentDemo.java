package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import entities.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
		
		SessionFactory factory = conf.addAnnotatedClass(Student.class).buildSessionFactory(builder.build());
		
		Session session = factory.getCurrentSession();
		
		try {
			//crear estudiante
			Student tempStudent = new Student("Rodrigo", "Nuñez", "vsurak@gmail.com");
			
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




