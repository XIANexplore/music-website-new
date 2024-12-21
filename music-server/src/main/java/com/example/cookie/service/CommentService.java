package com.example.cookie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cookie.common.R;
import com.example.cookie.model.domain.Comment;
import com.example.cookie.model.request.CommentRequest;

public interface CommentService extends IService<Comment> {

    R addComment(CommentRequest addCommentRequest);

    R updateCommentMsg(CommentRequest upCommentRequest);

    R deleteComment(Integer id);

    R commentOfSongId(Integer songId);

    R commentOfSongListId(Integer songListId);

}
