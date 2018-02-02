package com.wfwgyy.imsa.common;

public class AppConsts {
	// 服务器配置
	public final static String SERVER_IP = "192.168.11.15";
	// 系统消息所需属性
	public final static String MSG_ID = "msg_id";
	public final static String MSG_TYPE = "msg_type";
	public final static String MSG_VERSION = "msg_version";
	public final static long SERVICE_ID_NONE = 0;
	public final static String SERVICE_ID = "service_id";
	public final static String MSG_DATA = "msg_data";
	public final static String MSG_URLS = "msg_urls";
	public final static String ATS_REQUEST = "request_";
	public final static String MSG_BEGIN_TAG = "<###IMSA###>";
	public final static String MSG_END_TAG = "<&&&IMSA&&&>";
	// 消息类型
	public final static int MT_HTTP_GET_REQ = 1; // HTTP GET请求
	// 消息版本
	public final static int MT_MSG_V1 = 1;
	public final static int MT_MSG_V2 = 2;
	public final static int MT_MSG_V3 = 3;
	public final static int MT_MSG_V4 = 4;
	public final static int MT_MSG_V5 = 5;
	// Redis服务器
	public final static String REDIS_HOST = SERVER_IP;
	public final static short REDIS_PORT = 6379;
	// 消息服务器相关配置
	public final static String PLATO_HOST = SERVER_IP;
	public final static short PLATO_PORT = 8089;
	// 门户Facade相关
	public final static String FACADE_HOST = SERVER_IP;
	public final static short FACADE_PORT = 8088;
}
