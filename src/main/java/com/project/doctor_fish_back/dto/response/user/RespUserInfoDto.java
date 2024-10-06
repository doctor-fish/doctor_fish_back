package com.project.doctor_fish_back.dto.response.user;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Builder
@Data
public class RespUserInfoDto {
    private Long id;
    private String email;
    private String name;
    private String phoneNumber;
    private Set<String> roles;
}
