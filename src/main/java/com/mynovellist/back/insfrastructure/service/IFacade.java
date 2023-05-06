package com.mynovellist.back.insfrastructure.service;

//================================{ IMPORTS }================================//
import com.mynovellist.back.novel.model.Novel;

import java.util.List;
//================================{ END IMPORTS }================================//

public interface IFacade {

    //================================{ NOVEL }================================//
    List<Novel> listAllNovels();
}
