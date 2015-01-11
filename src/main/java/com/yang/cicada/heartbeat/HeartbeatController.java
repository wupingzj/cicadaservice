package com.yang.cicada.heartbeat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartbeatController {
	private static final String template = "Hello, %s!!!";

	@RequestMapping("/heartbeat")
	public HeartBeat greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new HeartBeat(ServiceStatus.OK, String.format(template, name));
	}
}
