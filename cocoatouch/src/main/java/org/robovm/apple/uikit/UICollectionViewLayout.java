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
package org.robovm.apple.uikit;

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
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICollectionViewLayout/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class UICollectionViewLayoutPtr extends Ptr<UICollectionViewLayout, UICollectionViewLayoutPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICollectionViewLayout.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UICollectionViewLayout() {}
    protected UICollectionViewLayout(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "collectionView")
    public native UICollectionView getCollectionView();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "invalidateLayout")
    public native void invalidateLayout();
    @Method(selector = "invalidateLayoutWithContext:")
    public native void invalidateLayout(UICollectionViewLayoutInvalidationContext context);
    @Method(selector = "registerClass:forDecorationViewOfKind:")
    public native void registerDecorationViewClass(ObjCClass viewClass, String decorationViewKind);
    @Method(selector = "registerNib:forDecorationViewOfKind:")
    public native void registerDecorationViewNib(UINib nib, String decorationViewKind);
    @Method(selector = "prepareLayout")
    public native void prepareLayout();
    @Method(selector = "layoutAttributesForElementsInRect:")
    public native NSArray<?> getLayoutAttributesForElements(@ByVal CGRect rect);
    @Method(selector = "layoutAttributesForItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes getLayoutAttributesForItem(NSIndexPath indexPath);
    @Method(selector = "layoutAttributesForSupplementaryViewOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes getLayoutAttributesForSupplementaryView(String kind, NSIndexPath indexPath);
    @Method(selector = "layoutAttributesForDecorationViewOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes getLayoutAttributesForDecorationView(String decorationViewKind, NSIndexPath indexPath);
    @Method(selector = "shouldInvalidateLayoutForBoundsChange:")
    public native boolean shouldInvalidateLayoutForBoundsChange(@ByVal CGRect newBounds);
    @Method(selector = "invalidationContextForBoundsChange:")
    public native UICollectionViewLayoutInvalidationContext getInvalidationContextForBoundsChange(@ByVal CGRect newBounds);
    @Method(selector = "targetContentOffsetForProposedContentOffset:withScrollingVelocity:")
    public native @ByVal CGPoint getTargetContentOffset(@ByVal CGPoint proposedContentOffset, @ByVal CGPoint velocity);
    @Method(selector = "targetContentOffsetForProposedContentOffset:")
    public native @ByVal CGPoint getTargetContentOffset(@ByVal CGPoint proposedContentOffset);
    @Method(selector = "collectionViewContentSize")
    public native @ByVal CGSize getCollectionViewContentSize();
    @Method(selector = "layoutAttributesClass")
    public static native ObjCClass getLayoutAttributesClass();
    @Method(selector = "invalidationContextClass")
    public static native ObjCClass getInvalidationContextClass();
    @Method(selector = "prepareForCollectionViewUpdates:")
    public native void prepareForCollectionViewUpdates(NSArray<UICollectionViewUpdateItem> updateItems);
    @Method(selector = "finalizeCollectionViewUpdates")
    public native void finalizeCollectionViewUpdates();
    @Method(selector = "prepareForAnimatedBoundsChange:")
    public native void prepareForAnimatedBoundsChange(@ByVal CGRect oldBounds);
    @Method(selector = "finalizeAnimatedBoundsChange")
    public native void finalizeAnimatedBoundsChange();
    @Method(selector = "prepareForTransitionToLayout:")
    public native void prepareForTransitionToLayout(UICollectionViewLayout newLayout);
    @Method(selector = "prepareForTransitionFromLayout:")
    public native void prepareForTransitionFromLayout(UICollectionViewLayout oldLayout);
    @Method(selector = "finalizeLayoutTransition")
    public native void finalizeLayoutTransition();
    @Method(selector = "initialLayoutAttributesForAppearingItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes getInitialLayoutAttributesForAppearingItem(NSIndexPath itemIndexPath);
    @Method(selector = "finalLayoutAttributesForDisappearingItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes getFinalLayoutAttributesForDisappearingItem(NSIndexPath itemIndexPath);
    @Method(selector = "initialLayoutAttributesForAppearingSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes getInitialLayoutAttributesForAppearingSupplementaryElement(String elementKind, NSIndexPath elementIndexPath);
    @Method(selector = "finalLayoutAttributesForDisappearingSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes getFinalLayoutAttributesForDisappearingSupplementaryElement(String elementKind, NSIndexPath elementIndexPath);
    @Method(selector = "initialLayoutAttributesForAppearingDecorationElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes getInitialLayoutAttributesForAppearingDecorationElement(String elementKind, NSIndexPath decorationIndexPath);
    @Method(selector = "finalLayoutAttributesForDisappearingDecorationElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes getFinalLayoutAttributesForDisappearingDecorationElement(String elementKind, NSIndexPath decorationIndexPath);
    @Method(selector = "indexPathsToDeleteForSupplementaryViewOfKind:")
    public native NSArray<NSIndexPath> getIndexPathsToDeleteForSupplementaryView(String kind);
    @Method(selector = "indexPathsToDeleteForDecorationViewOfKind:")
    public native NSArray<NSIndexPath> getIndexPathsToDeleteForDecorationView(String kind);
    @Method(selector = "indexPathsToInsertForSupplementaryViewOfKind:")
    public native NSArray<NSIndexPath> getIndexPathsToInsertForSupplementaryView(String kind);
    @Method(selector = "indexPathsToInsertForDecorationViewOfKind:")
    public native NSArray<NSIndexPath> getIndexPathsToInsertForDecorationView(String kind);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    /*</methods>*/
}
