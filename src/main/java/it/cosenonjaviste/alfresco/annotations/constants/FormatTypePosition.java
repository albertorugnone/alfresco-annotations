/*
 * Copyright 2002-2015 the original author or authors.
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
package it.cosenonjaviste.alfresco.annotations.constants;

/**
 * Where resource type is specified in URI.
 *
 * More details on <a href="https://wiki.alfresco.com/wiki/Web_Scripts#Creating_a_Description_Document">Anfresco Wiki</a>
 *
 * @author Andrea Como
 */
public enum FormatTypePosition {

    /**
     * The content-type is specified via the format query string parameter,
     * for example <pre>/helloworld?to=dave&amp;format=xml</pre>
     */
    ARGUMENT,

    /**
     * The content-type is specified via the URI extension, for example <pre>/hello/world.xml?to=dave</pre>
     */
    EXTENSION,

    /**
     * Defualt value. Either of the above can be used
     */
    ANY;

    public String toString() {
        return this.name().toLowerCase();
    }
}
