package services.impl;

import controllers.UserController;
import models.dto.MainContentDTO;
import models.entity.Post;
import models.entity.User;
import repositroies.PostRepository;
import services.PostService;
import services.UserService;

import java.util.ArrayList;
import java.util.List;

public class PostServiceImpl implements PostService {
    PostRepository postDB = new PostRepository();

    @Override
    public void save(Post post) {
        postDB.save(post);
    }

    @Override
    public void saveAll(List<Post> posts) {
        postDB.saveAll(posts);
    }

    @Override
    public Post getPostById(Long id) {
        return postDB.findPostById(id);
    }

    @Override
    public List<Post> getAll() {
        return postDB.findAll();
    }

    @Override
    public void deleteById(Long id) {
        postDB.deleteById(id);
    }

    @Override
    public List<MainContentDTO> getMainContent(Long id) {

        UserController uController = new UserController();

        List<Post> followersPosts = new ArrayList<>();

        for (User user: uController.getUserFollowersById(id)) {
            followersPosts.addAll(user.getPosts());
        }

        List<MainContentDTO> response = new ArrayList<>();

        for (Post post: followersPosts) {
            MainContentDTO item = new MainContentDTO(
                    post.getId(),
                    post.getTitle(),
                    post.getPhotoUrl(),
                    post.getCreatedDate(),
                    post.getComments()
            );
            response.add(item);
        }
        return response;
    }
}
