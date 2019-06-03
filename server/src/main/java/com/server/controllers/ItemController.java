package com.server.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.Models.Item;
import com.server.Repositories.ItemRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ItemController {
	
	@Autowired
	ItemRepository itemRepository;
	
	@GetMapping("/items")
	public List<Item> getAllItems(){
		System.out.println(itemRepository.findAll());
		return itemRepository.findAll();
	}
}
