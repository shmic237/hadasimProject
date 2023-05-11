package com.hadasim.assignment2.HMOMember;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HMOMemberRepository extends JpaRepository<HMOMember, Long> {

    //SELECT * FROM hmomember WHERE id = ?
   // @Query("SELECT m FROM HMOMember m WHERE m.id LIKE %?1%")
    Optional<HMOMember> findMemberById(Long id);


}
