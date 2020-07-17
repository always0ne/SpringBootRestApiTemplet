package com.restapi.templet.blog.comment;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.restapi.templet.common.Date;
import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Comment extends Date {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;
    @Column(length = 30, nullable =false)
    private String commenterId;
    @Column(columnDefinition = "TEXT",nullable = false)
    private String message;

}