package com.project.doctor_fish_back.dto.request;

import lombok.Data;

@Data
public class ReqSignupDto {
    private String email;
    private String password;
    private String checkPassword;
}
