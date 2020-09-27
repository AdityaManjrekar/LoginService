package com.aditya.login.service.LoginService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("UserInfo")
public class UserInfo implements Serializable {

    @Column("ID")
    private UUID id;

    @Column("FirstName")
    private String firstName;

    @Column("LastName")
    private String lastName;

    @PrimaryKey("UserName")
    private String userName;

    @Column("EmailAddress")
    private String emailAddress;

    @Column("Password")
    private String password;

    @Column("AvatarUrl")
    private String avatarUrl;

    @Column("CreationDate")
    private Date creationDate;

    @Column("LastLogin")
    private Date lastLogin;


}
