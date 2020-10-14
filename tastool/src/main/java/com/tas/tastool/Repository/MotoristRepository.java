package com.tas.tastool.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tas.tastool.domain.Motorist;

@Repository
public interface MotoristRepository extends JpaRepository<Motorist, String> {

}
