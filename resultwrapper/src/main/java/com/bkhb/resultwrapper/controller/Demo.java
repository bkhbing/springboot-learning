package com.bkhb.resultwrapper.controller;

import com.bkhb.resultwrapper.common.result.IgnoredResultWrapper;
import com.bkhb.resultwrapper.common.result.ResultWrapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class Demo {

    @GetMapping("demo1")
    public List demo1(){
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        return sites;
    }

    @IgnoredResultWrapper
    @GetMapping("demo2")
    public List demo2(){
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        return sites;
    }

    @GetMapping("demo3")
    public ResultWrapper<List> demo3(){
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");

        ResultWrapper<List> resultWrapper = new ResultWrapper<>();
        resultWrapper.setCode("200");
        resultWrapper.setData(sites);
        resultWrapper.setMessage("自定义返回格式");

        return resultWrapper;
    }
}
