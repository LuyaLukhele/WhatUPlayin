package com.luyalukhele.WhatUPlayin.dataTransfer;

import lombok.Data;

@Data
public class LoginDTO {

    private String usernameOrEmail;
    private String password;
}
