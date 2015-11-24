/*
 * Copyright 2014-2015 CyberVision, Inc.
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

package org.kaaproject.kaa.server.admin.client.mvp.view.widget;

import com.google.gwt.text.shared.Renderer;
import com.google.gwt.user.client.ui.ValueListBox;
import org.kaaproject.kaa.common.dto.ProfileSchemaDto;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ServerProfileSchemasInfoListBox extends ValueListBox<ProfileSchemaDto> {

    public ServerProfileSchemasInfoListBox() {
        super(new ServerProfileSchemaInfoRender());
    }

    public void reset() {
        List<ProfileSchemaDto> emptyList = Collections.emptyList();
        setValue(null);
        setAcceptableValues(emptyList);
    }

    static class ServerProfileSchemaInfoRender implements Renderer<ProfileSchemaDto> {

        @Override
        public String render(ProfileSchemaDto dto) {
            return dto !=null ? (dto.getName()) : "";
        }

        @Override
        public void render(ProfileSchemaDto dto, Appendable appendable) throws IOException {
            appendable.append(render(dto));
        }
    }
}
