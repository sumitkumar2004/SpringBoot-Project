package com.sumit.journalApp.repository;

import com.sumit.journalApp.entity.JournalEntry;
import com.sumit.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String userName);
}
