package com.yilei.tryshop.common;

  /**
 3  * 读取当当网下机械表的数据，并进行分析
   * sunwengang   2017-08-13  20：00
   */
  import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

  public class URLDemo {
     public static void main(String args[]){
         //确定爬取的网页地址，此处为当当网搜机械表显示的网页
         //网址为        http://search.dangdang.com/?key=%BB%FA%D0%B5%B1%ED&act=input
         String strurl="https://79.push2.eastmoney.com/api/qt/clist/get?cb=jQuery112409479373241955416_1678010203043&pn=1&pz=20&po=1&np=1&ut=bd1d9ddb04089700cf9c27f6f7426281&fltt=2&invt=2&wbp2u=|0|0|0|web&fid=f3&fs=m:0+t:6,m:0+t:80,m:1+t:2,m:1+t:23,m:0+t:81+s:2048&fields=f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f12,f13,f14,f15,f16,f17,f18,f20,f21,f23,f24,f25,f22,f11,f62,f128,f136,f115,f152&_=1678010203044";
         //建立url爬取核心对象
         try {
             URL url=new URL(strurl);
             //通过url建立与网页的连接
             URLConnection conn=url.openConnection();
             //通过链接取得网页返回的数据
             InputStream is=conn.getInputStream();

             //一般按行读取网页数据，并进行内容分析
             //因此用BufferedReader和InputStreamReader把字节流转化为字符流的缓冲流
             //进行转换时，需要处理编码格式问题
             BufferedReader br=new BufferedReader(new InputStreamReader(is,"UTF-8"));

            //按行读取并打印
             String line=null;
             while((line=br.readLine())!=null){
                 int startIndex = line.indexOf("(");
                 int endIndex = line.indexOf(")");
                 String substring = line.substring(startIndex+1, endIndex-1);

                 System.out.println(substring);
             }



             br.close();
         } catch (Exception e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }

     }
}
