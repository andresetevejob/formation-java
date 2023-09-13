package org.example.authentication;

import org.example.models.Etudiant;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
    private List<Privilege> privileges;

    public List<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
    }
    public void addPrivilege(Privilege privilege){
        if(this.privileges==null){
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilege);
    }
}
