package com.source.springjpa.springjpa.service;



import com.source.springjpa.springjpa.dao.StudentDao;
import com.source.springjpa.springjpa.demain.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public Students findById(int id) {

        return studentDao.findStuById(id);
    }

    @Override
    public void delete(int id) {
      studentDao.deleteById(id);
    }

    @Override
    public Students save(Students students) {
        return  studentDao.save(students);
    }

    @Override
    public Page<Students> findAll(int page, int pagesize) {
       Pageable pageable = PageRequest.of(page,pagesize);
        return studentDao.findAll(pageable);
    }

    public List<Students> findAll(){
        return  studentDao.findAll();
    }

    @Override
    public Students update(Students students) {

        return studentDao.save(students);
    }

    @Override
    public List<Students> findStuByName(String name) {
        return studentDao.findByName(name);
    }
}
