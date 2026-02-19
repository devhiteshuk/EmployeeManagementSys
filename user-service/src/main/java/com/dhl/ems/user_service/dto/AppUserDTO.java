package com.dhl.ems.user_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppUserDTO {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String role; // e.g., ADMIN, USER, etc.
    private boolean isActive; // Indicates if the user account is active
}
