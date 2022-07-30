package com.portfolioEvelyn.miportfolio.model.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Dto {
    
    private String email;
    private String password;
            
   public Dto (){
    }

    public Dto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Dto{" + "email=" + email + ", password=" + password + '}';
    }
      
}

