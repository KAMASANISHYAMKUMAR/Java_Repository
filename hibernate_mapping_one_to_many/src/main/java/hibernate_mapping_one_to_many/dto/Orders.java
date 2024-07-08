package hibernate_mapping_one_to_many.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {
	@Id
	private int id;
	private String itemName;
	private int cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", itemName=" + itemName + ", cost=" + cost + "]";
	}
	
}
