package com.hadasim.assignment2.HMOMember;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HMOMemberRepository extends JpaRepository<HMOMember, Long> {

    Optional<HMOMember> findMemberById(Long id);


}
