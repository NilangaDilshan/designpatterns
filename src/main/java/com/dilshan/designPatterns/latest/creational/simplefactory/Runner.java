package com.dilshan.designPatterns.latest.creational.simplefactory;

public class Runner {
    public static void main(String[] args) {
        Post newsPost = PostFactory.createPost("news");
        newsPost.setTitle("News Title");
        System.out.println(newsPost);

        Post blogPost = PostFactory.createPost("blog");
        blogPost.setTitle("Blog Title");
        System.out.println(blogPost);

        Post productPost = PostFactory.createPost("product");
        productPost.setTitle("Product Title");
        System.out.println(productPost);
    }
}
