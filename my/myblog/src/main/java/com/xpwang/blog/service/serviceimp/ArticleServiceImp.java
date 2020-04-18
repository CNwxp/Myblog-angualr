package com.xpwang.blog.service.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xpwang.blog.dao.ArticleDao;
import com.xpwang.blog.enity.ArticleEnity;
import com.xpwang.blog.service.ArticleService;

/**
 * @author xpwang
 * @date 2020年4月12日 上午9:51:35
 * @email 1164360302@qq.com
 */
@Service
public class ArticleServiceImp implements ArticleService {
@Autowired
private ArticleDao articleDao;
	@Override
	public void saveAriticle(ArticleEnity articleEnity) {
		articleDao.save(articleEnity);		
	}

	@Override
	public List<ArticleEnity> queryallArticle() {
		return articleDao.findAll();
	}

	@Override
	public void deleteArticle(String serialNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArticleEnity queryArticleBySeialno(String serialNo) {
		Optional<ArticleEnity> optional = articleDao.findById(serialNo);
		return optional.get();
	}

}
