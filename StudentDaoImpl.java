package com.springjdbc.dao;

import com.springjdbc.Student;
import com.springjdbc.StudentRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  // DAO layer component
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        String query = "INSERT INTO Student(id, name, city) VALUES (?, ?, ?)";
        return jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
    }

    @Override
    public List<Student> getAllStudents() {
        String query = "SELECT * FROM Student";
        return jdbcTemplate.query(query, new StudentRowMapper());
    }
}
