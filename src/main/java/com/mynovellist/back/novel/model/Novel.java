//================================{ PACKAGE }================================//
package com.mynovellist.back.novel.model;
//================================{ END PACKAGE }================================//

//=============================================={ IMPORTS }==============================================//
import com.mynovellist.back.insfrastructure.model.AbstractEntity;

import com.mynovellist.back.novel.author.model.Author;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//=============================================={ IMPORTS }==============================================//

@Entity
@Table(name="novels")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Novel extends AbstractEntity {

    private String title;
    private String cover;
    private String alternativeName;
    private long favourites;
    private String synopsis;
    private float score;
    private long rank;

    @ManyToOne
    @JoinColumn(name="author_id")
    private Author author;
}
