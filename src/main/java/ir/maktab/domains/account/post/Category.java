package ir.maktab.domains.account.post;

import ir.maktab.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category extends BaseEntity<Long> {


    private String name ;


    @OneToMany
    private List<Post> savedPosts = new ArrayList<>();

    @Override
    public String toString() {
        return "." + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Post> getSavedPosts() {
        return savedPosts;
    }

    public void setSavedPosts(List<Post> savedPosts) {
        this.savedPosts = savedPosts;
    }
}
