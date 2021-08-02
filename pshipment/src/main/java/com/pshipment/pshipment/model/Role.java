package com.pshipment.pshipment.model;

<<<<<<< HEAD
import javax.persistence.Entity;
=======
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
>>>>>>> 2f265f85bd23b7a4514af85f4dac4ff14d4c9d06
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
<<<<<<< HEAD
@Entity
@Table(name="role")
public class Role {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
private int roleId;
private String roleName;
public int getRoleId() {
    return roleId;
}
public void setRoleId(int roleId) {
    this.roleId = roleId;
}
public String getRoleName() {
    return roleName;
}
public void setRoleName(String roleName) {
    this.roleName = roleName;
}
public Role() {
}
public Role(int roleId, String roleName) {
    this.roleId = roleId;
    this.roleName = roleName;
}


}
=======

import org.hibernate.annotations.NaturalId;


@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;


    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoleName name;

    public Role() {}

    public Role(RoleName name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RoleName getName() {
        return name;
    }

    public void setName(RoleName name) {
        this.name = name;
    }
}
>>>>>>> 2f265f85bd23b7a4514af85f4dac4ff14d4c9d06
