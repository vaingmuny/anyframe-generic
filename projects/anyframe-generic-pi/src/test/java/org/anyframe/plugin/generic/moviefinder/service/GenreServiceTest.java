/*
 * Copyright 2008-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.anyframe.plugin.generic.moviefinder.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.anyframe.datatype.SearchVO;
import org.anyframe.generic.service.GenericService;
import org.anyframe.plugin.generic.domain.GenericGenre;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * This GenreServiceTest class is a Test Case class for GenreService.
 * 
 * @author Hyunjung Jeong
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/spring/context-*.xml" })
public class GenreServiceTest {

	@Inject
	@Named("genericGenreService")
	private GenericService<GenericGenre, String> genericGenreService;

	@Test
	public void testGenreGetList() throws Exception {
		SearchVO searchVO = new SearchVO();
		List list = genericGenreService.getList(searchVO);

		Assert.assertEquals(10, list.size());
	}
}
