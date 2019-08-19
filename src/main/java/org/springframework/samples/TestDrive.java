package org.springframework.samples;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.samples.jpetstore.dao.jpa.JpaAccountDao;

/**
 * @author hujun1
 * @date 2019-08-19 17:25
 */
public class TestDrive {


  public static void main(String[] args) {
    ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("spring-ioc.xml");
    JpaAccountDao jpaAccountDao = classPathXmlApplicationContext.getBean(JpaAccountDao.class);
    jpaAccountDao.printClassName();

  }

}
