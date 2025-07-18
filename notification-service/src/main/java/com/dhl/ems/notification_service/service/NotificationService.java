package com.dhl.ems.notification_service.service;

import org.springframework.stereotype.Service;

@Service
public interface NotificationService {
    // Define methods for the EMS Notification Service
    void sendNotification(String message);

    String getNotificationById(String notificationId);

    void updateNotification(String notificationId, String message);

    void deleteNotification(String notificationId);

    // Additional methods can be added as needed
}
