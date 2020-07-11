package org.junngo.spring.springboot.service;

import lombok.RequiredArgsConstructor;
import org.junngo.spring.springboot.domain.posts.PostsRepository;
import org.junngo.spring.springboot.web.dto.PostsSaveRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
