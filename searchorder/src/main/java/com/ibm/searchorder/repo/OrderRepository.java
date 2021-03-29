package com.ibm.searchorder.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.searchorder.Order;

public interface OrderRepository extends MongoRepository<Order, String> {

}
