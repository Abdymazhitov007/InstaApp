package controllers;

import models.dto.MainContentDTO;
import models.entity.Post;
import services.PostService;
import services.impl.PostServiceImpl;

import java.util.List;

public class PostController {
    PostService postService = new PostServiceImpl();
    public void save(Post post){
        postService.save(post);
    }
    public void saveAll(List<Post> posts){
        postService.saveAll(posts);
    }
    public Post getPostById(Long id){
        return postService.getPostById(id);
    }
    public List<Post> getAll(){
        return postService.getAll();
    }
    public void deleteById(Long id){
        postService.deleteById(id);
    }
    public List<MainContentDTO> getMainContent(Long id){
        return postService.getMainContent(id);
    }
}
