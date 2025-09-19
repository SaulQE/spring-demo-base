package com.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class PostDto
{
    private Integer id;
    private String title;
    private String body;
    private Integer userId;
}
