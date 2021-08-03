package com.kantar.lookup.application.lookupapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kantar.lookup.application.lookupapplication.model.Lookup;

@Repository
public interface PanelistManagermentRepository extends JpaRepository<Lookup,Integer> {

}
