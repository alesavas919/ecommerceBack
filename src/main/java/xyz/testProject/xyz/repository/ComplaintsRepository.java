package xyz.testProject.xyz.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import xyz.testProject.xyz.model.Complaints;


public interface ComplaintsRepository extends JpaRepository<Complaints,Long> {

}
