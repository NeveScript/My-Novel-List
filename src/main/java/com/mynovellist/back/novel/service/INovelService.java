//================================{ PACKAGE }================================//
package com.mynovellist.back.novel.service;
//================================{ END PACKAGE }================================//

//================================{ IMPORTS }================================//
import com.mynovellist.back.novel.model.Novel;

import java.util.List;
//================================{ END IMPORTS }================================//

public interface INovelService {

    //================================{ METHODS }================================//


    List<Novel> listAllNovels();
}
