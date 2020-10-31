package ir.maktab.repository;

import ir.maktab.domains.account.post.Comment;

public interface CommentRepository {


    void deleteComment(Comment comment);
}
