package com.xpwang.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xpwang.blog.enity.ArticleEnity;
/**
 * 
 * @author xpwang
 * @date 2020年4月12日 上午9:32:55
 * @email 1164360302@qq.com
 */
public interface ArticleDao extends JpaRepository<ArticleEnity,String> {

}
