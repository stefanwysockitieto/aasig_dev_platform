// Copyright (C) 2020 TietoEVRY
// This Source Code Form is subject to the terms of the Mozilla Public
// License, v. 2.0. If a copy of the MPL was not distributed with this
// file, You can obtain one at http://mozilla.org/MPL/2.0/.

package com.genivi.vss.vssservice;

import android.content.Intent;

public class VSS {
    public static final String PERMISSION_VSS_GROUP_A = "com.genivi.vss.vssservice.PERMISSION_GROUP_A";
    public static final String PERMISSION_VSS_GROUP_B = "com.genivi.vss.vssservice.PERMISSION_GROUP_B";

    public static final String PROPERTY_GROUP_A_PROP1 = "com.genivi.vss.property.groupA.prop1";
    public static final String PROPERTY_GROUP_B_PROP2 = "com.genivi.vss.property.groupB.prop2";

    public static final Intent VSS_SERVICE_INTENT = new Intent("com.genivi.vss.vssservice.VSSService").setPackage("com.genivi.vss.vssservice");
}
