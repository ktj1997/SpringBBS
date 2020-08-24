package com.example.myproject.model.dto.resonse.memo;

import com.example.myproject.model.entity.memo.Memo;
import com.example.myproject.model.entity.memo.MemoType;
import com.example.myproject.model.entity.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Getter
public class MemoSummaryDto {

    String title;
    String content;
    Date createdAt;
    String user;
    MemoType type;


    public MemoSummaryDto(Memo memo)
    {
        this.title = memo.getTitle();
        this.content =memo.getContent();
        this.createdAt = memo.getCreatedAt();
        this.user = memo.getUser().getUsername();
        this.type = memo.getType();
    }


    @Builder
    public MemoSummaryDto(String title, String content, Date createdAt, User user, MemoType type) {
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.user = user.getUsername();
        this.type = type;
    }
}