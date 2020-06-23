package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101400688176";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCqZTvs7eZjJK+1fsIoFv5/XdP9yHPVuV4RsPWsd6j/4olkdoDKD08i5wifOnd0eFDWKOjGvCjB8gBiZ33z0iHyOgV+p5zWekBLXdGNyijiHqDpGm/Go3c6gQwkAOq2efLawSSf4DL8pxuOZtjS6jhNDbHXPd3GZfLdCiZVUXP6aPcZ88i1jGgqXzQS19gBiwuL9lyjZi8ENmzG4ZvjXZbC2oBH967cHEpcTdPrrW1aVm3/UJG9iKmO874mqp+YzgWyhPShHHbcRx72ZeYygxE42XtfjKln9Bh6VJaOtfHoi5j9Vo3VazxfsKuYwFS0OrWDQvFQqJBQkDoTYCF9O2O7AgMBAAECggEAbwL/VK/1fjgjhYIs6kN40PAHMfsLhH19DNeWZyOaZgNn8ZzG8V2h+CI+2sYTlzzfpXcHmJpzj0+j8nhsdZI8bXxhog9/Pbht9OwNn2vK0O6VdOi1U9uhzOrQRxCV2gZ/MwfMXaCKd1JDwLW+o0LXJVQ7vfhfaWd4H4wCR2mGvufbeIl4FYD3JFGO7f159JsQx90yPMc8GFjAgSj0nsHLmupWnKqkMeAYwoG5/ufuT57yWHW4xYGHhjRrj6JXSbZoCOHGAiAjMzua5w11Ha5rCNIUT5/fu9AO+TFT0QHo9NOp6uw5Dkoh3kXD8SETEebhOQRVeztkh42JkKHdI3d2YQKBgQDso1J6Ecorb/7tiRzQoZV7wtNneVGRyB+40Uoe5zz60h6Fh+Ib2E8BbvHizI3CkDHDBIU+Npvo4jlQZNxqd/B1nyqGSmG4Jkjv+R9ImS2BeoDl9Y1bbEPQguAqLKQSe84mvXq7L6i6ZulCs9vnIsJh3asEszjlEQYWIYzCymWQ8QKBgQC4VmEgBeJ6efc181TA/AEQrramaqC3pHgqIT5z7VJIGoyFI05kBe264Oi5ixVY4OhSLKLra/RFZ2lvCKhf+T3R45q2Q6ZxAoqpsbWbklJu9RkyKAl9PlIKmUcmRd4U8DRwcPNwr6I2tfuNqqZMibGglCqf/4DUhe9m1orgd+S/awKBgANHUAE49eAcMSABYlDRrEyGqn8ogyTN7QKWg7xh38pp1tpqw4s3OAEBFIDb7KrhbI8TJPVztD1JxRmEDDm9Z6t5hRFPPoNapHAOt4w98w90Lw0AlfDKUzY0Wf67l5pZ9MU8otKtGl1ax6iQ7V8KcD8C3ze1c/hYgAkWdejM/RNBAoGAL/t0DqTZfe3vdmCfaBhwoooHyyuoKAUsrjK3Ee/tYg1fFGzLQ+fzKJjQmzNj3B22+2TZB5SzIbm4TQmg4lJ7T/4B0H2tfm8d7uvuDM+6m107ML4RMkOdkVqylXjMRQD9dWNBSsy82abnEsofvX59+QF4Uutr+mXemhMwVRuANH8CgYBSBOLZ5Wt/prJDz3oPcXLYR+FVlY9KplRF9LxQAUjBHGp8iMzJfhgV1RDOlEI5YsfoTgtG0Hr+ZpA7GkquWmqad4usQjAbLH/4xdJJ96n4FU7R4uzmwLlclvUwEq3NKGS4EN7KtBjFGW3pQbUdf20NGTljj2K7qH5zl+8knAINCg==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/DaMi/pay/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/DaMi/pay/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

