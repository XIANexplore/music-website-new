package com.example.cookie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cookie.common.R;
import com.example.cookie.model.domain.ListSong;
import com.example.cookie.model.request.ListSongRequest;

import java.util.List;

public interface ListSongService extends IService<ListSong> {

    R addListSong(ListSongRequest addListSongRequest);

    R updateListSongMsg(ListSongRequest updateListSongRequest);

    R deleteListSong(Integer songId);

    //看看这啥
    List<ListSong> allListSong();

    R listSongOfSongId(Integer songListId);
}
