package com.server.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Items")
public class Item {
	@Id
	private String id;

    private String restaurant_id;
    private String name;
    private String description;
    private String imagePath;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRestaurant_id() {
		return restaurant_id;
	}
	public void setRestaurant_id(String restaurant_id) {
		this.restaurant_id = restaurant_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
    
	@Override
    public String toString() {
        return String.format(
                "Item[id=%s, name='%s', description='%s', description='%s']",
                id, name, description, imagePath);
    }
    
}
