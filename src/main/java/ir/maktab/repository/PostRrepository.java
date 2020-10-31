package ir.maktab.repository;

import ir.maktab.domains.account.post.Post;

import java.util.List;

public interface PostRrepository {
    Post createPost(Post post);
    List loadComments(Post post);

}
