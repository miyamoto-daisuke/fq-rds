/*
 * Copyright 2013 Classmethod, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package jp.classmethod.aws.petrucci;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@SuppressWarnings("javadoc")
public class Tasks {
	
	private static Logger logger = LoggerFactory.getLogger(Tasks.class);
	
	
	@Scheduled(cron = "* * * * * *")
	public void timeKeeper() {
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		logger.info(df.format(new Date()));
	}
}
