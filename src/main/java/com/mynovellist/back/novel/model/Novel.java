//================================{ PACKAGE }================================//
package com.mynovellist.back.novel.model;
//================================{ END PACKAGE }================================//

//=============================================={ IMPORTS }==============================================//
import com.mynovellist.back.model.AbstractEntity;

import jakarta.persistence.Entity;
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
}
