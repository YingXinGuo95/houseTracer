import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.request.HttpGetRequest;
import com.guoyx.house.common.Consts;

public class RunTest {

    public static void main(String[] args){
        HttpGetRequest startUrl = new HttpGetRequest(Consts.WEB_URL);
        startUrl.setCharset("utf-8");

        try {
            GeccoEngine.create()
                    //Gecco搜索的包路径
                    .classpath("com.guoyx.house")
                    //开始抓取的页面地址
                    .start(startUrl)
                    //开启几个爬虫线程
                    .thread(1)
                    //单个爬虫每次抓取完一个请求后的间隔时间
                    .interval(800)
                    .mobile(false)
                    .run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
