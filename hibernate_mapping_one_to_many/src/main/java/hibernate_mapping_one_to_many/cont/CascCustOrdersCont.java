package hibernate_mapping_one_to_many.cont;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_mapping_one_to_many.dto.Customer;
import hibernate_mapping_one_to_many.dto.Orders;

public class CascCustOrdersCont {

	public static void main(String[] args) {
		Orders orders1 = new Orders();
		orders1.setId(1);
		orders1.setItemName("chickenwings");
		orders1.setCost(60);
		
		Orders orders2 = new Orders();
		orders2.setId(2);
		orders2.setItemName("chickendrumstickes");
		orders2.setCost(80);
		
		Orders orders3 = new Orders();
		orders3.setId(3);
		orders3.setItemName("chickenbiryani");
		orders3.setCost(180);
		
		List<Orders> order1 = new ArrayList<Orders>();
		order1.add(orders1);
		order1.add(orders2);
		order1.add(orders3);
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setCustName("sunil");
		customer.setBill(2000);
		customer.setOrders(order1);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shyam");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(customer);
		entityManager.persist(orders1);
		entityManager.persist(orders2);
		entityManager.persist(orders3);
		entityTransaction.commit();

	}

}
