package com.pkgs.mod2;

import com.pkgs.api.service.ApiService;
import com.pkgs.api.util.DateUtil;

/**
 * TODO:
 *
 * <p>
 *
 * @author cs12110 create at 2019-03-30 13:51
 * <p>
 * @since 1.0.0
 */
public class Mod2ApiServiceImpl implements ApiService<String, String> {

    @Override
    public String dealWith(String param) {

        String className = this.getClass().getName();

        return DateUtil.format() + " - " + className + " : " + param;
    }
}
