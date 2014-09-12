/*
 * Copyright 2013 eXo Platform SAS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.exoplatform.addons.jvmconsole;

import juzu.Path;
import juzu.Response;
import juzu.View;
import org.exoplatform.addons.jvmconsole.service.MockService;

import javax.inject.Inject;
import java.io.IOException;

public class Controller {

  @Inject
  @Path("index.gtmpl")
  org.exoplatform.addons.jvmconsole.templates.index index;

  @View
  public Response.Content index() throws IOException {
    return index.with()
        .name(MockService.getApplicationName())
        .ok();
  }
}
