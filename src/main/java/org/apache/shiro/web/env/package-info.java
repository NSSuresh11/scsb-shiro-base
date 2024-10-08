/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/**
 * Web-specific {@link org.apache.shiro.env.Environment Environment} implementation and support.  The most important
 * components are the {@link org.apache.shiro.web.env.EnvironmentLoader} and {@link org.apache.shiro.web.env.EnvironmentLoaderListener}, which are used in conjunction
 * with the {@link org.apache.shiro.web.servlet.ShiroFilter ShiroFilter} to enable Shiro in a web application.
 *
 * @see org.apache.shiro.web.env.EnvironmentLoaderListener
 * @see org.apache.shiro.web.env.EnvironmentLoader
 */
package org.apache.shiro.web.env;