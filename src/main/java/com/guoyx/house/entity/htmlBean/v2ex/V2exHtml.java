package com.guoyx.house.entity.htmlBean.v2ex;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

import java.util.ArrayList;
import java.util.List;

@Gecco(matchUrl="https://www.v2ex.com/", pipelines={"consolePipeline", "v2exPipeline"})
public class V2exHtml implements HtmlBean {

    @HtmlField(cssPath=".cell.item")
    private List<V2exListItemHtml> titleList = new ArrayList<>();

    public List<V2exListItemHtml> getTitleList() {
        return titleList;
    }

    public void setTitleList(List<V2exListItemHtml> titleList) {
        this.titleList = titleList;
    }
}
