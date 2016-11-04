package com.example;

import com.example.dao.StudentDao;
import com.example.model.Student;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by zfl on 2016/11/4.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = IntegrateApplication.class)
@WebAppConfiguration
public class DBTest {
    @Autowired
    StudentDao studentDao;
    Student student = new Student("zfl",10);

   studentDao.save(student);
}
