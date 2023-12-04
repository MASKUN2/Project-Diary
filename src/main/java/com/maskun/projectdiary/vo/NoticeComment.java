package com.maskun.projectdiary.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NoticeComment {
    private int commentNo;
    private int noticeNo;
    private String author;
    private String commentContent;
    private boolean isSecret;
    private LocalDateTime createdate;
}