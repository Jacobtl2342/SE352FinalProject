package com.server.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.cdi.MongoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.server.Models.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, String>{
	
}
