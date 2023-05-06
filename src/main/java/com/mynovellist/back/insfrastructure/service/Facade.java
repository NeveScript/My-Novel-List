package com.mynovellist.back.insfrastructure.service;

//================================{ IMPORTS }================================//
import com.mynovellist.back.novel.model.Novel;

import com.mynovellist.back.novel.service.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//================================{ END IMPORTS }================================//

@Service
public class Facade implements IFacade{

    @Autowired
    NovelService novelService;

    @Override
    public List<Novel> listAllNovels() {

        return this.novelService.listAllNovels();

    }
}
