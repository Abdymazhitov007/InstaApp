package services;

import models.dto.MainContentDTO;
import models.entity.Post;

import java.util.List;

public interface PostService {

    void save(Post post);
    void saveAll(List<Post> posts);
    Post getPostById(Long id);
    List<Post> getAll();
    void deleteById(Long id);
    List<MainContentDTO> getMainContent(Long id);

}
