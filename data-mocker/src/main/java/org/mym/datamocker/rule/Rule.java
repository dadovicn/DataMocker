package org.mym.datamocker.rule;

/**
 * Copyright 2017 Muyangmin
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * <p>
 * An entity class for constraint rules.
 * <p>
 * Created by Muyangmin on 3/27/17.
 */
public class Rule {

    public final String affectField;
    public final Class affectClz;
    public final ConstraintVerb constraint;
    public final Object args;

    /**
     *
     * @param affectField can be null only if affectClz is not null.
     * @param affectClz can be null only if affectField is not null.
     * @param constraint can not be null.
     * @param args should fit constraint verb args type.
     */
    public Rule(String affectField, Class affectClz, ConstraintVerb constraint, Object args) {
        this.affectField = affectField;
        this.affectClz = affectClz;
        this.constraint = constraint;
        this.args = args;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "affectField='" + affectField + '\'' +
                ", affectClz=" + affectClz +
                ", constraint=" + constraint +
                ", args=" + args +
                '}';
    }
}