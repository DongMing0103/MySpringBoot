package com.example.demo.immutableMapTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

/** @Author dongm @Description: @Date 2020/9/29 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ImmutableMapTest {

  public static class ConstantMap {
    static Map<Integer, String> INTEGER_STRING_MAP =
        new com.google.common.collect.ImmutableMap.Builder<Integer, String>()
            .put(30, "IP地址或地址段")
            .put(31, "端口号或范围")
            .put(32, "IP地址或地址段")
            .put(33, "端口号或范围")
            .put(34, "代码值")
            .put(38, "探针名称")
            .put(39, "网络协议号(protocol)")
            .put(40, "ipv6源IP(ipv6_src_addr)")
            .put(41, "ipv6目标IP(ipv6_dst_addr)")
            .put(42, "网络协议名称(protocol_map)")
            .put(43, "输入接口snmp(input_snmp)")
            .put(44, "你猜是什么")
            .build();
  }

  @Test
  public void immutableMapTest() {
    Integer key = 44;
    System.out.print("key = " + key + "的提示语是：" + ConstantMap.INTEGER_STRING_MAP.get(key));
  }
}
