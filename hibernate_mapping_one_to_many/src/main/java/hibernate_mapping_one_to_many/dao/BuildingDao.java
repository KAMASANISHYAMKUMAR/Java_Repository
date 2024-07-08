package hibernate_mapping_one_to_many.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_mapping_one_to_many.dto.Building;


public class BuildingDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("shyam").createEntityManager();
	}

    public void getById(int id) {
    	EntityManager entityManager = getEntityManager();
		Building building = entityManager.find(Building.class,id);
		if(building!=null) {
			System.out.println(building);
		}else {
			System.out.println("Id is not Present in DB");
		}
    }

    public void save(Building building) {
    	EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(building);
		entityTransaction.commit();
    }

    public void update(Building building,int id) {
    	EntityManager entityManager = getEntityManager();
    	Building dbbuilding = entityManager.find(Building.class,id);
		if(dbbuilding!=null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			building.setId(id);
			entityManager.merge(building);
			entityTransaction.commit();
		}else {
			System.out.println("Id is not Present");
		}
    }

    public void delete(int id) {
    	EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Building building = entityManager.find(Building.class,id);
		if(building!=null) {
			entityTransaction.begin();
			entityManager.remove(building);
			entityTransaction.commit();
		}else {
			System.out.println("Id is not present");
		}
    }
}
