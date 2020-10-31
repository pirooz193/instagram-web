package ir.maktab.domains.account.post;


import ir.maktab.base.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Comment extends BaseEntity<Long> {

    private String text;

    @Override
    public String toString() {
        return "comment :" + text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
