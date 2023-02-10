package com.universedust.jpa.multi.session.db1.rep01;

import com.universedust.jpa.multi.session.db1.entity.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends JpaRepository<Human,Long> {
}
