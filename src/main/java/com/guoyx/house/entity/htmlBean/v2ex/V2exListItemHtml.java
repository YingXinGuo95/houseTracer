package com.guoyx.house.entity.htmlBean.v2ex;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class V2exListItemHtml implements HtmlBean {

    @Text
    @HtmlField(cssPath=".topic-link")
    private String title;

    @Text
    @HtmlField(cssPath=".topic_info>strong:nth-child(3)>a")
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
