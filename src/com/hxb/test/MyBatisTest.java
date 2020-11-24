package com.hxb.test;

import com.hxb.po.Customer;
import com.hxb.utils.MybatisUtils;
import org.apache.ibatis.builder.SqlSourceBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {


    @Test
    public void  findCustomerById() throws IOException {
        SqlSession sqlSession = MybatisUtils.getSession();
        Customer customer = new Customer();
        customer.setUsername("rose1");
        customer.setJobs("student");
        List<Customer> customers = sqlSession.selectList("com.hxb.mapper.CustomerMapper.findCustomerById",customer);
        for (Customer customer1:customers){
            System.out.println(customer1);
        }
        sqlSession.close();
        
    }
}
