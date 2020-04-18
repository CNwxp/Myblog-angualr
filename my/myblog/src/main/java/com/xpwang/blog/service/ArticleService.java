package com.xpwang.blog.service;

import java.util.List;

import com.xpwang.blog.enity.ArticleEnity;
/**
 * 
 * @author xpwang
 * @date 2020年4月12日 上午9:47:36
 * @email 1164360302@qq.com
 */
public interface ArticleService {
	/**
	 * 保存文章
	 * @param articleEnity
	 */
   public void saveAriticle(ArticleEnity articleEnity);
   public List<ArticleEnity> queryallArticle();
   public void deleteArticle(String serialNo);
   public ArticleEnity queryArticleBySeialno(String serialNo);
}
