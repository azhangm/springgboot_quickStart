package com.example.springboot_ssmp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot_ssmp.domain.Book;
import com.example.springboot_ssmp.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Scanner;

@SpringBootTest
class SpringbootSsmpApplicationTests {
    @Resource
    private BookMapper mapper;
    @Test
    void contextLoads() {
        mapper.selectList(null).forEach(System.out::println);
    }
    @Test
    void testPage(){
              int n = 0 ;
             int[] nums = new int[100010];
                Scanner sc = new Scanner(System.in);
                 n = sc.nextInt();
                for (int i = 0 ; i < n; i ++){
                    int q = sc.nextInt();
                    nums[q] = 1;
                }
                for(int i = 1 ; i <= n; i ++){
                    if (nums[i] == 0)
                        System.out.println(nums[i]);
                }

            }
        }


