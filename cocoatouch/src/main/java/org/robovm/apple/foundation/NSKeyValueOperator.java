/*
 * Copyright (C) 2014 Trillian Mobile AB
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
package org.robovm.apple.foundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.security.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("Foundation")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NSKeyValueOperator/*</name>*/ 
    extends /*<extends>*/Object/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(NSKeyValueOperator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="NSAverageKeyValueOperator", optional=true)
    public static native String Average();
    @GlobalValue(symbol="NSCountKeyValueOperator", optional=true)
    public static native String Count();
    @GlobalValue(symbol="NSDistinctUnionOfArraysKeyValueOperator", optional=true)
    public static native String DistinctUnionOfArrays();
    @GlobalValue(symbol="NSDistinctUnionOfObjectsKeyValueOperator", optional=true)
    public static native String DistinctUnionOfObjects();
    @GlobalValue(symbol="NSDistinctUnionOfSetsKeyValueOperator", optional=true)
    public static native String DistinctUnionOfSets();
    @GlobalValue(symbol="NSMaximumKeyValueOperator", optional=true)
    public static native String Maximum();
    @GlobalValue(symbol="NSMinimumKeyValueOperator", optional=true)
    public static native String Minimum();
    @GlobalValue(symbol="NSSumKeyValueOperator", optional=true)
    public static native String Sum();
    @GlobalValue(symbol="NSUnionOfArraysKeyValueOperator", optional=true)
    public static native String UnionOfArrays();
    @GlobalValue(symbol="NSUnionOfObjectsKeyValueOperator", optional=true)
    public static native String UnionOfObjects();
    @GlobalValue(symbol="NSUnionOfSetsKeyValueOperator", optional=true)
    public static native String UnionOfSets();
    /*</methods>*/
}
