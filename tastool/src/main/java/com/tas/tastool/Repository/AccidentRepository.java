package com.tas.tastool.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tas.tastool.domain.Accident;

@Repository
public interface AccidentRepository extends JpaRepository<Accident, Long> {

}
 