package com.kantar.lookup.application.lookupapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kantar.lookup.application.lookupapplication.model.LookUp;

@Repository
public interface LookUpRepository extends JpaRepository<LookUp,Integer> {

}
