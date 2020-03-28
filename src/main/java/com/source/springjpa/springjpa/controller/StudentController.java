package com.source.springjpa.springjpa.controller;


import com.source.springjpa.springjpa.demain.Students;
import com.source.springjpa.springjpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/reg")
    public Students reg(Students students){
      return  studentService.save(students);
    }
    @GetMapping("/findAll")
    public Page<Students> findAll(Integer page, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin","*");
       if(page==null||page<=0){
           page = 0;
       }else {
           page -= 1;
       }
        return  studentService.findAll(page,5);
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        studentService.delete(id);
        return "sucesss";
    }

    /**
     *
     * @param students
     * @return
     */
    @PostMapping("/update")
    public Students update(Students students){
        return studentService.save(students);
    }
    @GetMapping("/select/{id}")
    public  Students select(@PathVariable int id)throws Exception{
       return studentService.findById(id);
    }
    @GetMapping("/findByName/{name}")
    public List<Students> findByName(@PathVariable String name){
        return studentService.findStuByName(name);
    }

}
