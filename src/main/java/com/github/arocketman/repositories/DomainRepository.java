package com.github.arocketman.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.github.arocketman.entities.Domain;



@Repository
public interface DomainRepository extends JpaRepository<Domain, Long> {

	@Query("SELECT d FROM Domain d WHERE LOWER(d.code) = LOWER(:code)")
	public Domain getDomainByCode(@Param("code") String code);
}
