package ir.maktab.service;

import ir.maktab.domains.account.Account;
import ir.maktab.domains.account.post.Category;
import ir.maktab.domains.account.post.Comment;
import ir.maktab.domains.account.post.Post;
import ir.maktab.repository.impl.AccountRepositoryImpl;
import ir.maktab.repository.impl.CategoryRepositoryImpl;
import ir.maktab.repository.impl.PostRepositoryImpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PostService {

    PostRepositoryImpl postRepository = PostRepositoryImpl.getInstance();
    AccountRepositoryImpl accountRepository = AccountRepositoryImpl.getInstance();
    CategoryRepositoryImpl categoryRepository = CategoryRepositoryImpl.getInstance();


    public Post generatePost(String photo, String caption) {
        Post post = new Post();
        post.setPhoto(photo);
        post.setCaption(caption);
        post.setCreateDate(getDate());
        postRepository.createPost(post);
        return post;
    }


    public static LocalDateTime getDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return now;
    }

    public Post getPost(Long id) {
        return postRepository.getPost(id);
    }

    public Post editCaption(Post post, String newCaption) {
        try {
            post.setCaption(newCaption);
            post = postRepository.update(post);
        } catch (Exception e) {
            System.out.println("!!!");
            e.printStackTrace();
        }
        return post;
    }

    public void deletePost(Post post) {
        postRepository.delete(post);
    }

    public List<Post> showUserPostsByLikes(Account account) {
        List<Integer> postsLikes = new ArrayList<>();
        for (int i = 0; i < account.getPosts().size(); i++) {
            postsLikes.add(account.getPosts().get(i).getLikes().size());
        }
        Collections.sort(postsLikes);
        Collections.reverse(postsLikes);
        List<Post> posts = new ArrayList<>();
        for (int i = 0; i < account.getPosts().size(); i++) {
            for (int j = 0; j < account.getPosts().size(); j++) {
                if (postsLikes.get(i) == account.getPosts().get(j).getLikes().size()) {
                    posts.add(account.getPosts().get(j));
                }
            }
        }
        return posts;

    }


    public List<Post> showUserPosts(Account account) {
        return account.getPosts();
    }

    public void likePost(Post post, Account account) {
        post.getLikes().add(account);
        postRepository.save(post);
    }

    public void addComment(Post post, String text) {
        Comment comment = new Comment();
        comment.setText(text);
        post.getComments().add(comment);
        postRepository.save(post);
    }

    public void savePost(Account account, Post post) {
        try {
            account.getSavedPost().add(post);
            accountRepository.save(account);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void savePostWithCategory(Account account, Post post, Category category) {
        try {
//            post.setCategory(category);
            account.getSavedPost().add(post);
            accountRepository.save(account);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
