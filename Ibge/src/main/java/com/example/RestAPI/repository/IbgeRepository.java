package com.example.RestAPI.repository;

import com.example.RestAPI.model.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IbgeRepository extends MongoRepository<UserEntity, String> {

}