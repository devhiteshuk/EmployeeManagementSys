package com.dhl.ems.post_service.service.impl;

import com.dhl.ems.post_service.service.EmsPostService;
import org.springframework.stereotype.Component;

@Component
public class EmsPostServiceImpl implements EmsPostService {

    @Override
    public void createPost(String content) {

    }

    @Override
    public String getPostById(String postId) {
        return String.format("Your post content here %s", postId);
    }

    @Override
    public void updatePost(String postId, String content) {

    }

    @Override
    public void deletePost(String postId) {

    }
}
