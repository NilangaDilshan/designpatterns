package com.dilshan.designPatterns.latest.creational.simplefactory;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class NewsPost extends Post {
    private String headline;
    private LocalDateTime newsTime;

    public NewsPost() {
    }

}
