//=============================================={ PACKAGE }==============================================//
package com.mynovellist.back.novel.author.model;
//=============================================={ END PACKAGE }==============================================//

//=============================================={ IMPORTS }==============================================//
import com.mynovellist.back.insfrastructure.model.AbstractEntity;

import com.mynovellist.back.novel.model.Novel;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;
//=============================================={ END IMPORTS }==============================================//

@Entity
@Table(name="authors")
@Data
public class Author extends AbstractEntity {

    //=============================================={ ATTRIBUTES }==============================================//
    private String name;
    private String twitterUsername;
    private String email;

    @OneToMany(mappedBy = "author")
    List<Novel> novels;
}
