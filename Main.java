package com.xiangmuer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Author：TaiLong
 * created:2019/8/11
 */
public class Main {
    public static void main(String[] args)throws IOException{
        String requestMessage="GET /thread.hrml?id=18&page=9 HTTP/1.1\r\n"
                +"Host:www.bitvip.com\r\n"
                +"Accept: text/html\r\n"+"\r\n";
        InputStream is=new ByteArrayInputStream(requestMessage.getBytes());
        Request request=Request.parse(is);
        System.out.println(request.getMethod());
        System.out.println(request.getHeaders());
        System.out.println(request.getProtocol());
        System.out.println(request.getRequestParams());
        System.out.println(request.getUrl()
        );

    }
}
