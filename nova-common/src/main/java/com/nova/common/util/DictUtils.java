package com.nova.common.util;


import com.nova.common.constant.Constants;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 字典工具类
 * 
 * @author ruoyi
 */
@Component
public class DictUtils
{
    /**
     * 分隔符
     */
    public static final String SEPARATOR = ",";





    /**
     * 获取cache name
     * 
     * @return 缓存名
     */
    public static String getCacheName()
    {
        return Constants.SYS_DICT_CACHE;
    }

    /**
     * 设置cache key
     * 
     * @param configKey 参数键
     * @return 缓存键key
     */
    public static String getCacheKey(String configKey)
    {
        return Constants.SYS_DICT_KEY + configKey;
    }
}
