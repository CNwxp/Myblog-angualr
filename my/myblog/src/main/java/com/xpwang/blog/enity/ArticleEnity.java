package com.xpwang.blog.enity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

/**
 * ARTICLE （文章）表的实体类
 */
@Entity
@Table(name = "ARTICLE")
@Setter
@Getter
public class ArticleEnity {
	@Id
	@Column(nullable = false, length = 32)
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid",strategy="uuid")
	private String seriaNo;// 文章编号
	@Column(length = 128)
	private String title;// 标题
	@Column(length = 512)
	private String content;// 内容
	@Column(length = 10)
	private String author;// 作者
	@Column(length = 20)
	private String tag;// 标签
	@Column(length = 20)
	private String description;// 描述
	@Column(length = 20)
	private String updatetime;// 更新时间
	@Column(length = 20)
	private String cratetime;// 更新时间
	public String getSeriaNo() {
		return seriaNo;
	}
	public void setSeriaNo(String seriaNo) {
		this.seriaNo = seriaNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	
}
