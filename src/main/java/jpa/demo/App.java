package jpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import jpa.demo.model.Book;

public class App {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-demo-pu");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction tx = em.getTransaction();

	public static void main(String[] args) {

		Book book = new Book();
		book.setTitle("Java Persistence API");
		book.setDescription("Mastering the Java Persistence API");
		book.setIsbn("125-55458-6658-55");
		book.setUnitPrice(125.56);
		book.setQuantity(59);

		tx.begin();
		em.persist(book);
		tx.commit();

		emf.close();
	}
}
