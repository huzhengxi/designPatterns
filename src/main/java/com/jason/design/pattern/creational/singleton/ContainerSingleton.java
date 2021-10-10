package com.jason.design.pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Tiger.HU
 * @date 2021年10月10日 1:09 下午
 */
public class ContainerSingleton {

  private ContainerSingleton() {

  }

  //  这里使用 HashMap 是线程不安全的，使用HashTable是线程安全的，但是会影响性能，这里不推荐使用 HashTable
  private static Map<String, Object> singletonMap = new HashMap<>();

  public static void putInstance(String key, Object instalce) {
    if (StringUtils.isNotBlank(key) && instalce != null) {
      if (!singletonMap.containsKey(key)) {
        singletonMap.put(key, instalce);
      }
    }
  }

  public static Object getInstance(String key) {
    return singletonMap.get(key);
  }

}
