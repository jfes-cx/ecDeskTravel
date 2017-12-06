/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duoc.util;

/**
 *
 * @author Integer
 */
public  class EncryptUtil {

  
    
    
    public static String sha256Hex(String input) {
        String sha256 = null;
        sha256 = org.apache.commons.codec.digest.DigestUtils.sha256Hex(input);
        return sha256;
    }
}
