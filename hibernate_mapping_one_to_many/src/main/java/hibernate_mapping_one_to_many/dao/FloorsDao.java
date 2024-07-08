package hibernate_mapping_one_to_many.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_mapping_one_to_many.dto.Floors;

public class FloorsDao {
		public EntityManager getEntityManager() {
			return Persistence.createEntityManagerFactory("shyam").createEntityManager();
		}

	    public void getById(int id) {
	    	EntityManager entityManager = getEntityManager();
			Floors floor = entityManager.find(Floors.class,id);
			if(floor!=null) {
				System.out.println(floor);
			}else {
				System.out.println("Id is not Present in DB");
			}
	        
	    }

	    public void save(Floors floor) {
	    	EntityManager entityManager = getEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(floor);
			entityTransaction.commit();
	    }

	    public void update(Floors floor,int id) {
	    	EntityManager entityManager = getEntityManager();
			Floors dbfloors = entityManager.find(Floors.class,id);
			if(dbfloors!=null) {
				EntityTransaction entityTransaction = entityManager.getTransaction();
				entityTransaction.begin();
				floor.setId(id);
				entityManager.merge(floor);
				entityTransaction.commit();
			}else {
				System.out.println("Id is not Present");
			}
	    }

	    public void delete(int id) {
	    	EntityManager entityManager = getEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			Floors floor = entityManager.find(Floors.class,id);
			if(floor!=null) {
				entityTransaction.begin();
				entityManager.remove(floor);
				entityTransaction.commit();
			}else {
				System.out.println("Id is not present");
			}
	    }
}
