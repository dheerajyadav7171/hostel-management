package com.hms.HostelManagement.repository;

import com.hms.HostelManagement.model.HostelRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HostelRegistrationRepository {
    @Autowired
    private JdbcTemplate template;

    public List<HostelRegistration> getAllRegisteredHostels(){
        String sql = "select * from hostel_registration";
        return template.query(sql, new BeanPropertyRowMapper<>(HostelRegistration.class));
    }

    public void createHostelRegistration(HostelRegistration hr){
        String sql = "insert into hostel_registration(hostel_id,session_id,room_count) values (?, ?, ?)";
        template.update(sql,hr.getHostelId(),hr.getSessionId(),hr.getRoomCount());
    }}
