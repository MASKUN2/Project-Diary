package com.maskun.projectdiary.domain.memo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter @ToString
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memoNo;
    private String userId;
    private LocalDate memoDate;
    private String memoContent;
    private LocalDateTime createdate;

    public void updateContent(String content){
        this.memoContent = content;
    }
    @Builder
    public Memo(String userId, LocalDate memoDate, String memoContent, LocalDateTime createdate) {
        this.userId = userId;
        this.memoDate = memoDate;
        this.memoContent = memoContent;
        this.createdate = createdate;
    }
}
