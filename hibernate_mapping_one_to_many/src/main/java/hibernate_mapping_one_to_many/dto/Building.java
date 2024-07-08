package hibernate_mapping_one_to_many.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Building {
	@Id
    private int id;
    private String name;
    
    @OneToMany
    private List<Floors> floors;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Floors> getFloors() {
		return floors;
	}

	public void setFloors(List<Floors> floors) {
		this.floors = floors;
	}

	@Override
	public String toString() {
		return "Floors [id=" + id + ", name=" + name + ", floors=" + floors + "]";
	}
    
}

