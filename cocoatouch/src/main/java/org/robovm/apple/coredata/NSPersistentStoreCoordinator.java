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
package org.robovm.apple.coredata;

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
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("CoreData") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSPersistentStoreCoordinator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSLocking/*</implements>*/ {

    /*<ptr>*/public static class NSPersistentStoreCoordinatorPtr extends Ptr<NSPersistentStoreCoordinator, NSPersistentStoreCoordinatorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSPersistentStoreCoordinator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSPersistentStoreCoordinator() {}
    protected NSPersistentStoreCoordinator(SkipInit skipInit) { super(skipInit); }
    public NSPersistentStoreCoordinator(NSManagedObjectModel model) { super((SkipInit) null); initObject(initWithManagedObjectModel$(model)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="NSPersistentStoreSaveConflictsErrorKey", optional=true)
    public static native NSString KeySaveConflictsError();
    @GlobalValue(symbol="NSSQLiteStoreType", optional=true)
    public static native String StoreTypeSQLite();
    @GlobalValue(symbol="NSXMLStoreType", optional=true)
    public static native String StoreTypeXML();
    @GlobalValue(symbol="NSBinaryStoreType", optional=true)
    public static native String StoreTypeBinary();
    @GlobalValue(symbol="NSInMemoryStoreType", optional=true)
    public static native String StoreTypeInMemory();
    @GlobalValue(symbol="NSStoreTypeKey", optional=true)
    public static native NSString KeyStoreType();
    @GlobalValue(symbol="NSStoreUUIDKey", optional=true)
    public static native NSString KeyStoreUUID();
    @GlobalValue(symbol="NSPersistentStoreCoordinatorStoresWillChangeNotification", optional=true)
    public static native String NotificationStoresWillChange();
    @GlobalValue(symbol="NSPersistentStoreCoordinatorStoresDidChangeNotification", optional=true)
    public static native String NotificationStoresDidChange();
    @GlobalValue(symbol="NSPersistentStoreCoordinatorWillRemoveStoreNotification", optional=true)
    public static native String NotificationWillRemoveStore();
    @GlobalValue(symbol="NSAddedPersistentStoresKey", optional=true)
    public static native NSString KeyAddedPersistentStores();
    @GlobalValue(symbol="NSRemovedPersistentStoresKey", optional=true)
    public static native NSString KeyRemovedPersistentStores();
    @GlobalValue(symbol="NSUUIDChangedPersistentStoresKey", optional=true)
    public static native NSString KeyUUIDChangedPersistentStores();
    @GlobalValue(symbol="NSReadOnlyPersistentStoreOption", optional=true)
    public static native NSString KeyReadOnlyOption();
    @GlobalValue(symbol="NSValidateXMLStoreOption", optional=true)
    public static native NSString KeyValidateXMLStoreOption();
    @GlobalValue(symbol="NSPersistentStoreTimeoutOption", optional=true)
    public static native NSString KeyTimeoutOption();
    @GlobalValue(symbol="NSSQLitePragmasOption", optional=true)
    public static native NSString KeySQLitePragmasOption();
    @GlobalValue(symbol="NSSQLiteAnalyzeOption", optional=true)
    public static native NSString KeySQLiteAnalyzeOption();
    @GlobalValue(symbol="NSSQLiteManualVacuumOption", optional=true)
    public static native NSString KeySQLiteManualVacuumOption();
    @GlobalValue(symbol="NSIgnorePersistentStoreVersioningOption", optional=true)
    public static native NSString KeyIgnorePersistentStoreVersioningOption();
    @GlobalValue(symbol="NSMigratePersistentStoresAutomaticallyOption", optional=true)
    public static native NSString KeyMigratePersistentStoresAutomaticallyOption();
    @GlobalValue(symbol="NSInferMappingModelAutomaticallyOption", optional=true)
    public static native NSString KeyInferMappingModelAutomaticallyOption();
    @GlobalValue(symbol="NSStoreModelVersionHashesKey", optional=true)
    public static native NSString KeyModelVersionHashes();
    @GlobalValue(symbol="NSStoreModelVersionIdentifiersKey", optional=true)
    public static native NSString KeyModelVersionIdentifiers();
    @GlobalValue(symbol="NSPersistentStoreOSCompatibility", optional=true)
    public static native NSString KeyOSCompatibility();
    @GlobalValue(symbol="NSPersistentStoreUbiquitousContentNameKey", optional=true)
    public static native NSString KeyUbiquitousContentName();
    @GlobalValue(symbol="NSPersistentStoreUbiquitousContentURLKey", optional=true)
    public static native NSString KeyUbiquitousContentURL();
    @GlobalValue(symbol="NSPersistentStoreDidImportUbiquitousContentChangesNotification", optional=true)
    public static native String NotificationDidImportUbiquitousContentChanges();
    @GlobalValue(symbol="NSPersistentStoreUbiquitousTransitionTypeKey", optional=true)
    public static native NSString KeyUbiquitousTransitionType();
    @GlobalValue(symbol="NSPersistentStoreUbiquitousPeerTokenOption", optional=true)
    public static native NSString KeyUbiquitousPeerTokenOption();
    @GlobalValue(symbol="NSPersistentStoreRemoveUbiquitousMetadataOption", optional=true)
    public static native NSString KeyRemoveUbiquitousMetadataOption();
    @GlobalValue(symbol="NSPersistentStoreUbiquitousContainerIdentifierKey", optional=true)
    public static native NSString KeyUbiquitousContainerIdentifier();
    @GlobalValue(symbol="NSPersistentStoreRebuildFromUbiquitousContentOption", optional=true)
    public static native NSString KeyRebuildFromUbiquitousContentOption();
    @GlobalValue(symbol="NSPersistentStoreFileProtectionKey", optional=true)
    public static native NSString KeyFileProtection();
    
    @Method(selector = "setMetadata:forPersistentStore:")
    public native void setMetadata$forPersistentStore$(NSDictionary<?, ?> metadata, NSPersistentStore store);
    @Method(selector = "metadataForPersistentStore:")
    public native NSDictionary<?, ?> metadataForPersistentStore$(NSPersistentStore store);
    @Method(selector = "initWithManagedObjectModel:")
    protected native @Pointer long initWithManagedObjectModel$(NSManagedObjectModel model);
    @Method(selector = "managedObjectModel")
    public native NSManagedObjectModel managedObjectModel();
    @Method(selector = "persistentStores")
    public native NSArray<?> persistentStores();
    @Method(selector = "persistentStoreForURL:")
    public native NSPersistentStore persistentStoreForURL$(NSURL URL);
    @Method(selector = "URLForPersistentStore:")
    public native NSURL URLForPersistentStore$(NSPersistentStore store);
    @Method(selector = "setURL:forPersistentStore:")
    public native boolean setURL$forPersistentStore$(NSURL url, NSPersistentStore store);
    @Method(selector = "addPersistentStoreWithType:configuration:URL:options:error:")
    public native NSPersistentStore addPersistentStoreWithType$configuration$URL$options$error$(String storeType, String configuration, NSURL storeURL, NSDictionary<?, ?> options, NSError.NSErrorPtr error);
    @Method(selector = "removePersistentStore:error:")
    public native boolean removePersistentStore$error$(NSPersistentStore store, NSError.NSErrorPtr error);
    @Method(selector = "migratePersistentStore:toURL:options:withType:error:")
    public native NSPersistentStore migratePersistentStore$toURL$options$withType$error$(NSPersistentStore store, NSURL URL, NSDictionary<?, ?> options, String storeType, NSError.NSErrorPtr error);
    @Method(selector = "managedObjectIDForURIRepresentation:")
    public native NSManagedObjectID managedObjectIDForURIRepresentation$(NSURL url);
    @Method(selector = "executeRequest:withContext:error:")
    public native NSObject executeRequest$withContext$error$(NSPersistentStoreRequest request, NSManagedObjectContext context, NSError.NSErrorPtr error);
    @Method(selector = "lock")
    public native void lock();
    @Method(selector = "unlock")
    public native void unlock();
    @Method(selector = "tryLock")
    public native boolean tryLock();
    @Method(selector = "registeredStoreTypes")
    public static native NSDictionary<?, ?> registeredStoreTypes();
    @Method(selector = "registerStoreClass:forStoreType:")
    public static native void registerStoreClass$forStoreType$(ObjCClass storeClass, String storeType);
    @Method(selector = "metadataForPersistentStoreOfType:URL:error:")
    public static native NSDictionary<?, ?> metadataForPersistentStoreOfType$URL$error$(String storeType, NSURL url, NSError.NSErrorPtr error);
    @Method(selector = "setMetadata:forPersistentStoreOfType:URL:error:")
    public static native boolean setMetadata$forPersistentStoreOfType$URL$error$(NSDictionary<?, ?> metadata, String storeType, NSURL url, NSError.NSErrorPtr error);
    @Method(selector = "removeUbiquitousContentAndPersistentStoreAtURL:options:error:")
    public static native boolean removeUbiquitousContentAndPersistentStoreAtURL$options$error$(NSURL storeURL, NSDictionary<?, ?> options, NSError.NSErrorPtr error);
    /*</methods>*/
}
