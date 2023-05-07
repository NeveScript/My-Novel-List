//================================{ PACKAGE }================================//
package com.mynovellist.back.api.controller;
//================================{ END PACKAGE }================================//

//================================{ IMPORTS }================================//
import com.mynovellist.back.insfrastructure.service.FacadeInstance;
import com.mynovellist.back.novel.model.Novel;

import com.mynovellist.back.novel.service.INovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
//================================{ END IMPORTS }================================//

/**
 * @author NekoYasha
 */
@Controller
@RequestMapping("/api")
public class NovelController {

    @Autowired
    INovelService novelService;

    @GetMapping("/novels")
    @CrossOrigin(origins = "*")
    @ResponseBody
    public List<Novel> getAllNovels(){

        //List<Novel> novels = FacadeInstance.getInstance().listAllNovels();
        List<Novel> novels = novelService.listAllNovels();
        return novels;
    }

    @GetMapping("/novels/count")
    @CrossOrigin(origins = "*")
    @ResponseBody
    public Long getNovelCount(){

        List<Novel> novels = FacadeInstance.getInstance().listAllNovels();

        long count = (long) novels.size();

        return count;
    }
}
