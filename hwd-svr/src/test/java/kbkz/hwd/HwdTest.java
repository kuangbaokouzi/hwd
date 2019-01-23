package kbkz.hwd;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import rebue.wheel.OkhttpUtils;

public class HwdTest {

	private String hostUrl = "http://127.0.0.1:20110/hwd/helloworld";

	/**
	 * 获取用户信息（通过用户ID）
	 * 
	 * @throws IOException
	 */
	public void getById() throws IOException {
		String id = "1";
		String url = hostUrl + "/getbyid";
		Map<String, Object> requestParams = new LinkedHashMap<>();
		requestParams.put("id", id);
		System.out.println(OkhttpUtils.get(url, requestParams));
	}
}
