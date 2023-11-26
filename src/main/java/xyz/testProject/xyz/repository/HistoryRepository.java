package xyz.testProject.xyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.testProject.xyz.model.History;


public interface HistoryRepository extends JpaRepository<History, Long>{

}
