package com.universedust.webflux.repository;

import com.universedust.webflux.entity.ReactUser;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactUserRepository extends ReactiveCrudRepository<ReactUser,Long> {
}
