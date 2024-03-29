/*
 * Copyright 2009 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.lotrepls.shared;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.lotrepls.shared.InterpreterType;
import com.google.lotrepls.shared.InterpreterException;

/**
 * This is the asynchronous version of the API provided by the backend.
 */
public interface LotREPLsApiAsync {
  void eval(InterpreterType type, String script, AsyncCallback<String> result)
      throws InterpreterException;
}
