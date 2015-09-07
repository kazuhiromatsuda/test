package com.assign.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dorakucommitters.domain.Employee;

public interface AssignRepository extends JpaRepository<Employee, Integer> {
    @Query("SELECT x FROM Employee x ORDER BY x.id, x.userName")
    List<Employee> findAllOrderByName();

    @Query("SELECT x FROM Employee x ORDER BY x.id, x.userName")
    Page<Employee> findAllOrderByName(Pageable pageable);
}
