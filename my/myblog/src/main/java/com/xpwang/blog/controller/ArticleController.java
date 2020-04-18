package com.xpwang.blog.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xpwang.blog.enity.ArticleEnity;
import com.xpwang.blog.enity.Result;
import com.xpwang.blog.service.serviceimp.ArticleServiceImp;
import com.xpwang.blog.utils.ResultUntil;

/**
 * @author xpwang
 * @date 2020年4月12日 上午9:57:30
 * @email 1164360302@qq.com
 */
@RestController
@RequestMapping("/Article")
public class ArticleController {
	@Autowired
	private ArticleServiceImp articleServiceImp;
	@CrossOrigin(origins = "*", maxAge = 3600) // 解决前后端交互跨域的问题
	@PostMapping( "/save" )
	@Transactional
    public ResponseEntity<Result<Object>> saveArticle(ArticleEnity articleEnity) {
		System.out.println(articleEnity.getTitle());
		articleServiceImp.saveAriticle(articleEnity);
		return ResultUntil.Result("1001", "成功");
	}
	
	@CrossOrigin(origins = "*", maxAge = 3600) // 解决前后端交互跨域的问题
	@PostMapping( "/query" )
	@Transactional
    public ResponseEntity<Result<Object>> queryArticle() {
	List<ArticleEnity> articleEnities=articleServiceImp.queryallArticle();
	return ResultUntil.Result("1001", "成功",articleEnities);
	}
	
	@CrossOrigin(origins = "*", maxAge = 3600) // 解决前后端交互跨域的问题
	@PostMapping( "/querybyserialNo" )
	@Transactional
    public ResponseEntity<Result<Object>> queryArticleBySeialno(String serialNo) {
    ArticleEnity articleEnity=articleServiceImp.queryArticleBySeialno(serialNo);
	return ResultUntil.Result("1001", "成功",articleEnity);
	}
}
