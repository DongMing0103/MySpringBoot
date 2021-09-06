package com.example.demo.immutableMapTest;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/** @Author dongm @Description: @Date 2020/11/3 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ImmutableMapMethodTest {
  public static class MethodMapper {
    static ImmutableMap<Integer, String> map =
        new ImmutableMap.Builder<Integer, String>()
            .put(1, method1("1111111"))
            .put(2, method2("2222222"))
            .build();
  }

  @Test
  public void testMethod() {
    Integer key = 1;
    MethodMapper.map.get(key);
  }

  public static String method1(String message) {
    return message;
  }

  public static String method2(String message) {
    return message;
  }
}
