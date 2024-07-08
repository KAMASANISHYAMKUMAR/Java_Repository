package hibernate_mapping_one_to_many.cont;

import java.util.ArrayList;
import java.util.List;

import hibernate_mapping_one_to_many.dao.BuildingDao;
import hibernate_mapping_one_to_many.dao.FloorsDao;
import hibernate_mapping_one_to_many.dto.Building;
import hibernate_mapping_one_to_many.dto.Floors;

public class BuildingFloorCont {

	public static void main(String[] args) {
		Building building=new Building();
		building.setId(1);
		building.setName("java");


		Floors floor1=new Floors();
		floor1.setId(1);
		floor1.setName("floor1");
		
		Floors floor2=new Floors();
		floor2.setId(1);
		floor2.setName("floor1");
		
		Floors floor3=new Floors();
		floor3.setId(1);
		floor3.setName("floor1");
	
		List<Floors> floors=new ArrayList<Floors>();
		floors.add(floor1);
		floors.add(floor2);
		floors.add(floor3); 
	
		building.setFloors(floors);
		
		BuildingDao buildingDao = new BuildingDao();
		FloorsDao floorsDao = new FloorsDao();
		
		buildingDao.save(building);
		floorsDao.save(floor1);
		floorsDao.save(floor2);
		floorsDao.save(floor3);
		
		
	}

}
