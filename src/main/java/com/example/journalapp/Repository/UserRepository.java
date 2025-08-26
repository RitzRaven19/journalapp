package com.example.journalapp.Repository;

import com.example.journalapp.Entity.JournalEntry;
import com.example.journalapp.Entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String username);
}