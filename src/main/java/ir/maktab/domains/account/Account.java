package ir.maktab.domains.account;

import ir.maktab.base.BaseEntity;
import ir.maktab.domains.account.post.Category;
import ir.maktab.domains.account.post.Post;


import javax.persistence.*;
import javax.servlet.annotation.WebServlet;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Account extends BaseEntity<Long> {

    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;


    @OneToMany()
    @JoinTable(name = "ac_followers")
    private List<Account> followers = new ArrayList<>();

    @OneToMany()
    @JoinTable(name = "ac_followings")
    private List<Account> followings = new ArrayList<>();


    @OneToMany(cascade = CascadeType.ALL)
    private List<Post> posts = new ArrayList<>();

    @OneToMany
    private List<Post> savedPost = new ArrayList<>();

    /*@OneToMany
    private List<Category> Categories =new ArrayList<>();*/

    @Override
    public String toString() {
        return "username:"+username+
                " posts :" + posts;
    }

/*    public List<Category> getCategories() {
        return Categories;
    }

    public void setCategories(List<Category> categories) {
        Categories = categories;
    }*/

    public List<Post> getSavedPost() {
        return savedPost;
    }

    public void setSavedPost(List<Post> savedPost) {
        this.savedPost = savedPost;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Account> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Account> followers) {
        this.followers = followers;
    }

    public List<Account> getFollowings() {
        return followings;
    }

    public void setFollowings(List<Account> followings) {
        this.followings = followings;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
