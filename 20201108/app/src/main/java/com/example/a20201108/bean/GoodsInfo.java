package com.example.a20201108.bean;

import com.example.a20201108.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "P40Pro", "iphone", "OPPO RENO4 Pro", "小米10", "魅族16", "vivo iQOO Neo3","realme 真我V5",
             "三星Galaxy S20 FE 5G","中兴 天机Axon20","一加OnePlus 8T "

    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "华为 HUAWEI P40Pro 8GB+128GB 全网通（亮黑色）",
            "iphone 11 128GB 黑色 移动联通电信4G全网通手机 双卡双待",
            "OPPO Reno4 Pro 5G 晶钻蓝 8GB+128GB 双模5G 65W超级闪充 超级夜景视频 7.6mm超轻薄设计 拍照游戏智能手机",
            "小米10至尊纪念版 陶瓷黑 120X 超远变焦 / 120W 秒充科技 / 骁龙865旗舰处理器 / 双模5G ",
            "魅族16thplus 骁龙845处理器 6.5英寸全面屏 16t日光橙 8GB+128GB",
            "vivo iQOO Neo3 5G 8GB+128GB 夜幕黑 高通骁龙865 144Hz竞速屏 立体双扬 44W闪充 双模5G全网通手机",
            "realme 真我V5 5G手机 6GB+128GB 银翼少年 30W闪充 5000mAh超大电池 4800万广角四摄 90Hz畅速屏 OPPO提供售后支持",
            "三星Galaxy S20 FE 5G（SM-G7810）8GB+128GB 异想蓝 骁龙865 游戏手机 拍照手机 5G手机",
            "中兴 天机Axon20 屏下摄像头 5G A20手机 黑洞引力 8GB+256GB 官方标配",
            "一加 OnePlus 8T 5G手机 全网通（8G+128G）银时"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {5988, 5048, 3799, 5599, 3299, 2998,1399,2798,2988,3988};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.huaweip40_s, R.drawable.iphone_s, R.drawable.oppo_s,
            R.drawable.xiaomi_s, R.drawable.meizu_s, R.drawable.vivo_s,
            R.drawable.zhenwo_s,R.drawable.sanxing_s,R.drawable.zhongxing_s,
            R.drawable.yijia_s

    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.huaweip40, R.drawable.iphone, R.drawable.oppo,
            R.drawable.xiaomi, R.drawable.meizu, R.drawable.vivo,
            R.drawable.zhenwo,R.drawable.sanxing,R.drawable.zhongxing,
            R.drawable.yijia
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
