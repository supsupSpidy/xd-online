package cn.edu.fjjx.online_xdclass.config;

/**
 * 缓存key管理类
 */
public class CacheKeyManager {
    /**
     *首页视屏列表缓存key
     */
    public static final String INDEX_VIDEL_LIST = "index:video:list";
    /**
     * 视频详情缓存key，%s是视频id
     */
    public static final String VIDEO_DETAIL = "video:detail:%s";
    /**
     * 首页轮播图缓存key
     */
    public static final String INDEX_BANNER_KEY = "index:banner:list";


}
