package com.atguigu.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRedisTest {
        @Autowired
                private RedisTemplate<Object,Object> redisTemplate;
@Test
        public  void  testRedisTemplate(){
    ValueOperations operations = redisTemplate.opsForValue();
    operations.set("hello", "hello-value");}


}
