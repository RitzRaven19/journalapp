package com.example.journalapp.Repository;

import com.example.journalapp.Entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {

}
