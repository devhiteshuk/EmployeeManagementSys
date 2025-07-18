package com.dhl.ems.post_service.service;

import org.springframework.stereotype.Service;

@Service
public interface EmsPostService {

    // Define methods for the EMS Post Service
    void createPost(String content);

    String getPostById(String postId);

    void updatePost(String postId, String content);

    void deletePost(String postId);

    // Additional methods can be added as needed
}
