package com.dhl.ems.notification_service.controller;

import com.dhl.ems.notification_service.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notifications")
public class NotificationController {
    private NotificationService notificationService;

    @Autowired
    NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    // Define endpoints for the EMS Notification Controller

    // Example endpoint to send a notification
    // @PostMapping
    // public ResponseEntity<?> sendNotification(@RequestBody NotificationRequest notificationRequest) {
    //     // Logic to send a notification
    //     return ResponseEntity.status(HttpStatus.CREATED).build();
    // }


    @GetMapping("/{notificationId}")
    public ResponseEntity<?> getNotificationById(@PathVariable String notificationId) {
        // Logic to get a notification by ID
        String notificationContent = notificationService.getNotificationById(notificationId);
        return ResponseEntity.ok(notificationContent);
    }

}