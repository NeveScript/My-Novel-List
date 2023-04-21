package com.mynovellist.model;

//============================================{ Imports }============================================//
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.Data;
//============================================{ END Imports }============================================//
@Entity
@Table(name="users")
@Data
public class User extends AbstractEntity{

    //============================================{ ATTRIBUTES }============================================//
    private String name;
    @NotNull(message = "The username cannot be null")
    @Size(min = 4, message = "The username cannot be less than 4 characters")
    private String username;

    @Email
    @NotNull(message = "The email cannot be null")
    private String email;

    @NotNull(message = "The password cannot be null")
    @Size(min = 6, message = "The password cannot be less than 6 characters")
    private String password;

    //============================================{ GETTERS AND SETTERS }============================================//

    /**
     *
     * @return String with the patterned username. Pattern: "@user_name".
     */
    public String getName(){
        String cleanUsername = this.username.replaceAll("[^a-zA-Z0-9_]", " ");
        return "@" + cleanUsername;
    }
}
