package com.lw.common.constant;

import java.util.Arrays;
import java.util.List;

/**
 * 系统运行时的常量
 * @author wenLiu
 *
 */
public class RuntimeConstant {

	// 拦截器无需拦截的url      Arrays.asList：字符串数组转化为List
	public static List<String> loginExcludePathPatterns = Arrays.asList(
			"/user/login",
			"/user/register",
			"/photo/view",
			"/doc.html",
			"/swagger-resources/**",
			"/swagger-ui.html/**",
			"/webjars/**",
			"/v2/api-docs"
	);

}
