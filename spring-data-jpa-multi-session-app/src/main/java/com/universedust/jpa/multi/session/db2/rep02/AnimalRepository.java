package com.universedust.jpa.multi.session.db2.rep02;

import com.universedust.jpa.multi.session.db2.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,Long> {
}
