/*
 * Copyright 2000-2018 Vaadin Ltd.
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
package org.springframework.samples.webcomponent;

import com.vaadin.flow.component.WebComponent;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.webcomponent.WebComponentProperty;

@WebComponent("owner-form")
public class OwnerForm extends Div {

    private WebComponentProperty<Boolean> show = new WebComponentProperty<>(
            false, Boolean.class);

    private Span message = new Span();

    public OwnerForm() {
        message.setText("Owner form");
        add(message);
    }

}
