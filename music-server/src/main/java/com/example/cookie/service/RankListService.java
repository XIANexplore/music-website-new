package com.example.cookie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cookie.common.R;
import com.example.cookie.model.domain.RankList;
import com.example.cookie.model.request.RankListRequest;

public interface RankListService extends IService<RankList> {

    R addRank(RankListRequest rankListAddRequest);

    R rankOfSongListId(Long songListId);

    R getUserRank(Long consumerId, Long songListId);

}
