package com.dilshan.designPatterns.latest.creational.simplefactory;

public class PostFactory {

    public static Post createPost(String type){
        switch (type){
            case "news":
                return new NewsPost();
            case "blog":
                return new BlogPost();
            case "product":
                return new ProductPost();
            default:
                throw new IllegalArgumentException("Post type is unknown");
        }
    }
}
