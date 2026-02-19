package com.dhl.ems.user_service.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "app_users")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email_id", nullable = false, unique = true)
    private String email;

    @Column(name = "role", nullable = false)
    private String role; // e.g., ADMIN, USE

    @Column(name = "is_active")// R, etc.
    private boolean isActive;

    @Column(name = "created_at", updatable = false)// Indicates if the user account is active
    private LocalDateTime createdAt; // Timestamp of when the user was created

    @Column(name = "updated_at")
    private LocalDateTime updatedAt; // Timestamp of when the user was last updated

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
}
