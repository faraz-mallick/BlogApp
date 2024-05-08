package com.blogapp12.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class PostDto {
    private long id;
    @NotEmpty
    @Size(min = 3, message = "Title should be at-least 3 character")
    private String title;
    @NotEmpty
    @Size(min = 3, message = "Description should be at-least 3 characters")
    private String description;
    private String content;

    @Size(min = 10, max = 10, message = "Mobile number should be 10 digits")
    private String mobile;


}
