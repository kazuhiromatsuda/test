package com.assign.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.assign.repository.AssignRepository;
import com.dorakucommitters.domain.Employee;

@Service
@Transactional
public class AssignService {
    @Autowired
    AssignRepository assignRepository;

    public List<Employee> findAll() {
        return assignRepository.findAllOrderByName();
    }

    public Employee findOne(Integer id) {
        return assignRepository.findOne(id);
    }

    public Employee create(Employee employee) {
        return assignRepository.save(employee);
    }

    public Employee update(Employee employee) {
        return assignRepository.save(employee);
    }

    public void delete(Integer id) {
        assignRepository.delete(id);
    }
}
