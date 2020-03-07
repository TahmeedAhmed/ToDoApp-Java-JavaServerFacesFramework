import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="p")
@SessionScoped
public class Item {
	private String title;
	private String description;
	private String toDoBy;
	static ArrayList<Item> list = new ArrayList<Item>();
	
	public Item(String title, String desc, String toDoBy) {
		this.title = title;
		this.description = desc;
		this.toDoBy = toDoBy;
	}
	public Item() {
		
	}
	
	public String add() {
		System.out.println("Task added");
		list.add(new Item(this.title, this.description, this.toDoBy));
		return "index";
	}
	
	public String delete(String title, String desc, String toDoBy) {
		System.out.println("Attempting to delete Task: " + title);
		//System.out.println(title);
		for(Item item : list) {
			if(item.getTitle().equals(title) && item.getDescription().equals(desc) && item.getToDoBy().equals(toDoBy)) {
				list.remove(item);
				break;
			}
		}
		System.out.println("DRRAAAHJ" + list);
		return "index";
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String desc) {
		this.description = desc;
	}
	
	
	public String getToDoBy() {
		return this.toDoBy;
	}
	
	public void setToDoBy(String toDoBy) {
		this.toDoBy = toDoBy;
	}
	
	@SuppressWarnings("static-access")
	public ArrayList<Item> getList (){
		System.out.println(list);
		return this.list;
	}	
	
}
