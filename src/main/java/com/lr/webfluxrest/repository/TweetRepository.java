package com.lr.webfluxrest.repository;

import com.lr.webfluxrest.model.Tweet;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rajeevkumarsingh on 08/09/17.
 */
@Repository
public interface TweetRepository extends ReactiveMongoRepository<Tweet, String> {

}
