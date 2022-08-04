package com.neeraj.bookmarkerapi.domain;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class CreateBookmarkRequest {

    @NotEmpty(message = "Title should not be empty")
    private String title;
    @NotEmpty(message = "url should not be empty")
    private String url;
}
