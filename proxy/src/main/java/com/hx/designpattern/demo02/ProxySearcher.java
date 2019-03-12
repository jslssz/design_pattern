package com.hx.designpattern.demo02;

/**
 * Created by Minghua Chen on 2019/3/12.
 * add jxust-nc
 */
public class ProxySearcher implements Searcher {

    //持有RealSearcher的引用
    private  RealSearcher realSearcher=new RealSearcher();

    private AccessValidator validator;

    private Logger logger;

    @Override
    public String doSearch(String userId, String keyWord) {
        if (this.validator(userId)) {
            String result = realSearcher.doSearch(userId, keyWord);
            this.log(userId);
            return result;
        } else {
            return null;
        }

    }

    public boolean validator(String userId) {
        validator=new AccessValidator();
        return  validator.validator(userId);
    }

    public void log(String userId) {
        logger=new Logger();
        logger.log(userId);
    }
}
