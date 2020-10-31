package ir.maktab.repository.impl;

import ir.maktab.domains.account.post.Comment;
import ir.maktab.repository.CommentRepository;
import ir.maktab.repository.base.BaseRepository;

public class CommentRepositoryImpl extends BaseRepository<Comment , Long> implements CommentRepository {

    static CommentRepositoryImpl commentRepository;

    public static CommentRepositoryImpl getInstance() {
        if (commentRepository == null) return commentRepository = new CommentRepositoryImpl();
        return commentRepository;
    }

    @Override
    public void deleteComment(Comment comment){
        delete(comment);
    }

    @Override
    protected Class<Comment> getEntityClass() {
        return Comment.class;
    }
}
