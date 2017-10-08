package org.game.stage;

import org.apache.log4j.Logger;
import org.game.stage.domain.User;
import org.game.stage.service.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Stiles on 2017/9/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTests {
    private Logger logger = Logger.getLogger(UserRepositoryTests.class);
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        logger.info("formattedDate = " + formattedDate);
        userRepository.save(new User("aa1", "aa@126.com", formattedDate, "aa123456"));
        userRepository.save(new User("bb2", "bb@126.com", formattedDate, "bb123456"));
        userRepository.save(new User("cc3", "cc@126.com", formattedDate, "cc123456"));

        Assert.assertEquals(3, userRepository.findAll().size());
        Assert.assertEquals("aa@126.com", userRepository.findByUserNameOrOtherString("bb", "aa123456").getPassWord());
        userRepository.delete(userRepository.findByUserName("aa1"));
    }

}
