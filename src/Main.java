import controllers.PostController;
import controllers.UserController;
import models.entity.Post;
import models.entity.User;
import models.enums.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*User user1 = new User();
        user1.setId(1L);
        user1.setCreatedDate(LocalDateTime.of(2000, 11,21,10,10));
        user1.setUpdatedDate(LocalDateTime.of(2000, 11,21,10,10));
        user1.setStatus(Status.ACTIVE);
        user1.setUsername("abdykadyr");
        user1.setFullName("Abdykadyr Abdymazhitov");
        user1.setBirthDay(LocalDate.of(2005,4,21));


        User user2 = new User();
        user2.setId(2L);
        user2.setCreatedDate(LocalDateTime.of(2000, 11,21,10,10));
        user2.setUpdatedDate(LocalDateTime.of(2000, 11,21,10,10));
        user2.setStatus(Status.ACTIVE);
        user2.setUsername("abdymanap");
        user2.setFullName("Abdymanap Abdymazhitov");
        user2.setBirthDay(LocalDate.of(2006,10,21));



        User user3 = new User();
        user3.setId(3L);
        user3.setCreatedDate(LocalDateTime.of(2000, 11,21,10,10));
        user3.setUpdatedDate(LocalDateTime.of(2000, 11,21,10,10));
        user3.setStatus(Status.ACTIVE);
        user3.setUsername("aika");
        user3.setFullName("Aigerim Abdymazhitova");
        user3.setBirthDay(LocalDate.of(2012,9,7));

        User user4 = new User();
        user4.setId(4L);
        user4.setCreatedDate(LocalDateTime.of(2000, 11,21,10,10));
        user4.setUpdatedDate(LocalDateTime.of(2000, 11,21,10,10));
        user4.setStatus(Status.ACTIVE);
        user4.setUsername("abdykerim");
        user4.setFullName("Abdykerim Abdymazhitov");
        user4.setBirthDay(LocalDate.of(2014,7,3));

        User user5 = new User();
        user5.setId(5L);
        user5.setCreatedDate(LocalDateTime.of(2000, 11,21,10,10));
        user5.setUpdatedDate(LocalDateTime.of(2000, 11,21,10,10));
        user5.setStatus(Status.ACTIVE);
        user5.setUsername("amina");
        user5.setFullName("Amina Abdymazhitova");
        user5.setBirthDay(LocalDate.of(2016,6,30));




        Post post1 = new Post();
        post1.setId(1L);
        post1.setCreatedDate(LocalDateTime.of(2001,10,10,10,10));
        post1.setUpdatedDate(LocalDateTime.of(2001,10,10,10,10));
        post1.setStatus(Status.ACTIVE);
        post1.setTitle("photo-1");
        post1.setUser(user1);
        post1.setPhotoUrl("url-1");


        Post post2 = new Post();
        post2.setId(2L);
        post2.setCreatedDate(LocalDateTime.of(2002,10,10,10,10));
        post2.setUpdatedDate(LocalDateTime.of(2002,10,10,10,10));
        post2.setStatus(Status.ACTIVE);
        post2.setTitle("photo-2");
        post2.setUser(user2);
        post2.setPhotoUrl("url-2");


        Post post3 = new Post();
        post3.setId(3L);
        post3.setCreatedDate(LocalDateTime.of(2003,10,10,10,10));
        post3.setUpdatedDate(LocalDateTime.of(2003,10,10,10,10));
        post3.setStatus(Status.ACTIVE);
        post3.setTitle("photo-3");
        post3.setUser(user3);
        post3.setPhotoUrl("url-3");


        Post post4 = new Post();
        post4.setId(4L);
        post4.setCreatedDate(LocalDateTime.of(2004,10,10,10,10));
        post4.setUpdatedDate(LocalDateTime.of(2004,10,10,10,10));
        post4.setStatus(Status.ACTIVE);
        post4.setTitle("photo-4");
        post4.setUser(user4);
        post4.setPhotoUrl("url-4");


        Post post5 = new Post();
        post5.setId(5L);
        post5.setCreatedDate(LocalDateTime.of(2005,10,10,10,10));
        post5.setUpdatedDate(LocalDateTime.of(2005,10,10,10,10));
        post5.setStatus(Status.ACTIVE);
        post5.setTitle("photo-5");
        post5.setUser(user5);
        post5.setPhotoUrl("url-5");





        user1.setPosts(List.of(post1));
        user2.setPosts(List.of(post2));
        user3.setPosts(List.of(post3));
        user4.setPosts(List.of(post4));
        user5.setPosts(List.of(post5));


        user1.setFollowers(List.of(user2, user3, user4, user5));

        UserController userController = new UserController();
        userController.saveAll(List.of(user1, user2, user3, user4, user5));

        PostController postController = new PostController();
        postController.saveAll(List.of(post1, post2, post3, post4, post5));

        postController.getMainContent(1L);*/

        System.out.println("hello world");



    }
}