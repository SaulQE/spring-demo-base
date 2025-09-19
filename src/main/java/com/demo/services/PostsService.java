package com.demo.services;

import com.demo.dto.PostDto;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class PostsService {

    private final WebClient webClient;

    public PostsService(WebClient webClient){
        this.webClient = webClient;
    }

    public Mono<PostDto> save(PostDto postDto){
        return webClient.post().uri("/posts").bodyValue(postDto).retrieve().bodyToMono(PostDto.class);
    }

}
