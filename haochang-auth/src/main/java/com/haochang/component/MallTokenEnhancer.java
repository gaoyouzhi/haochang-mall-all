package com.haochang.component;

import com.haochang.mall.domain.MemberDetails;
import com.haochang.model.UmsMember;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义
 */
@Configuration
public class MallTokenEnhancer implements TokenEnhancer {

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {
        MemberDetails memberDetails = (MemberDetails) oAuth2Authentication.getPrincipal();

        UmsMember umsMember = memberDetails.getUmsMember();
        final Map<String, Object> additionalInfo = new HashMap<>();
        final Map<String, Object> retMap = new HashMap<>();

        //暴露memberId 到jwt令牌桶中
        additionalInfo.put("memberId", umsMember.getId());
        additionalInfo.put("nickName", umsMember.getNickname());
        additionalInfo.put("integration", umsMember.getIntegration());

        retMap.put("additionalInfo", additionalInfo);

        ((DefaultOAuth2AccessToken)oAuth2AccessToken).setAdditionalInformation(additionalInfo);
        return oAuth2AccessToken;
    }
}
