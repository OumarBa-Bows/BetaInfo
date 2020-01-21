package com.devfam.BetaInfo.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.devfam.BetaInfo.entites.Information;

public interface InformationRepository extends JpaRepository<Information, Integer> {
	
		@Query("select i from Information i where i.libele like :x")
		List<Information> listerParMotCle(@Param("x")String mc);
		
		void updateInformation(Information inf);
		
}
 