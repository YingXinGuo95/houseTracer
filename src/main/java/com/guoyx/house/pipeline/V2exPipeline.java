package com.guoyx.house.pipeline;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.guoyx.house.entity.htmlBean.v2ex.V2exHtml;
import com.guoyx.house.entity.htmlBean.v2ex.V2exListItemHtml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@PipelineName("v2exPipeline")
public class V2exPipeline implements Pipeline<V2exHtml>{
    private static final Logger logger = LoggerFactory.getLogger(V2exPipeline.class);

    @Override
    public void process(V2exHtml v2exHtml) {

        List<V2exListItemHtml> titleList = v2exHtml.getTitleList();
        for (V2exListItemHtml itemHtml : titleList) {
            logger.info("title:{} author:{}",itemHtml.getTitle(),itemHtml.getAuthor());
        }
    }


}
