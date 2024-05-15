package com.nickwww.utils;

import com.nickwww.model.entity.system.SysUser;

public class AuthContextUtil  {
    //Initialize thread local
    private static final ThreadLocal<SysUser> threadLocal = new ThreadLocal<>();

    //set User to thread local
    public static void set(SysUser sysUser){
        threadLocal.set(sysUser );
    }

    //Getter
    public static SysUser get(){
        return threadLocal.get();
    }

    // Delete
    public static void remove(){
        threadLocal.remove();
    }
}
