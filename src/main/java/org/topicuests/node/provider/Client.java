/*
 * Copyright 2017, TopicQuests
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package org.topicuests.node.provider;

import java.util.*;
import org.topicquests.support.ResultPojo;
import org.topicquests.support.api.IResult;
import org.topicquests.support.util.LRUCache;

import net.minidev.json.JSONObject;

/**
 * @author park
 *
 */
public class Client {
	private ProviderEnvironment environment;
	// cache for freshly indexed or updated (reindexed) nodes
	private LRUCache objectCache;
	//NOTE we support just one type
	private final String _TYPE = "core";
	
	/**
	 * 
	 */
	public Client(ProviderEnvironment env) {
		environment = env;
		objectCache = new LRUCache(1024); //That should be enough to buy time
		//TODO
	}

	public Client(ProviderEnvironment env, String index, JSONObject mappings) {
		//TODO
		
	}
	
	///////////////////////
	// API
	//////////////////////
	
	/**
	 * Index <code>object</code>
	 * @param id
	 * @param index
	 * @param object
	 * @param type
	 * @return
	 */
	public IResult indexNode(String id, String index, JSONObject object) {
		IResult result = new ResultPojo();
		//TODO
		return result;
	}
	
	public IResult updateFullNode(String id, String index, JSONObject object, boolean checkVersion) {
		IResult result = new ResultPojo();
		//TODO
		return result;
	}
	
	/**
	 * <p>Update an already-indexed node</p>
	 * <p>NOTE: <code>object</code> is <em>not</em> a full document.
	 * Rather, it is a change script.</p>
	 * <p> IF <code>checkVersion</code> is <code>true</code>, <code>object</code>
	 * <em>must include</code> the new version value</p>
	 * @see https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-update.html
	 * @param id
	 * @param index
	 * @param object is a script, not a document
	 * @return
	 */
	public IResult partialUpdateNode(String id, String index, JSONObject object) {
		IResult result = new ResultPojo();
		//TODO
		return result;
	}

	
	/**
	 * Delete a node identified by <code>id</code>
	 * @param id
	 * @param index
	 * @return
	 */
	public IResult deleteNode(String id, String index) {
		IResult result = new ResultPojo();
		//TODO
		return result;
	}

	
	/**
	 * Returns <code>true</code> if node identified by <code>id</code> is found
	 * @param id
	 * @param index
	 * @return
	 */
	public IResult existsNode(String id, String index) {
		IResult result = new ResultPojo();
		//TODO
		return result;
	}

	
	/**
	 * Fetch a node identified by <code>id</code> and return it
	 * as a {@link JSONObject}
	 * @param id
	 * @param index
	 * @return can return a <code>null</code>result
	 */
	public IResult getNodeAsJSONObject(String id, String index) {
		IResult result = new ResultPojo();
		//TODO
		return result;
	}

	/**
	 * Fetch a collection of nodes as identified by <code>locators</code>
	 * @param locators
	 * @param index
	 * @return List<JSONObject> or null;
	 */
	public IResult multiGetNodes(List<String>locators, String index) {
		IResult result = new ResultPojo();
		//TODO
		return result;
	}

	/**
	 * Perform a search on a list of query strings
	 * @param query
	 * @param index
	 * @return
	 */
	public IResult multiSearchNodes(List<String> query, String index) {
		IResult result = new ResultPojo();
		//TODO
		return result;
	}

	
	/**
	 * Returns Double or -1 if error
	 * @param query
	 * @param index
	 * @return
	 */
	public IResult count(String query, String index) {
		IResult result = new ResultPojo();
		//TODO
		return result;
	}

	
	public IResult fetchNodeFromQuery(String query, String index) {
		IResult result = new ResultPojo();
		//TODO
		return result;
	}

	
	/**
	 * 
	 * @param query
	 * @return can return either a <code>List<JSONObject></code> or <code>null</code>
	 */
	public IResult listObjectsByQuery(String  query, String index) {
		IResult result = new ResultPojo();
		//TODO
		return result;
	}

	
	public IResult refresh() {
		IResult result = new ResultPojo();
		//TODO
		return result;
	}

	public void clearCache() {
		this.objectCache.clear();
	}

}
