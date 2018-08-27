package com.leetcode;

import org.jianzhao.jojo.JsonObject;

import java.time.Instant;
import java.util.Date;

public class MyTest {

    public static void main(String[] args) {

        JsonObject json = new JsonObject()
                .put("hello", 1)
                .putNull("a")
                .put("time", new Date())
                .put("seconds",Instant.now());
        // TODO 序列化
        Foo foo = json.mapTo(Foo.class);
        //Foo foo = json.mapFrom(Object,Foo.class);
        System.out.println(json);
        System.out.println(foo);
    }

   static class  Foo {
        private Integer hello;
        private String a;
        private Date time;
        private Instant seconds;

        public Integer getHello() {
            return hello;
        }

        public void setHello(Integer hello) {
            this.hello = hello;
        }

        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }

        public Date getTime() {
            return time;
        }

        public void setTime(Date time) {
            this.time = time;
        }

       public Instant getSeconds() {
           return seconds;
       }

       public void setSeconds(Instant seconds) {
           this.seconds = seconds;
       }
   }

}
