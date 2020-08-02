/**
 * 
 */
package com.haochang.common.api;

import lombok.Data;

import java.util.Map;

/**
 * 存储认证信息
**/
@Data
public class TokenInfo {

	private String access_token;

	private String token_type;

	private String refresh_token;
	
	private String scope;
	
	private Map<String,String> additionalInfo;
 	
}
