//================================{ PACKAGE }================================//
package com.mynovellist.back.novel.service;
//================================{ END PACKAGE }================================//

//================================{ IMPORTS }================================//
import com.mynovellist.back.novel.model.Novel;
import com.mynovellist.back.novel.repository.NovelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//================================{ END IMPORTS }================================//

@Service
public class NovelService implements INovelService{

    //================================{ ATTRIBUTES }================================//
    @Autowired
    NovelRepository novelRepository;

    //================================{ METHODS }================================//
    @Override
    public List<Novel> listAllNovels() {
        return this.novelRepository.findAll();
    }
}
