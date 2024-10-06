package com.project.doctor_fish_back.repository;

import com.project.doctor_fish_back.entity.Role;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMapper {
    Role findByName(String name);
    int save(Role role);

}
