/*
 * Copyright 2014-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.dianrong.rabbit.constant;

/**
 * @author liushiming
 * @version RabbitConstant.java, v 0.0.1 2017年6月26日 下午1:25:51 liushiming
 * @since JDK 1.8
 */
public class RabbitConstant {

  public static final String DEFAULT_DEADLETTEREXCHANGE_NAME = "DeadLetterExchange";

  public static final String DEFAULT_DELAY_QUEUENAME_PREFIX = "_delay";

  public static final String DEFAULT_RETRY_QUEUENAME_PREFIX = "_retry";

  public static final String X_EXCEPTION_STACKTRACE = "x-exception-stacktrace";

  public static final String X_REPUBLISH_TIMES = "x-republish-times";


}
