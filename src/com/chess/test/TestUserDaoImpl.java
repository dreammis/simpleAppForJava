package com.chess.test;

import com.chess.dao.UserDao;
import com.chess.dao.impl.UserDaoImpl;
import org.junit.Test;

public class TestUserDaoImpl {

    @Test
    public void TestFindAll(){
        UserDao ud = new UserDaoImpl();
        ud.findall();
    }

    @Test
    public void TestLogin(){
        UserDao ud = new UserDaoImpl();
        ud.login("4", "liu");
    }
}
