package com.dandy.main.reflect;

public class UserService {

    /**
     * 登陆方法
     * @param name
     * @param password
     * @return
     */
    public boolean login(String name,String password){
        if ("admin".equals(name)&&"123".equals(password)){
            return true;
        }
        return false;
    }

    /**
     * 退出方法
     */
    public void logout(){
        System.out.println("滚");
    }

}
