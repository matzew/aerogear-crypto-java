/**
 * Copyright 2013 Bruno Oliveira, and individual contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.abstractj.crypto;

public enum BlockMode {

    GCM("GCM", Padding.NONE),
    CBC("CBC", Padding.PKCS7);

    private final Padding padding;
    private String mode;

    private BlockMode(String mode, Padding padding) {
        this.mode = mode;
        this.padding = padding;
    }

    @Override
    public String toString() {
        return String.format("%s/%s", mode, padding);
    }
}
