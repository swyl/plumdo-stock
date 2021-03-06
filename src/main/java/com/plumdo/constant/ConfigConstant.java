package com.plumdo.constant;


/**
 * 参数常量
 * 
 */
public class ConfigConstant {
	public static final String DEFAULT_CHARSET = "UTF-8";

	public static final String JWT_SECRET = "XX#$%()(#*!()!KL<><MQLMNQNQJQK sdfkjsdrow32234545fdf>?N<:{LWPW";
	public static final long LOGIN_USER_EXPIRE_IN = 48 * 60 * 60 * 1000;

	public static final String COLLECT_STOCK_URL = "http://hq.sinajs.cn/list=";
	public static final int COLLECT_THREAD_NUM = 15;
	public static final String SEND_WEIBO_URL = "https://api.weibo.com/2/statuses/share.json";
	

	public static final String STOCK_INFO_URL = "http://quote.eastmoney.com/stocklist.html";

	public static final String PARAM_WEIBO_ACCESS_TOKEN = "weibo_access_token";
	public static final String PARAM_WEIBO_SHARE_URL = "weibo_share_url";

	public static final String STOCK_TYPE_SH = "sh";
	public static final String STOCK_TYPE_SZ = "sz";
	
	public static final String SH_STOCK_PRE = "6";
	public static final String SZ_STOCK_PRE = "0";
	public static final String CY_STOCK_PRE = "3";
	

	public static final String LOTTERY_URL = "http://051576.com/kj/";
	public static final int START_LOTTERY_YEAR = 1977;
	

}
