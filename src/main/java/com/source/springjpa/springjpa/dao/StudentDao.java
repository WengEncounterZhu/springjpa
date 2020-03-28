package com.source.springjpa.springjpa.dao;

import com.source.springjpa.springjpa.demain.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentDao extends JpaRepository<Students,Integer> {
    Students findStuById(int id);
    @Query(name = "findByName",nativeQuery = true,value =
            "select * from t_stu where name = :name")
    List<Students> findByName(@Param("name")String name);
}
