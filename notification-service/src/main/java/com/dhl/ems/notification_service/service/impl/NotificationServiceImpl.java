package com.dhl.ems.notification_service.service.impl;

import com.dhl.ems.notification_service.service.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class NotificationServiceImpl implements NotificationService {

    @Override
    public void sendNotification(String message) {
        // Here you would implement the logic to send a notification
    }

    @Override
    public String getNotificationById(String notificationId) {
        return String.format("Your notification content here %s", notificationId);
    }

    @Override
    public void updateNotification(String notificationId, String message) {
        // Here you would implement the logic to update a notification
    }

    @Override
    public void deleteNotification(String notificationId) {
        // Here you would implement the logic to delete a notification
    }
}
