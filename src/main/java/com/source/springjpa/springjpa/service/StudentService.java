package com.source.springjpa.springjpa.service;


import com.source.springjpa.springjpa.demain.Students;
import org.springframework.data.domain.Page;

import java.util.List;

public interface StudentService {
    Students findById(int id);
    void delete(int id);
    Students save(Students students);
    Page<Students> findAll(int page,int pagesize);
    Students update(Students students);
    List<Students> findStuByName(String name);
}
