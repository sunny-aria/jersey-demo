package com.hd;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * jersey demo
 */
@Path("/hello")
public class HelloController {
    //GET注解设置接受请求类型为GET
    //Produces表明发送出去的数据类型为text/plain
    //与Produces对应的是@Consumes，表示接受的数据类型为text/plain
    @GET
    @Produces("text/plain")
    public String getString() {
        return "hello jersey!";
    }
}
