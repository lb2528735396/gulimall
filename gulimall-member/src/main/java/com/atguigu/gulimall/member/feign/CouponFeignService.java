package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * program: gulimall
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2022-05-10 22
 * Time:21
 */
@FeignClient("gulimall-coupon")//这是一个声明式的远程调用
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();

}
