/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bala.jwt;

import com.bala.jwt.utils.KeyGenerator;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author bala
 */
public class KeyGeneratorImpl implements KeyGenerator {

    @Override
    public Key generateKey() {
        String keyString = "T12Za47j@3yX_DM~X@H!imM]Lwf/,?KTSU^D@6";
        Key key = new SecretKeySpec(keyString.getBytes(), 0, keyString.getBytes().length, "DES");
        return key;
    }
}
